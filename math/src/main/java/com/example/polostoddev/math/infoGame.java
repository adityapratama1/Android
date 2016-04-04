package com.example.polostoddev.math;

import android.app.Activity;
import android.app.Dialog;
import android.bluetooth.BluetoothClass;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.text.method.ScrollingMovementMethod;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

/**
 * Created by pratama.net on 20/01/2016.
 */
public class infoGame extends Dialog implements
        android.view.View.OnClickListener {

    public Activity c;
    public Dialog d;
    public Button yes, no;
    public TextView mTextView;
    private VerticalMarqueeTextView VMTV;
    private TranslateAnimation textViewAnimation;

    public infoGame (Activity a) {
        super(a);
        // TODO Auto-generated constructor stub
        this.c = a;
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.info_math);
        mTextView =(TextView) findViewById(R.id.txt_authorize);
        animateTextView();


    }

    private void animateTextView() {
        int textWidth = getTextViewWidth(mTextView);
        int displayWidth = getDisplayWidth(getContext());

        if((displayWidth)<=textWidth) {
            textViewAnimation = new TranslateAnimation(
                    0f, -0f,
                    20f , -100f);
            textViewAnimation.setDuration(10000); // Set custom duration.
            textViewAnimation.setStartOffset(0);// Set custom offset.
            textViewAnimation.setRepeatMode(Animation.RESTART); // This will animate text back ater it reaches end.
            textViewAnimation.setRepeatCount(Animation.INFINITE); // Infinite animation.

            mTextView.startAnimation(textViewAnimation);
            mTextView.setMovementMethod(new ScrollingMovementMethod());
        }
    }

    private int getDisplayWidth(Context context) {
        int displayWidth;

        WindowManager windowManager = (WindowManager)context.getSystemService(
                Context.WINDOW_SERVICE);
        Display display = windowManager.getDefaultDisplay();
        Point screenSize = new Point();

        if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.HONEYCOMB_MR2) {
            display.getSize(screenSize);
            displayWidth = screenSize.x;
        } else {
            displayWidth = display.getWidth();
        }

        return displayWidth;
    }

    private int getTextViewWidth(TextView textView) {
        textView.measure(0, 100);    // Need to set measure to (0, 0).
        return textView.getMeasuredWidth();
    }

    @Override
    public void onClick(View v) {

    }


}

