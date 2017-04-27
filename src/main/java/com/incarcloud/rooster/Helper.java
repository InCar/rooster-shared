package com.incarcloud.rooster;

public class Helper {

    // 格式化异常的辅助方法,异常不会过于频繁的抛出,所以共享了一个StringBuilder对象
    private static StringBuilder s_sbStackTrace;
    public static synchronized String printStackTrace(Exception ex){
        if(s_sbStackTrace == null) s_sbStackTrace = new StringBuilder();

        Throwable exx = ex;
        while(exx != null){
            s_sbStackTrace.append("\n    ");
            s_sbStackTrace.append(exx.toString());
            for(StackTraceElement e: exx.getStackTrace()){
                s_sbStackTrace.append("\n        ");
                s_sbStackTrace.append(e.toString().trim());
            }
            exx = exx.getCause();
        }
        String result = s_sbStackTrace.toString();
        // clear to next using
        s_sbStackTrace.delete(0, s_sbStackTrace.length());
        return result;
    }
}
