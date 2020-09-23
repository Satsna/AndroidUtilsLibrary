package com.example.stasna;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Environment;
import android.widget.ImageView;
import android.widget.TextView;

import com.blankj.utilcode.util.FileUtils;
import com.satsna.utils.glide.GlideUtil;
import com.satsna.utils.utils.ImageUtils;
import com.satsna.utils.utils.ToastUtil;

public class MainActivity extends Activity {
    public String tag = getClass().getSimpleName();
    public Context context = this;

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView iv = findViewById(R.id.iv);
        tv = findViewById(R.id.tv);

        String url = "http://i0.hdslb.com/bfs/archive/839b48daee6bed189d49aa6eac912b353ce0db3d.jpg";
        //获取图片扩展名
        String extension = "." + FileUtils.getFileExtension(url);
        String imagePath = Environment.getExternalStorageDirectory() + "/1test/图片/" + System.currentTimeMillis() + extension;
        ImageUtils.SaveImageFromNetListener listener = new ImageUtils.SaveImageFromNetListener() {
            @Override
            public void onSuccess(String urlStr, String savePath) {
                ToastUtil.shortshow(context, "保存成功");
                tv.setText("保存成功");
            }

            @Override
            public void onError(Exception e) {
                ToastUtil.shortshow(context, "保存失败");
                tv.setText("保存失败=" + e.getMessage());

            }
        };
        ImageUtils.saveFromNet(this, url, imagePath, listener);

    }
}
