package com.satsna.utils.glide;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.satsna.utils.R;
import com.satsna.utils.utils.StringUtil;

/**
 * Glide图片框架加载及加载失败配置
 */
public class GlideUtil {
    //这里面配置Glide的默认图片,前提是用Glide加载的时候用了这里的

    //默认加载图片
    public static int placeholder = R.mipmap.iv_default_loading;//加载中
    public static int error = R.mipmap.iv_default_fail;//加载失败
    public static int fallback = R.mipmap.iv_default_loading;

    public static RequestOptions requestOptions = new RequestOptions()
            .placeholder(placeholder)
            .error(error)
            .fallback(fallback);


    /**
     * 初始化
     *
     * @param placeholder 加载中显示的图片
     * @param error       加载失败显示的图片
     * @param fallback
     */
    public static void init(int placeholder, int error, int fallback) {
        GlideUtil.placeholder = placeholder;
        GlideUtil.error = error;
        GlideUtil.fallback = fallback;
    }

    public static void load(Context context, ImageView imageView) {
        Glide.with(context).load(error).into(imageView);
    }

    public static void load(Context context, Integer imageRes, ImageView imageView) {
        if (imageRes == null) {
            Glide.with(context).load(error).into(imageView);
        } else {
            Glide.with(context).load(imageRes).into(imageView);
        }

    }

    public static void load(Context context, String url, ImageView imageView) {
        if (StringUtil.isEmpty(url)) {
            load(context, imageView);
            return;
        }
        Glide.with(context).load(url).apply(getApply()).into(imageView);
    }

    /**
     * 加载图片
     *
     * @param context    上下文
     * @param url        图片路径
     * @param defaultImg 默认图片 placeHolder error fallBack 均为defaultImg
     * @param imageView  显示的ImageView控件
     */
    public static void load(Context context, String url, Integer defaultImg, ImageView imageView) {
        if (StringUtil.isEmpty(url)) {
            load(context, defaultImg, imageView);
            return;
        }
        Glide.with(context).load(url).apply(getApply(defaultImg)).into(imageView);
    }

    /**
     * 加载图片
     *
     * @param context     上下文
     * @param url         图片路径
     * @param placeHolder 加载中显示图片
     * @param error       加载失败显示图片
     * @param imageView   显示的ImageView控件
     */
    public static void load(Context context, String url, Integer placeHolder, Integer error, ImageView imageView) {
        if (StringUtil.isEmpty(url)) {
            load(context, error, imageView);
            return;
        }
        Glide.with(context).load(url).apply(getApply(placeHolder, error)).into(imageView);
    }

    /**
     * 加载图片
     *
     * @param context     上下文
     * @param url         图片路径
     * @param placeHolder 加载中显示图片
     * @param error       加载失败显示图片
     * @param fallBack    回调失败显示图片
     * @param imageView   显示的ImageView控件
     */
    public static void load(Context context, String url, Integer placeHolder, Integer error, Integer fallBack, ImageView imageView) {
        if (StringUtil.isEmpty(url)) {
            load(context, error, imageView);
            return;
        }
        Glide.with(context).load(url).apply(getApply(placeHolder, error, fallBack)).into(imageView);
    }

    /**
     * 获取加载中 加载失败 默认配置
     * 无自定义默认图片时使用单一对象requestOptions,节省内存
     *
     * @return 默认配置RequestOptions
     */
    public static RequestOptions getApply() {
        if (requestOptions == null) {
            requestOptions = new RequestOptions()
                    .placeholder(placeholder)
                    .error(error)
                    .fallback(fallback);
        }
        return requestOptions;
    }

    /**
     * 获取加载中 加载失败 默认配置
     *
     * @param defaultImg 默认图片 placeHolder error fallBack 均为defaultImg
     * @return 默认配置RequestOptions
     */
    public static RequestOptions getApply(Integer defaultImg) {
        return getApply(defaultImg, defaultImg, defaultImg);
    }

    /**
     * 获取加载中 加载失败 默认配置
     *
     * @return 默认配置RequestOptions
     */
    public static RequestOptions getApply(Integer placeHolder, Integer error) {
        return getApply(placeHolder, error, null);
    }

    /**
     * 获取加载中 加载失败 默认配置
     *
     * @return 默认配置RequestOptions
     */
    public static RequestOptions getApply(Integer placeHolder, Integer error, Integer fallBack) {

        if (placeHolder == null) placeHolder = GlideUtil.placeholder;
        if (error == null) error = GlideUtil.error;
        if (fallBack == null) fallBack = GlideUtil.fallback;

        RequestOptions requestOptions = new RequestOptions()
                .placeholder(placeHolder)
                .error(error)
                .fallback(fallBack);
        return requestOptions;
    }

}
