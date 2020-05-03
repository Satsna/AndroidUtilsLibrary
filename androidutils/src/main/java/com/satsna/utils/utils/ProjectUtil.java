package com.satsna.utils.utils;

import java.text.DecimalFormat;

/**
 * 针对不同项目单独开发的工具
 * <p>
 * Created by lifel on 2016/12/9.
 */

public class ProjectUtil {
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
     * 判断是否为null,如果为null则返回指定的默认值.不为null则原样返回
     *
     * @param str 需要判断的字符串
     * @return
     */
    public static String ifNUll(String str, String defaultStr) {
        if (null == str || 0 == str.length()) {
            if (defaultStr == null) {
                throw new RuntimeException("默认值不能为空");
            }
            return defaultStr;
        } else {
            return str;
        }
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
