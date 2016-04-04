package com.example.polostoddev.math;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
public class Easy3 extends Activity{

    public ImageView v1,v2,v3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy);
        Button back = (Button) findViewById(R.id.back);
        Button satu = (Button) findViewById(R.id.btn1);
        Button sepuluh = (Button) findViewById(R.id.btn10);
        Button delapan = (Button) findViewById(R.id.btn8);
        Button sebelas = (Button) findViewById(R.id.btn11);
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
        sepuluh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Jawaban adik salah :) sillahkan coba lagi", Toast.LENGTH_SHORT).show();
                v3.setImageResource(R.drawable.love1);
            }
        });
        delapan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Jawaban adik salah :) sillahkan coba lagi", Toast.LENGTH_SHORT).show();
                v2.setImageResource(R.drawable.love1);
            }
        });
        sebelas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Jawaban adik salah :) sillahkan coba lagi", Toast.LENGTH_SHORT).show();
                v1.setImageResource(R.drawable.love1);
            }
        });
        satu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Easy2 = new Intent(Easy3.this, com.example.polostoddev.math.Easy4.class);
                startActivity(Easy2);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

//Try to fix button

}

