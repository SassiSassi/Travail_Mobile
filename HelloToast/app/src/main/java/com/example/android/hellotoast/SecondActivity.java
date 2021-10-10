package com.example.android.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView mShowCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mShowCount = (TextView) findViewById(R.id.count_second);
        Intent intent = getIntent();
        int count= intent.getIntExtra("count",0);
        mShowCount.setText(String.valueOf(count));
    }
}