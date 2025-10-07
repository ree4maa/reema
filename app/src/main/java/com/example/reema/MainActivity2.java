package com.example.reema;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    private EditText etNum1;
    private EditText etNum2;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        etNum1 = findViewById(R.id.etNum1);
        TextView tvOp = findViewById(R.id.tvOp);
        etNum2 = findViewById(R.id.etNum2);
        Button btnMul = findViewById(R.id.btnMul);
        tvResult = findViewById(R.id.tvResult);
        ImageView ivPlus = findViewById(R.id.ivPlus);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.icon_plus), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void onClick(View v) {
        String num1 = etNum1.getText().toString();
        int n1 = Integer.parseInt(num1);
        String num2 = etNum2.getText().toString();
        int n2 = Integer.parseInt(num2);
        int result = n1 * n2;
        tvResult.setText(String.valueOf(result));

    }
    public void onClick2(View v){
        String num1 = etNum1.getText().toString();
        int n1 = Integer.parseInt(num1);
        String num2 = etNum2.getText().toString();
        int n2 = Integer.parseInt(num2);
        int result = n1 + n2;
        tvResult.setText(String.valueOf(result));

    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
       if (item.getItemId()==R.id.itmSettings)
       {
           Toast.makeText(this, "i'm Settings", Toast.LENGTH_SHORT).show();
       }
       if (item.getItemId()==R.id.itmHistory)
       {
           Toast.makeText(this, "i'm History", Toast.LENGTH_SHORT).show();
       }
       return true;
    }
}