package com.example.baihuay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Huay a = new Huay();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button randomButton = (Button) findViewById(R.id.button);
        randomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, Interface.class);
                intent.putExtra("name","เลขท้าย 2 ตัว");
                intent.putExtra("value", a.getRandomTwoDigits());
                startActivity(intent);
            }
        });
        Button randomButton2 = (Button) findViewById(R.id.button2);
        randomButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, Interface.class);
                intent.putExtra("name", "เลขท้าย 3 ตัว");
                intent.putExtra("value", a.getRandomThreeDigits());
                startActivity(intent);
            }
        });


    }
}
