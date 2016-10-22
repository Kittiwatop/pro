package com.example.baihuay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Interface extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface);

        Intent intent = getIntent();
        String nameAct = intent.getStringExtra("name");
        String valueAct = intent.getStringExtra("value");




        TextView nameText = (TextView) findViewById(R.id.textView);
        nameText.setText(nameAct);

        TextView valueText = (TextView) findViewById(R.id.textView2);
        valueText.setText(valueAct);




    }
}
