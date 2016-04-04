package com.example.polostoddev.math;

import android.app.ActionBar;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.media.MediaPlayer;

import java.util.List;


public class MainActivity extends Activity {
    Button Play,easy,medium,hard,exit,info;
    LinearLayout liner;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mp=MediaPlayer.create(MainActivity.this,R.raw.tw1);
        mp.setLooping(true);
        mp.start();
        ActionBar a = getActionBar();
        if(a != null) a.hide();
        Play = (Button) findViewById(R.id.btn_play);
        liner =(LinearLayout) findViewById(R.id.v_liner);
        easy = (Button) findViewById(R.id.btn_easy);
        exit = (Button)findViewById(R.id.button_exit);
        info = (Button) findViewById(R.id.button_author);

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                infoGame info = new infoGame(MainActivity.this);
                info.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                info.show();
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                closedialog cdd = new closedialog(MainActivity.this);
                cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                cdd.show();
            }

        });



        easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Easy = new Intent(MainActivity.this, Easy.class);
                startActivity(Easy);
                finish();
            }
        });

        Play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(liner.getVisibility() == View.VISIBLE){
                    liner.setVisibility(View.INVISIBLE);
                }else {
                    liner.setVisibility(View.VISIBLE);
                }

            }
        });
    }

    @Override
    public void onBackPressed() {
        closedialog cdd = new closedialog(MainActivity.this);
        cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        cdd.show();
    }


    @Override
    protected void onPause() {
        if (this.isFinishing()){
            mp.stop();
        }
        Context context = getApplicationContext();
        ActivityManager am = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        List<ActivityManager.RunningTaskInfo> taskInfo = am.getRunningTasks(1);
        if (!taskInfo.isEmpty()){
            ComponentName topActivity = taskInfo.get(0).topActivity;
            if (!topActivity.getPackageName().equals(context.getPackageName())) {
                mp.stop();
            }
            else{
            }


        }
        super.onPause();
    }
}
