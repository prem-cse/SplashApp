package com.example.dell.splashapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

class SplashTimer extends Thread{
  MainActivity mainActivity;
SplashTimer(MainActivity m)
    {
     mainActivity=m;
    }
    public void run(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            Intent intent=new Intent(mainActivity,LogIn.class);
            mainActivity.startActivity(intent);

        }




    }

}
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SplashTimer splashTimer=new SplashTimer(this);
        splashTimer.start();
    }
}
