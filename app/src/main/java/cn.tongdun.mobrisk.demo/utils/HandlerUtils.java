
package cn.tongdun.mobrisk.demo.utils;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

/**
 * Handler utils
 */
public class HandlerUtils {

    private static final String TAG = "TDHandler";


    private static final Handler UI_HANDLER = new Handler(Looper.getMainLooper());

    private static final HandlerThread WORKING_THREAD = new HandlerThread(TAG);
    private static final Handler WORKING_HANDLER;

    static {
        // Initialize working thread handler
        WORKING_THREAD.start();
        WORKING_HANDLER = new Handler(WORKING_THREAD.getLooper());
    }

    public static void runOnUiThread(Runnable runnable) {
        UI_HANDLER.post(runnable);
    }

    public static void runOnWorkingThread(Runnable runnable) {
        WORKING_HANDLER.post(runnable);
    }
}
