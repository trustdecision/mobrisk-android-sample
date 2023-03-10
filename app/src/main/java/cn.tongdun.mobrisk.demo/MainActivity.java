package cn.tongdun.mobrisk.demo;

import android.Manifest;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import cn.tongdun.mobrisk.TDRisk;
import cn.tongdun.mobrisk.demo.utils.HandlerUtils;


public class MainActivity extends AppCompatActivity {

    private TextView tvContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //以下权限不是必须申请. 可根据业务情况选择性权限申请
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            requestPermissions(new String[]{
                    Manifest.permission.ACCESS_FINE_LOCATION,
                    Manifest.permission.ACCESS_COARSE_LOCATION,
                    Manifest.permission.READ_PHONE_STATE
            }, 100);
        }
        tvContent = (TextView) findViewById(R.id.tv_content);

        findViewById(R.id.bt_get_blackbox).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HandlerUtils.runOnWorkingThread(new Runnable() {
                    @Override
                    public void run() {
                        // TDRisk.getBlackBox() 是同步获取blackbox，如果在主线程调⽤，需要注意耗时问题。
                        final String blackBox = TDRisk.getBlackBox();
                        // 主线程 更新ui
                        HandlerUtils.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                tvContent.setText(blackBox);
                            }
                        });
                    }
                });
            }
        });

        findViewById(R.id.bt_get_version).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvContent.setText(TDRisk.getSDKVersion());
            }
        });
    }
}
