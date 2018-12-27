package com.example.dell.splashapp;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class Background extends Service {
    public Background() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
    @Override
    public void onCreate(){


    }
    public void onStart(Intent intent,int startId){}
    public void onDestroy(){}
}
