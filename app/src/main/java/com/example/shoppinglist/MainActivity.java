package com.example.shoppinglist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    public static final int TEXT_REQUEST = 1;
    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;
    TextView textView6;
    TextView textView7;

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        textView1 = findViewById(R.id.first_item);
        textView2 = findViewById(R.id.second_item);
        textView3 = findViewById(R.id.third_item);
        textView4 = findViewById(R.id.fourth_item);
        textView5 = findViewById(R.id.fifth_item);
        textView6 = findViewById(R.id.sixth_item);
        textView7 = findViewById(R.id.seventh_item);
        if (textView1.getVisibility() == View.VISIBLE) {
            outState.putString("first_item", textView1.getText().toString());
        }
        if (textView2.getVisibility() == View.VISIBLE) {
            outState.putString("second_item", textView2.getText().toString());
        }
        if (textView3.getVisibility() == View.VISIBLE) {
            outState.putString("third_item", textView3.getText().toString());
        }
        if (textView4.getVisibility() == View.VISIBLE) {
            outState.putString("fourth_item", textView4.getText().toString());
        }
        if (textView5.getVisibility() == View.VISIBLE) {
            outState.putString("fifth_item", textView5.getText().toString());
        }
        if (textView6.getVisibility() == View.VISIBLE) {
            outState.putString("sixth_item", textView6.getText().toString());
        }
        if (textView7.getVisibility() == View.VISIBLE) {
            outState.putString("seventh_item", textView7.getText().toString());
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1 = findViewById(R.id.first_item);
        textView2 = findViewById(R.id.second_item);
        textView3 = findViewById(R.id.third_item);
        textView4 = findViewById(R.id.fourth_item);
        textView5 = findViewById(R.id.fifth_item);
        textView6 = findViewById(R.id.sixth_item);
        textView7 = findViewById(R.id.seventh_item);
        if (savedInstanceState != null) {
            textView1.setVisibility(View.VISIBLE);
            textView2.setVisibility(View.VISIBLE);
            textView3.setVisibility(View.VISIBLE);
            textView4.setVisibility(View.VISIBLE);
            textView5.setVisibility(View.VISIBLE);
            textView6.setVisibility(View.VISIBLE);
            textView7.setVisibility(View.VISIBLE);
            textView1.setText(savedInstanceState.getString("first_item"));
            textView2.setText(savedInstanceState.getString("second_item"));
            textView3.setText(savedInstanceState.getString("third_item"));
            textView4.setText(savedInstanceState.getString("fourth_item"));
            textView5.setText(savedInstanceState.getString("fifth_item"));
            textView6.setText(savedInstanceState.getString("sixth_item"));
            textView7.setText(savedInstanceState.getString("seventh_item"));
            textView1.setVisibility(View.VISIBLE);
            textView2.setVisibility(View.VISIBLE);
            textView3.setVisibility(View.VISIBLE);
            textView4.setVisibility(View.VISIBLE);
            textView5.setVisibility(View.VISIBLE);
            textView6.setVisibility(View.VISIBLE);
            textView7.setVisibility(View.VISIBLE);
        }
    }

    public void launchUsualItems(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, UsualItems.class);
        startActivityForResult(intent, TEXT_REQUEST);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        textView1 = findViewById(R.id.first_item);
        textView2 = findViewById(R.id.second_item);
        textView3 = findViewById(R.id.third_item);
        textView4 = findViewById(R.id.fourth_item);
        textView5 = findViewById(R.id.fifth_item);
        textView6 = findViewById(R.id.sixth_item);
        textView7 = findViewById(R.id.seventh_item);
        if (requestCode == TEXT_REQUEST) {
            if (resultCode == RESULT_OK) {
                textView1.setText(UsualItems.message1);
                textView2.setText(UsualItems.message2);
                textView3.setText(UsualItems.message3);
                textView4.setText(UsualItems.message4);
                textView5.setText(UsualItems.message5);
                textView6.setText(UsualItems.message6);
                textView7.setText(UsualItems.message7);
                textView1.setVisibility(View.VISIBLE);
                textView2.setVisibility(View.VISIBLE);
                textView3.setVisibility(View.VISIBLE);
                textView4.setVisibility(View.VISIBLE);
                textView5.setVisibility(View.VISIBLE);
                textView6.setVisibility(View.VISIBLE);
                textView7.setVisibility(View.VISIBLE);
            }
        }
    }
}