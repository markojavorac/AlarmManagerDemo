package com.example.n01049378.alarmmanagerdemo;

import android.app.AlarmManager;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.TimePicker;
import android.content.*;
import java.util.Calendar;
import android.widget.Toast;
import android.app.PendingIntent;
import static android.app.AlarmManager.*;


public class MainActivity extends AppCompatActivity {

    //Declaring TimePicker object
    TimePicker alarmTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assigning alarmTime to the timePicker
        alarmTime = findViewById(R.id.alarmTime);

        Button setAlarmbutton = findViewById(R.id.setAlarm_button);

        //Begin alarm construction
        setAlarmbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //We construct a calender object with the specific time set in the TimePicker
                Calendar calendar = Calendar.getInstance();
                if (android.os.Build.VERSION.SDK_INT >= 23) {
                    calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH),
                            alarmTime.getHour(), alarmTime.getMinute(), 0);
                } else {
                    calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH),
                            alarmTime.getCurrentHour(), alarmTime.getCurrentMinute(), 0);
                }

                //Sets the alarm with the target time in miliseconds
                setAlarm(calendar.getTimeInMillis());
            }
        });


    }


    //Logic that sets the alarm
    private void setAlarm(long time) {

        //Intent that sends is activated one alarm is up
        Intent i = new Intent(this, Alarm.class);

        //A pending intent used once alarm is set and passes on the the main intent once alarm is up
        PendingIntent pi = PendingIntent.getBroadcast(this, 0, i, 0);

        //Setting the alarm x miliseconds after the current time
        AlarmManager am = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        am.setExact(RTC_WAKEUP, time, pi);

        //Toast to verify alamr bering set
        Toast.makeText(this, "Alarm is set", Toast.LENGTH_SHORT).show();
    }
}
