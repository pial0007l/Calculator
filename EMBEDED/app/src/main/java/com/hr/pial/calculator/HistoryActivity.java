package com.hr.pial.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileInputStream;

public class HistoryActivity extends AppCompatActivity {

    TextView history;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        this.history = (TextView)findViewById(R.id.history);

        Intent intent = getIntent();
        String filename = intent.getStringExtra("historyfile");
        history.setText(readFile(filename));

    }



    public  String readFile(String file){
        String text ="";
        try {
            FileInputStream fis = openFileInput(file);
            int size = fis.available();
            byte[] buffer = new byte[size];
            fis.read(buffer);
            fis.close();
            text = new String(buffer);

        }catch (Exception e){
            e.printStackTrace();
            Toast.makeText(HistoryActivity.this,"No history saved yet.", Toast.LENGTH_SHORT).show();
        }
        return text;
    }
}
