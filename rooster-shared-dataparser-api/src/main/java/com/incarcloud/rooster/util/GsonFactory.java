package com.incarcloud.rooster.util;

import com.google.gson.*;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * 描述: 产生有相关配置的gson对象的工厂类<br/>
 * 主要解决了前台传过来的空白字符串(如age:""或age:" ")转换为日期或数字类型时抛出异常的麻烦， 现在遇到此情况，会转化为null但不抛出异常。
 * <p>
 * <pre>
 * Gson gson = GsonFactory.newInstance(&quot;yyyy-MM-dd HH:mm:ss&quot;).createGson();
 * Entity e = gson.fromJson(jsonStr, Entity.class);
 * </pre>
 * gson2.2.2
 *
 * @author fanbeibei
 * @since 2015年1月22日
 */
public class GsonFactory {
    private static GsonFactory factory;
    private GsonBuilder gsonBuilder = new GsonBuilder();

    private GsonFactory() {

    }

    private GsonBuilder getGsonBuilder() {
        return gsonBuilder;
    }

    /**
     * 创建有相关配置的gson对象
     *
     * @return
     * @author fanbeibei
     * @since 2015年1月22日
     */
    public Gson createGson() {
        return gsonBuilder.create();

    }


    /**
     * 默认的gson日期格式为yyyy-MM-dd
     *
     * @return
     * @author fanbeibei
     * @since 2015年1月22日
     */
    public static GsonFactory newInstance() {

        if (null == factory) {
            factory = new GsonFactory();
            factory.getGsonBuilder()
                    .registerTypeAdapter(Date.class, new DateAdapter("yyyy-MM-dd HH:mm:ss"))
                    .registerTypeAdapter(Integer.class, new IntegerAdapter())
                    .registerTypeAdapter(Long.class, new LongAdapter())
                    .registerTypeAdapter(Float.class, new FloatAdapter())
                    .registerTypeAdapter(Short.class, new ShortAdapter())
                    .registerTypeAdapter(Double.class, new DoubleAdapter())
                    .registerTypeAdapter(Boolean.class, new BooleanAdapter());
        }

        return factory;

    }

    /**
     * @param datePattern 日期格式
     * @return
     * @author fanbeibei
     * @since 2015年1月22日
     */
    public static GsonFactory newInstance(String datePattern) {
        GsonFactory factory = new GsonFactory();

        factory.getGsonBuilder()
                .registerTypeAdapter(Date.class, new DateAdapter(datePattern))
                .registerTypeAdapter(Integer.class, new IntegerAdapter())
                .registerTypeAdapter(Long.class, new LongAdapter())
                .registerTypeAdapter(Float.class, new FloatAdapter())
                .registerTypeAdapter(Short.class, new ShortAdapter())
                .registerTypeAdapter(Double.class, new DoubleAdapter())
                .registerTypeAdapter(Boolean.class, new BooleanAdapter());

        return factory;

    }


    /**
     * @param datePattern   日期格式
     * @param excludeFields 要排除的属性
     * @return
     * @author fanbeibei
     * @since 2015年1月22日
     */
    public static GsonFactory newInstance(String datePattern, String... excludeFields) {
        GsonFactory factory = new GsonFactory();

        Set<String> excludeSet = new HashSet<>(excludeFields.length);
        Collections.addAll(excludeSet, excludeFields);

        factory.getGsonBuilder()
                .registerTypeAdapter(Date.class, new DateAdapter(datePattern))
                .registerTypeAdapter(Integer.class, new IntegerAdapter())
                .registerTypeAdapter(Long.class, new LongAdapter())
                .registerTypeAdapter(Float.class, new FloatAdapter())
                .registerTypeAdapter(Short.class, new ShortAdapter())
                .registerTypeAdapter(Double.class, new DoubleAdapter())
                .registerTypeAdapter(Boolean.class, new BooleanAdapter())
                .addSerializationExclusionStrategy(
                        new ExclusionStrategy() {
                            @Override
                            public boolean shouldSkipField(FieldAttributes attr) {

                                return excludeSet.contains(attr.getName()) ? true
                                        : false;
                            }

                            @Override
                            public boolean shouldSkipClass(Class<?> clazz) {
                                return false;
                            }
                        });

        return factory;

    }


