package com.cookandroid.traffic_new;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    LinearLayout linearLayout, linearLayout11, linearLayout22, linearLayout33, linearLayout44, linearLayout55, linearLayout66, linearLayout77, linearLayout88, linearLayout99, linearLayout1010;
    TextView textView, tip1, tip2, tip3, tip4, tip5, tip6, tip7, tip8, tip9, tip10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout = findViewById(R.id.linearLayout);
        linearLayout11 = findViewById(R.id.linearLayout11);
        linearLayout22 = findViewById(R.id.linearLayout22);
        linearLayout33 = findViewById(R.id.linearLayout33);
        linearLayout44 = findViewById(R.id.linearLayout44);
        linearLayout55 = findViewById(R.id.linearLayout55);
        linearLayout66 = findViewById(R.id.linearLayout66);
        linearLayout77 = findViewById(R.id.linearLayout77);
        linearLayout88 = findViewById(R.id.linearLayout88);
        linearLayout99 = findViewById(R.id.linearLayout99);
        linearLayout1010 = findViewById(R.id.linearLayout1010);

        textView = findViewById(R.id.textView);
        tip1 = findViewById(R.id.tip1);
        tip2 = findViewById(R.id.tip2);
        tip3 = findViewById(R.id.tip3);
        tip4 = findViewById(R.id.tip4);
        tip5 = findViewById(R.id.tip5);
        tip6 = findViewById(R.id.tip6);
        tip7 = findViewById(R.id.tip7);
        tip8 = findViewById(R.id.tip8);
        tip9 = findViewById(R.id.tip9);
        tip10 = findViewById(R.id.tip10);


        linearLayout11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle(R.string.tip1);
                dlg.setView(getLayoutInflater().inflate(R.layout.tip1_activity, null));
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });

        linearLayout22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle(R.string.tip2);
                dlg.setView(getLayoutInflater().inflate(R.layout.tip2_activity, null));
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });


        linearLayout33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle(R.string.tip3);
                dlg.setView(getLayoutInflater().inflate(R.layout.tip3_activity, null));
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });

        linearLayout44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle(R.string.tip4);
                dlg.setView(getLayoutInflater().inflate(R.layout.tip4_activity, null));
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });

        linearLayout55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle(R.string.tip5);
                dlg.setView(getLayoutInflater().inflate(R.layout.tip5_activity, null));
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });

        linearLayout66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle(R.string.tip6);
                dlg.setView(getLayoutInflater().inflate(R.layout.tip6_activity, null));
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });

        linearLayout77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle(R.string.tip7);
                dlg.setView(getLayoutInflater().inflate(R.layout.tip7_activity, null));
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });

        linearLayout88.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle(R.string.tip8);
                dlg.setView(getLayoutInflater().inflate(R.layout.tip8_activity, null));
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });

        linearLayout99.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle(R.string.tip9);
                dlg.setView(getLayoutInflater().inflate(R.layout.tip9_activity, null));
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });

        linearLayout1010.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle(R.string.tip10);
                dlg.setView(getLayoutInflater().inflate(R.layout.tip10_activity, null));
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });




    }
}
