package com.satsna.utils.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import java.io.File;

public class ImageUtils {

    /**
     * 刷新图片到相册
     *
     * @param context   上下文
     * @param photoFile File类型图片
     */
    public static void refreshMediaStore(Context context, File photoFile) {
        //这个广播的目的就是更新图库，发了这个广播进入相册就可以找到你保存的图片了！，记得要传你更新的file哦
        Intent intent = new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE);
        Uri uri = Uri.fromFile(photoFile);
        intent.setData(uri);
        context.sendBroadcast(intent);
    }
}
