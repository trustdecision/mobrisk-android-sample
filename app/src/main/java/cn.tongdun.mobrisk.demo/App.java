package cn.tongdun.mobrisk.demo;

import android.app.Application;

import cn.tongdun.mobrisk.TDRisk;


/**
 * Initialize in Application
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        String blackBox = TDRisk.getBlackBox();
//        TDRisk.Builder builder = new TDRisk.Builder()
//                /*************************** ↓ must ↓ ***************************/
//                .partnerCode("TrustDecision")   // Partner code,such as demo,please fill in your partner, get from trustDecision
//                .appName("TrustDecision")       // app Name,such as appName,please fill in your app Name
//                .appKey("appKey")               // configure AppKey, please contact TrustDecision Operations to obtain it
//                .country(TDRisk.COUNTRY_CN);     // Country parameter，E.g: cn、sg、us、fra
//                /*************************** ↑ must ↑ ***************************/
//
//                /********************** ↓ fingerprint- configurable parameters ↓ ********************/
////                .disableGPS()                 // Collect GPS information by default, you can call this method to close
////                .disableSensor()              // Collect sensor information by default, you can call this method to close
////                .disableReadPhone()           // By default, information that requires READ_PHONE_STATE permission is collected, and this method can be called to close it
////                .disableRunningTasks()        // The default collection running task, you can call this method to close
////                .disableInstallPackageList()  // By default, the list of installation packages is collected, and this method can be called to close
//                /********************** ↑ fingerprint- configurable parameters ↑ ********************/
//
//                /********************** ↓ captcha- configurable parameters ↓ ***********************/
////                .language(3)                  // default:1, 1-Simplified Chinese, 2-Traditional Chinese, 3-English, 4-Japanese, 5-Korean, 6-Malay, 7-Thai, 8-Indonesian, 9-Russian
////                .tapToClose(true)             // default:false, After opening, click on the blank area of the interface to close the verification code pop-up window, which is more convenient to close the pop-up window
////                .hideLoadHud(true)            // default:false, When enabled, the loading animation will not be displayed when the Captcha window pops up, shortening the verification time
////                .hideWebCloseButton(true)     // default:false, Scenarios that need to be forced to complete the Captcha
//                /********************** ↑ captcha- configurable parameters ↑ ***********************/
//
////        if (It is recommended that users agree to the privacy agreement to initialize){
//            TDRisk.initWithOptions(getApplicationContext(), builder);
//        }
    }
}
