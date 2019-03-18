package com.example.shoppinglist;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final int TEXT_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchUsualItems(View view) {
        Intent intent = new Intent(this, UsualItems.class);
        startActivityForResult(intent, TEXT_REQUEST);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == TEXT_REQUEST) {
            if (resultCode == RESULT_OK) {
                TextView textView1 = findViewById(R.id.first_item);
                TextView textView2 = findViewById(R.id.second_item);
                TextView textView3 = findViewById(R.id.third_item);
                TextView textView4 = findViewById(R.id.fourth_item);
                TextView textView5 = findViewById(R.id.fifth_item);
                TextView textView6 = findViewById(R.id.sixth_item);
                TextView textView7 = findViewById(R.id.seventh_item);
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