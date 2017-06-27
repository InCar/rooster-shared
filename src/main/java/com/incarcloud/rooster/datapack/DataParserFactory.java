package com.incarcloud.rooster.datapack;

/**
 * DataParser工厂
 *
 * @author Aaric, created on 2017-06-27T17:11.
 * @since 2.0
 */
public class DataParserFactory {

    private static volatile DataParserFactory _factory;

    private DataParserFactory() {}

    public static DataParserFactory create() {
        if(null == _factory) {
            synchronized (DataParserFactory.class) {
                if(null == _factory) {
                    _factory = new DataParserFactory();
                }
            }
        }
        return _factory;
    }

    public IDataParser register(String tag) {
        try {
            String pakage = "com.incarcloud.rooster.datapack";
            switch (tag) {
                case "china-landu-2.05":
                case "china-landu-3.08":
                    // LANDU协议解析器
                    return (IDataParser) Class.forName(String.format("%s.%s", pakage, "DataParserLandu")).newInstance();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
