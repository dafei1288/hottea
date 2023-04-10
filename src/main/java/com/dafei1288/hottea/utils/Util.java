package com.dafei1288.hottea.utils;

public class Util {
    public static boolean isNumber(Class clazz){
        boolean tag = false;

        if(Integer.class.equals(clazz) || Float.class.equals(clazz) || Double.class.equals(clazz) ){
            tag = true;
        }

        return tag;
    }
}
