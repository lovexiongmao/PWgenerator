package com.example.pwgenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView tv;
    private EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void TransformCode(View v) {
        et = findViewById(R.id.input);
        String str = et.getText().toString().trim();
        tv = findViewById(R.id.hashvalue);
        Toast.makeText(this, "欢迎你，新世界管理者", Toast.LENGTH_SHORT).show();
        tv.setText(str);
    }

}
