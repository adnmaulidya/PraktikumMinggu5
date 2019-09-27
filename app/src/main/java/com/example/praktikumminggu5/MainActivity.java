package com.example.praktikumminggu5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void handlerStaticFragment(View view) {
        Intent intent = new Intent(this, com.example.praktikumminggu5.activities.StaticActivity.class);
        startActivity(intent);
    }

    public void handlerDynamicFragment(View view) {
        Intent intent = new Intent(this, com.example.praktikumminggu5.activities.DynamicActivity.class);
        startActivity(intent);
    }
    public void handlerPraktikumFragment(View view) {
    }
}
