package com.example.classwork3d;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    int sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        sum = 0;
    }

    public void go(View view) {
        sum++;
        if(sum%7 == 0)
            btn.setText("BOOM!");
        else
            btn.setText("this is a click number:"+ sum);
    }
}