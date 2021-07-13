package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CheckBox cbAndroid,cbjava,cbsql;
    Button btsubmit;
    TextView tvOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     cbAndroid = findViewById(R.id.cb_android);
     cbjava = findViewById(R.id.cb_java);
     cbsql = findViewById(R.id.cb_sql);
     btsubmit = findViewById(R.id.bt_button);
     tvOutput = findViewById(R.id.output);


     cbAndroid.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             if (cbAndroid.isChecked())
             {
                 cbAndroid.setTextColor(getResources().getColor(R.color.colorAccent));
             }
             else
             {
                 cbAndroid.setTextColor(getResources().getColor(R.color.colorBlack));
             }
         }
     });

        cbjava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbjava.isChecked())
                {
                    cbjava.setTextColor(getResources().getColor(R.color.colorAccent));
                }
                else
                {
                    cbjava.setTextColor(getResources().getColor(R.color.colorBlack));
                }
            }
        });

        cbsql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbsql.isChecked())
                {
                    cbsql.setTextColor(getResources().getColor(R.color.colorAccent));
                }
                else
                {
                    cbsql.setTextColor(getResources().getColor(R.color.colorBlack));
                }
            }
        });


        btsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "";
                if (cbAndroid.isChecked()) {
                    s += "\n Android";
                }
                if (cbjava.isChecked()) {
                    s += "\n java";
                }

                if (cbsql.isChecked()) {
                    s += "\n sql";
                }
                tvOutput.setText(s);
            }

        });


    }
}
