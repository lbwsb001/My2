package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aaa);
        Log.i("111","onCreate:run");
        Log.i("00","onCreate:");

        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(this);



    }
    public void onClick(View v){

        EditText edit = findViewById(R.id.hight);
        EditText edit1 = findViewById(R.id.weight);
        double bmi = Double.parseDouble(edit.getText().toString());
        double bmi1 = Double.parseDouble(edit1.getText().toString());
        bmi = bmi1/(bmi*bmi);
        bmi=Double.parseDouble(String.format("%.2f",bmi));
        TextView output =findViewById(R.id.output);
        output.setText("结果为："+bmi);

    }
}
