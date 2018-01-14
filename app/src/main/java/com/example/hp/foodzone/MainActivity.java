package com.example.hp.foodzone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.hp.ff1.Main2Activity;

public class MainActivity extends AppCompatActivity  {
    ImageButton iv,in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv=(ImageButton)findViewById(R.id.ivVeg);
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(a);

            }
        });
        in=(ImageButton)findViewById(R.id.ivNon);
        in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(b);
            }
        });
    }

}
