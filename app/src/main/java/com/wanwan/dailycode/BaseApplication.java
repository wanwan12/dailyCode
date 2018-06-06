package com.wanwan.dailycode;

import android.app.Application;
import android.content.Intent;

/**
 * Created by changzhengwan on 2018/6/1.
 */

public class BaseApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        Intent intent = new Intent(this,MainService.class);
        startService(intent);
    }
}
