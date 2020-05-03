package com.satsna.utils.utils;

import android.content.Context;
import android.widget.Toast;

public class ToastUtil {
    public static Toast toast = null;

    /**
     * 显示长Toast
     * @param context
     * @param text
     */
    public static void longshow(Context context, String text) {
        if (toast == null) {
            toast = Toast.makeText(context.getApplicationContext(), text, Toast.LENGTH_LONG);
        } else {
            toast.setText(text);
        }
        toast.show();
    }

    /**
     * 显示长Toast
     * @param context
     * @param resId
     */
    public static void longshow(Context context, int resId) {
        if (toast == null) {
            toast = Toast.makeText(context.getApplicationContext(), resId, Toast.LENGTH_LONG);
        } else {
            toast.setText(resId);
        }
        toast.show();
    }

    /**
     * 显示短Toast
     * @param context
     * @param text
     */
    public static void shortshow(Context context, String text) {
        if (toast == null) {
            toast = Toast.makeText(context.getApplicationContext(), text, Toast.LENGTH_SHORT);
        } else {
            toast.setText(text);
        }
        toast.show();
    }

    /**
     * 显示短Toast
     * @param context
     * @param resId
     */
    public static void shortshow(Context context, int resId) {
        if (toast == null) {
            toast = Toast.makeText(context.getApplicationContext(), resId, Toast.LENGTH_SHORT);
        } else {
            toast.setText(resId);
        }
        toast.show();
    }
}
