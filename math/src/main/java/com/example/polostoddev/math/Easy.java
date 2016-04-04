package com.example.polostoddev.math;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
public class Easy extends Activity{

    public ImageView v1,v2,v3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy);
        Button back = (Button) findViewById(R.id.back);
        Button lima = (Button) findViewById(R.id.btn5);
        Button tiga = (Button) findViewById(R.id.btn3);
        Button empat = (Button) findViewById(R.id.btn4);
        Button enam = (Button) findViewById(R.id.btn6);
         v1 = (ImageView) findViewById(R.id.imageView2);
         v2 = (ImageView) findViewById(R.id.imageView3);
         v3 = (ImageView) findViewById(R.id.imageView4);
        //try 2
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        lima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Jawaban adik salah :) sillahkan coba lagi", Toast.LENGTH_SHORT).show();
                v3.setImageResource(R.drawable.love1);
            }
        });
        empat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Jawaban adik salah :) sillahkan coba lagi", Toast.LENGTH_SHORT).show();
                v2.setImageResource(R.drawable.love1);
            }
        });
        enam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Jawaban adik salah :) sillahkan coba lagi", Toast.LENGTH_SHORT).show();
                v1.setImageResource(R.drawable.love1);
            }
        });
        tiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Easy2 = new Intent(Easy.this, com.example.polostoddev.math.Easy2.class);
                startActivity(Easy2);
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

//Try to fix button

}

