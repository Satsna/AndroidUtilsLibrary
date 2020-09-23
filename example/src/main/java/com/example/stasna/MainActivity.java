package com.example.stasna;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;

import com.satsna.utils.utils.ToastUtil;

public class MainActivity extends Activity {
    public String tag = getClass().getSimpleName();
    public Context context = this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToastUtil.setGravity(Gravity.CENTER);

    }

    public void test(View v) {
        ToastUtil.shortshow(context, "吐司");
    }
}
