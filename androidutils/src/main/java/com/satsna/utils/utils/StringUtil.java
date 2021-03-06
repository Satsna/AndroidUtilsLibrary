package com.satsna.utils.utils;

import java.text.DecimalFormat;

/**
 * 针对不同项目单独开发的工具
 * <p>
 * Created by lifel on 2016/12/9.
 */

public class StringUtil {
    private static DecimalFormat decimalFormat = new DecimalFormat("#.#");


    /**
     * 判断是否为null,如果为null则返回--.不为null则原样返回
     *
     * @param str 需要判断的字符串
     * @return
     */
    public static String ifNUll(String str) {
        if (null == str || 0 == str.length()) {
            return "--";
        } else {
            return str;
        }
    }


    /**
     * 判断是否为null,如果为null则返回--.不为null则原样返回
     *
     * @param str 需要判断的字符串
     * @return
     */
    public static String ifNUll(String str, String defaulstStr) {
        if (null == str || 0 == str.length()) {
            return defaulstStr;
        } else {
            return str;
        }
    }


    /**
     * 判断字符串是否为空
     * @param str
     * @return
     */
    public static boolean isEmpty(String str) {
        if (null == str || 0 == str.length()) {
            return true;
        }
        return false;
    }

    /**
     * 格式化数字,自动返回万/亿的数据.保留一位小数
     *
     * @param number
     * @return
     */
    public static String getFormatNumber(int number) {
        if (number < 10000) {
            return decimalFormat.format(number);
        } else if (number < 100000000) {
            return decimalFormat.format(number / 10000) + "万";
        } else {
            return decimalFormat.format(number / 100000000) + "亿";
        }
    }

    /**
     * 格式化数字,自动返回万/亿的数据.保留一位小数
     *
     * @param number
     * @return
     */
    public static String getFormatNumber(long number) {
        if (number < 10000) {
            return decimalFormat.format(number);
        } else if (number < 100000000) {
            return decimalFormat.format(number / 10000) + "万";
        } else {
            return decimalFormat.format(number / 100000000) + "亿";
        }
    }

    /**
     * 格式化数字,自动返回万/亿的数据.保留一位小数
     *
     * @param number
     * @return
     */
    public static String getFormatNumber(double number) {
        if (number < 10000) {
            return decimalFormat.format(number);
        } else if (number < 100000000) {
            return decimalFormat.format(number / 10000) + "万";
        } else {
            return decimalFormat.format(number / 100000000) + "亿";
        }
    }

}
