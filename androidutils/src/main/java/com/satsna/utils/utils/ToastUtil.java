package com.satsna.utils.utils;

import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;

public class ToastUtil {
    public static Toast toast = null;
    private static int gravity = Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM;

    /**
     * 设置吐司位置
     *
     * @param gravity 位置
     */
    public static void setGravity(final int gravity) {
        ToastUtil.gravity = gravity;
    }


    /**
     * 显示长Toast
     *
     * @param context
     * @param text
     */
    public static void longshow(Context context, String text) {
        if (toast == null) {
            toast = Toast.makeText(context.getApplicationContext(), text, Toast.LENGTH_LONG);
            toast.setGravity(gravity, 0, 0);
        } else {
            toast.setText(text);
        }
        toast.show();
    }

    /**
     * 显示长Toast
     *
     * @param context
     * @param resId
     */
    public static void longshow(Context context, int resId) {
        if (toast == null) {
            toast = Toast.makeText(context.getApplicationContext(), resId, Toast.LENGTH_LONG);
            toast.setGravity(gravity, 0, 0);
        } else {
            toast.setText(resId);
        }
        toast.show();
    }

    /**
     * 显示短Toast
     *
     * @param context
     * @param text
     */
    public static void shortshow(Context context, String text) {
        if (toast == null) {
            toast = Toast.makeText(context.getApplicationContext(), text, Toast.LENGTH_SHORT);
            toast.setGravity(gravity, 0, 0);
        } else {
            toast.setText(text);
        }


        toast.show();
    }

    /**
     * 显示短Toast
     *
     * @param context
     * @param resId
     */
    public static void shortshow(Context context, int resId) {
        if (toast == null) {
            toast = Toast.makeText(context.getApplicationContext(), resId, Toast.LENGTH_SHORT);
            toast.setGravity(gravity, 0, 0);
        } else {
            toast.setText(resId);
        }
        toast.show();
    }
}
