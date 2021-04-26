package com.example.asalmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText sayi1,sayi2;
    TextView asalTextview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        sayi1 = findViewById(R.id.sayi1);
        sayi2 = findViewById(R.id.sayi2);
        asalTextview = (TextView) findViewById(R.id.textView);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void asalbul(View wiew){
        List<Integer> asaldizisi = new ArrayList<Integer>();
        int s1 = Integer.parseInt( sayi1.getText().toString() );
        int sayac;
        int s2 = Integer.parseInt( sayi2.getText().toString() );
        if(s1>0 || s2>0 ){
            for (int i=s1;i<=s2;i++){
                sayac=0;
                for(int j=2;j<=s1;j++) {
                    if(i%j==0){
                        sayac++;
                    }
                }
                if(sayac==0){
                    asaldizisi.add(i);
                }
                }
            }
        for(int i=0; i < asaldizisi.size(); i++){

            asalTextview.setText(asalTextview.getText() + " " + asaldizisi.get(i) + " , ");
        }
        }

    }
