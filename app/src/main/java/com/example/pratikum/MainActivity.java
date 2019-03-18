package com.example.pratikum;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.pratikum.Fragment.MultipleFragment;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toast(View view) {
        Intent toast = new Intent(MainActivity.this, MainActivity_toast.class);
        startActivity(toast);
    }

    public void alarm(View view) {
        Intent alarm = new Intent(MainActivity.this, MainActivity_alarm.class);
        startActivity(alarm);
    }

    public void maps(View view) {
        Intent maps = new Intent(MainActivity.this, MainActivity_maps.class);
        startActivity(maps);
    }

    public void picture(View view) {
        Intent picture = new Intent(MainActivity.this, MultipleFragment.class);
        startActivity(picture);
    }
}
