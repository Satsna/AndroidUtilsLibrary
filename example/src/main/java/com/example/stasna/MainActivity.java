package com.example.stasna;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

import com.satsna.utils.glide.GlideUtil;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView iv=findViewById(R.id.iv);
        String url="http://i0.hdslb.com/bfs/archive/839b48daee6bed189d49aa6eac912b353ce0db3d.jpg";
        GlideUtil.load(this,url,iv);
//        GlideUtil.load(this,iv);

    }
}
