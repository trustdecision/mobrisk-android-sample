package cn.tongdun.mobrisk.demo;

import android.Manifest;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;


import cn.tongdun.mobrisk.demo.utils.HandlerUtils;


public class MainActivity extends AppCompatActivity {

    private TextView tvContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //The following permissions are not required to apply. You can apply for selective permissions according to business conditions
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            requestPermissions(new String[]{
                    Manifest.permission.ACCESS_FINE_LOCATION,
                    Manifest.permission.ACCESS_COARSE_LOCATION,
                    Manifest.permission.READ_PHONE_STATE
            }, 100);
        }
        tvContent = (TextView) findViewById(R.id.tv_content);
        // TDRisk.getBlackBox
        findViewById(R.id.bt_get_blackbox).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HandlerUtils.runOnWorkingThread(new Runnable() {
                    @Override
                    public void run() {

                    }
                });
            }
        });
        findViewById(R.id.bt_get_blackbox_async).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        // TDRisk.getSDKVersion
        findViewById(R.id.bt_get_version).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        // TDRisk.showCaptcha
        findViewById(R.id.bt_show_captcha).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
