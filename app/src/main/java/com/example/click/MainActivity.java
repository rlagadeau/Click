package com.example.click;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Plus(View view){
        ++count;
        TextView clickView = findViewById(R.id.clickView);
        clickView.setText(String.valueOf(count));
    }

    public void Minus(View view){
        --count;
        TextView clickView = findViewById(R.id.clickView);
        clickView.setText(String.valueOf(count));
    }

    public void Reset(View view){
        count = 0;
        TextView clickView = findViewById(R.id.clickView);
        clickView.setText(String.valueOf(count));
    }
}