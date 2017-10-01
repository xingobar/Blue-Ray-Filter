package com.example.xingobar.bluelightfilter;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.view.WindowManager;

/**
 * Created by xingobar on 2017/10/1.
 * ref : https://developer.android.com/guide/components/services.html?hl=zh-tw
 */

public class FilterService extends Service {

    private WindowManager.LayoutParams layoutParams;
    private WindowManager windowManager;

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        //不允許元介繫結
        return null;
    }

    /*
     *當不再使用此服務時會被呼叫
     *此時務必清除 如執行緒 註冊監聽器等資源才行
     */

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
