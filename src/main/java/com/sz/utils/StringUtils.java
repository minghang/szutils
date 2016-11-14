package com.sz.utils;

/**
 * Created by liminghang on 11/14/16.
 */
public class StringUtils {

    public static String arrayToString(Object[] obj) {
        return arrayToString(obj, ", ");
    }


    public static String arrayToString(Object[] obj, String separator) {
        if (obj == null || separator == null) {
            return null;
        }

        StringBuilder sb = new StringBuilder("[");
        int length = obj.length;
        for (int i = 0; i < length - 1; i++) {
            sb.append(obj[i]).append(separator);
        }
        sb.append(obj[length - 1]).append("]");
        return sb.toString();

    }
}
