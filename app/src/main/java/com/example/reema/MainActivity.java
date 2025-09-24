package com.example.reema;

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


public  class MainActivity extends AppCompatActivity {
    private TextView tv_Output;
    private Button btn_Go;
    private EditText et_Input;
    private static final String TAG = "LifecycleLab";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"onCreate");
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.icon_plus), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });

    }

    public void onClick(View v) {
        Intent i = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(i);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "i'm onStart", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "i'm onResume", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "i'm onPause", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "i'm onStop", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "i'm onDestroy", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onDestroy");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "i'm onRestart", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onRestart");
    }
}

