package com.example.testproject;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnClick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClick = findViewById(R.id.btn_active);
        btnClick.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Main Activity", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Main Activity", "onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Main Activity", "onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Main Activity", "onStop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Main Activity", "onDestroy");

    }

    @Override
    public void onClick(View view) {
//        Toast.makeText(this, "Hello World", Toast.LENGTH_LONG).show();
//        Intent intent1 = new Intent(Intent.ACTION_SEND);
//        Bundle myBundle = new Bundle();
        Intent intent = new Intent(this, NewsFeedActivity.class);
        intent.putExtra("KEY_EXTRA", "this is Data from Intent");
        startActivity(intent);
    }
}