package com.example.shoppinglist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class UsualItems extends AppCompatActivity {
    private static final String LOG_TAG
            = UsualItems.class.getSimpleName();
    public static String message1;
    public static String message2;
    public static String message3;
    public static String message4;
    public static String message5;
    public static String message6;
    public static String message7;

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG_TAG, "onStart");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usual_items);
    }

    public void returnChoice1(View view) {
        ImageButton buttonSend1 = findViewById(R.id.imageButton1);
        message1 = buttonSend1.getContentDescription().toString();
        setResult(RESULT_OK);
        finish();
    }

    public void returnChoice2(View view) {
        ImageButton buttonSend2 = findViewById(R.id.imageButton2);
        message2 = buttonSend2.getContentDescription().toString();
        setResult(RESULT_OK);
        finish();
    }

    public void returnChoice3(View view) {
        ImageButton buttonSend3 = findViewById(R.id.imageButton3);
        message3 = buttonSend3.getContentDescription().toString();
        setResult(RESULT_OK);
        finish();
    }

    public void returnChoice4(View view) {
        ImageButton buttonSend4 = findViewById(R.id.imageButton4);
        message4 = buttonSend4.getContentDescription().toString();
        setResult(RESULT_OK);
        finish();
    }

    public void returnChoice5(View view) {
        ImageButton buttonSend5 = findViewById(R.id.imageButton5);
        message5 = buttonSend5.getContentDescription().toString();
        setResult(RESULT_OK);
        finish();
    }

    public void returnChoice6(View view) {
        ImageButton buttonSend6 = findViewById(R.id.imageButton6);
        message6 = buttonSend6.getContentDescription().toString();
        setResult(RESULT_OK);
        finish();
    }

    public void returnChoice7(View view) {
        ImageButton buttonSend7 = findViewById(R.id.imageButton7);
        message7 = buttonSend7.getContentDescription().toString();
        setResult(RESULT_OK);
        finish();
    }
}