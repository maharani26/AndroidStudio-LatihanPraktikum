package com.example.pratikum;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.pratikum.Fragment.MultipleFragment;

public class MainActivity_picture extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void multiple(View view) {
        Intent multiple = new Intent(MainActivity_picture.this, MultipleFragment.class);
        startActivity(multiple);
    }
}
