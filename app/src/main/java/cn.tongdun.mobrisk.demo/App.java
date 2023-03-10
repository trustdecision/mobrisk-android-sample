package cn.tongdun.mobrisk.demo;

import android.app.Application;
import android.os.Handler;
import android.util.Log;
import android.widget.Toast;

import cn.tongdun.mobrisk.TDRisk;
import cn.tongdun.mobrisk.TDRiskCallback;


/**
 * 在Application中初始化
 */

public class App extends Application {
    public static Application sContext;

    @Override
    public void onCreate() {
        super.onCreate();
        if (sContext == null) {
            sContext = this;
        }

        TDRisk.Builder builder = new TDRisk.Builder()
                /*************************** ↓必传↓ ***************************/
                .partnerCode("TrustDecision")   // 同盾的合作⽅编码，如demo，请填写⾃身的合作⽅编码
                .appName("TrustDecision")       // 同盾平台注册的应⽤名称，请联系同盾运营获取
                .appKey("appKey")               // 配置AppKey，请联系同盾运营获取
                .country(TDRisk.COUNTRY_CN)     // 国家地区参数，如cn、sg、us、fra
                /*************************** ↑必传↑ ***************************/

                /*************************** ↓可配置参数↓ ***************************/
//                .disableGPS()                   // 默认采集GPS信息, 可以调用此方法进行关闭
//                .disableSensor()                // 默认采集传感器信息, 可以调用此方法进行关闭
//                .disableReadPhone()             // 默认采集需要READ_PHONE_STATE权限的信息, 可以调用此方法进行关闭
//                .disableRunningTasks()          // 默认采集运行任务, 可以调用此方法进行关闭
//                .disableInstallPackageList()    // 默认采集安装包列表, 可以调用此方法进行关闭
                .callback(new TDRiskCallback() {
                    @Override
                    public void onEvent(String blackbox) {
                        Log.i("RiskDemo", "callback blackbox " + blackbox);
                    }
                });
        // 建议⽤户同意隐私协议后初始化
        TDRisk.initWithOptions(sContext, builder);
    }
}
