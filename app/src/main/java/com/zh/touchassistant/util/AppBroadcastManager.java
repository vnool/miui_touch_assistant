package com.zh.touchassistant.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;

/**
 * <b>Package:</b> com.zh.touchassistant.util <br>
 * <b>FileName:</b> AppBroadcastManager <br>
 * <b>Create Date:</b> 2018/12/13  下午9:07 <br>
 * <b>Author:</b> zihe <br>
 * <b>Description:</b>  <br>
 */
public class AppBroadcastManager {
    private AppBroadcastManager() {
    }

    /**
     * 发送广播
     */
    public static void sendBroadcast(Context context, String action) {
        LocalBroadcastManager
                .getInstance(context)
                .sendBroadcast(new Intent(action));
    }

    /**
     * 注册
     */
    public static void registerReceiver(Context context, BroadcastReceiver receiver, IntentFilter filter) {
        LocalBroadcastManager
                .getInstance(context)
                .registerReceiver(receiver, filter);
    }

    /**
     * 注销
     */
    public static void unregisterReceiver(Context context, BroadcastReceiver receiver) {
        LocalBroadcastManager
                .getInstance(context)
                .unregisterReceiver(receiver);
    }
}