package com.satsna.utils.picasso;


import com.satsna.utils.R;
import com.satsna.utils.glide.GlideUtil;

public class PicassoUtil {
    //默认加载图片
    //这里面配置Picasso的默认图片,前提是用Picasso加载的时候用了这里的
    public static int placeholder= R.mipmap.iv_default_loading;//加载中
    public static int error=R.mipmap.iv_default_fail;//加载失败
    public static int head=R.mipmap.iv_default_head;//头像

    /**
     * 初始化
     *
     * @param placeholder 加载中显示的图片
     * @param error       加载失败显示的图片
     * @param head 头像默认图像
     */
    public static void init(int placeholder, int error, int head) {
        PicassoUtil.placeholder = placeholder;
        PicassoUtil.error = error;
        PicassoUtil.head = head;
    }
}

