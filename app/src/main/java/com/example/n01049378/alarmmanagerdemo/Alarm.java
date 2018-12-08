package com.example.n01049378.alarmmanagerdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;


//This class is activated when the alarm is triggered
public class Alarm extends BroadcastReceiver {

    //The actual code that will be executed once alarm is triggered
    @Override
    public void onReceive(Context context, Intent intent) {
        //For simplicity, I just send a toast saying Alarm!!! but you can put whatever you like
        Toast.makeText(context, "Alarm!!!", Toast.LENGTH_LONG).show();
    }
}
