package com.example.two_words_37.sensorlistexample;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private SensorManager sensorManager;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        textView = findViewById(R.id.sensorslist);
        List<Sensor> sensorList = sensorManager.getSensorList(Sensor.TYPE_ALL);
        StringBuilder strBuilder = new StringBuilder();
        for (Sensor s : sensorList) {
            strBuilder.append(s.getName()).append("\n");
        }
        textView.setVisibility(View.VISIBLE);
        textView.setText(strBuilder);
    }
}