    /**
     * 描述: Integer类型转化器，空字符串转化为Integer时不会抛异常
     *
     * @author fanbeibei
     * @since 2015年1月15日
     */
    private static class IntegerAdapter extends TypeAdapter<Integer> {

        @Override
        public void write(JsonWriter out, Integer value) throws IOException {
            if (null == value) {
                out.nullValue();
                return;
            }

            out.value(value);

        }

        @Override
        public Integer read(JsonReader in) throws IOException {
            if (in.peek() == JsonToken.NULL) {
                in.nextNull();
                return null;
            }
            String val = in.nextString();
            if (null != val && !"".equals(val.trim())) {
                return Integer.parseInt(val);
            }

            return null;
        }

    }

    private static class ShortAdapter extends TypeAdapter<Short> {

        @Override
        public void write(JsonWriter out, Short value) throws IOException {
            if (null == value) {
                out.nullValue();
                return;
            }

            out.value(value);

        }

        @Override
        public Short read(JsonReader in) throws IOException {
            if (in.peek() == JsonToken.NULL) {
                in.nextNull();
                return null;
            }
            String val = in.nextString();
            if (null != val && !"".equals(val.trim())) {
                return Short.parseShort(val);
            }

            return null;
        }

    }

    private static class DoubleAdapter extends TypeAdapter<Double> {

        @Override
        public void write(JsonWriter out, Double value) throws IOException {
            if (null == value) {
                out.nullValue();
                return;
            }

            out.value(value);

        }

        @Override
        public Double read(JsonReader in) throws IOException {
            if (in.peek() == JsonToken.NULL) {
                in.nextNull();
                return null;
            }
            String val = in.nextString();
            if (null != val && !"".equals(val.trim())) {
                return Double.parseDouble(val);
            }

            return null;
        }

    }

    private static class BooleanAdapter extends TypeAdapter<Boolean> {

        @Override
        public void write(JsonWriter out, Boolean value) throws IOException {
            if (null == value) {
                out.nullValue();
                return;
            }

            out.value(value);

        }

        @Override
        public Boolean read(JsonReader in) throws IOException {
            if (in.peek() == JsonToken.NULL) {
                in.nextNull();
                return null;
            }
            String val = in.nextString();
            if (null != val && !"".equals(val.trim())) {
                return Boolean.parseBoolean(val);
            }

            return null;
        }

    }

    private static class FloatAdapter extends TypeAdapter<Float> {

        @Override
        public void write(JsonWriter out, Float value) throws IOException {
            if (null == value) {
                out.nullValue();
                return;
            }

            out.value(value);

        }

        @Override
        public Float read(JsonReader in) throws IOException {
            if (in.peek() == JsonToken.NULL) {
                in.nextNull();
                return null;
            }
            String val = in.nextString();
            if (null != val && !"".equals(val.trim())) {
                return Float.parseFloat(val);
            }

            return null;
        }

    }

    private static class LongAdapter extends TypeAdapter<Long> {

        @Override
        public void write(JsonWriter out, Long value) throws IOException {
            if (null == value) {
                out.nullValue();
                return;
            }

            out.value(value);

        }

        @Override
        public Long read(JsonReader in) throws IOException {
            if (in.peek() == JsonToken.NULL) {
                in.nextNull();
                return null;
            }
            String val = in.nextString();
            if (null != val && !"".equals(val.trim())) {
                return Long.parseLong(val);
            }

            return null;
        }

    }

    private static class DateAdapter extends TypeAdapter<Date> {

        private String pattern;

        public DateAdapter(String pattern) {
            this.pattern = pattern;
        }

        @Override
        public void write(JsonWriter out, Date value) throws IOException {
            if (null == value) {
                out.nullValue();
                return;
            }

            DateFormat df = new SimpleDateFormat(pattern);
            out.value(df.format(value));

        }

        @Override
        public Date read(JsonReader in) throws IOException {
            if (in.peek() == JsonToken.NULL) {
                in.nextNull();
                return null;
            }
            String val = in.nextString();
            if (null != val && !"".equals(val.trim())) {
                DateFormat df = new SimpleDateFormat(pattern);
                try {
                    return df.parse(val);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }

            return null;
        }

    }

}
