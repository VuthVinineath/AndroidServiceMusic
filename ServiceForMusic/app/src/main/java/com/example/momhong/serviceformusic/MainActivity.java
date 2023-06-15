package com.example.momhong.serviceformusic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnStart;
    Button btnStop;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnStart  = (Button)findViewById(R.id.btnStart);
        btnStop   = (Button)findViewById(R.id.btnStop);
        btnStart.setOnClickListener(this);
        btnStop.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.btnStart:
                Intent myIntent = new Intent(getApplicationContext(),MusicService.class);
                startService(myIntent);
                break;
            case R.id.btnStop:
                Intent intent = new Intent(getApplicationContext(),MusicService.class);
                stopService(intent);
                break;
        }
    }
}
