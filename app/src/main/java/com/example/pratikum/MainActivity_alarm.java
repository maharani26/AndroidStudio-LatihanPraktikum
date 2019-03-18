package com.example.pratikum;

import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity_alarm extends AppCompatActivity {

    private ImageButton buttonAlarm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_alarm);
        buttonAlarm = findViewById(R.id.btnjam);

        buttonAlarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createAlarm("Waktu Pulang", 16, 30);
            }

            private void createAlarm(String message, int hour, int minutes) {

                Intent alarmIntent = new Intent(AlarmClock.ACTION_SET_ALARM);
                alarmIntent.putExtra(AlarmClock.EXTRA_MESSAGE, message);
                alarmIntent.putExtra(AlarmClock.EXTRA_HOUR, hour);
                alarmIntent.putExtra(AlarmClock.EXTRA_MINUTES, minutes);
                if (alarmIntent.resolveActivity(getPackageManager()) != null)
                    startActivity(alarmIntent);
            }
        });
    }

}

