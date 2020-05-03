package com.satsna.utils.utils;

import java.math.BigDecimal;

/**
 * 加减乘除计算
 * 解决double计算失真问题
 */
public class CalcUtil {

    /**
     * double转字符,避免科学计数法
     *
     * @param d
     * @return
     */
    public static String toString(double d) {
        BigDecimal bd = new BigDecimal(Double.toString(d));
        return bd.toString();
    }

    /**
     * float转字符,避免科学计数法
     *
     * @param d
     * @return
     */
    public static String toString(float d) {
        BigDecimal bd = new BigDecimal(Double.toString(d));
        return bd.toString();
    }

    /**
     * 提供精确的加法运算
     * @param v1 被加数
     * @param v2 加数
     * @return 两个参数的和
     */
    public static double add(double v1, double v2)
    {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.add(b2).doubleValue();
    }

    /**
     * 提供精确的减法运算
     * @param v1 被减数
     * @param v2 减数
     * @return 两个参数的差
     */
    public static double sub(double v1, double v2)
    {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.subtract(b2).doubleValue();
    }

    /**
     * 提供精确的乘法运算
     * @param v1 被乘数
     * @param v2 乘数
     * @return 两个参数的积
     */
    public static double mul(double v1, double v2)
    {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.multiply(b2).doubleValue();
    }

}
