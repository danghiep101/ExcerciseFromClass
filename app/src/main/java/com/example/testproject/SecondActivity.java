package com.example.testproject;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText editTextA, editTextB, editTextResult;
    private Button btnCaculate, btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initView();

        btnCaculate.setOnClickListener(this);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }

    private void initView() {
        editTextA =findViewById(R.id.edt_A);
        editTextB =findViewById(R.id.edt_B);
        editTextResult =findViewById(R.id.edt_result);
        btnCaculate = findViewById(R.id.btn_caculate);
        btnBack = findViewById(R.id.btn_back);
    }

    @Override
    public void onClick(View view) {

        int A = Integer.parseInt("0" + editTextA.getText().toString());
        int B = Integer.parseInt("0" + editTextB.getText().toString());
        int result = A + B;
        Log.d("Tag", String.valueOf(A));
        editTextResult.setText(String.valueOf(result));

        Intent getIntent = getIntent();
        String stringExtra = getIntent.getStringExtra("KEY_EXTRA");
        Toast.makeText(this, stringExtra, Toast.LENGTH_LONG).show();
    }
}