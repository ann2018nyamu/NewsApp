package com.example.bitcoinapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    ImageView mImageview;
    TextView news;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = new Intent();
        String value = intent.getStringExtra("News");
        int picture = intent.getIntExtra("Picture", 0);

        Toast.makeText(this, value, Toast.LENGTH_SHORT).show();

        mImageview = (ImageView) findViewById(R.id.newsimage);
        news = (TextView) findViewById(R.id.message);


        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            news.setText(bundle.getString("News"));
            //if (news.getText().toString().equalsIgnoreCase("Citizen News")){
                mImageview.setImageResource((picture));
           // }
        }
        }
    }
