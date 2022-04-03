package com.example.myapplicationweek2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button1;
    Button button2;
    EditText myEdit;
    RadioButton radioButton1;
    RadioButton radioButton2;
    RadioGroup radioGroup;
    ImageView imageView1;
    ImageView imageView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        myEdit = (EditText) findViewById(R.id.myEdit);
        radioButton1 = (RadioButton) findViewById(R.id.radioButton1);
        radioButton2 = (RadioButton) findViewById(R.id.radioButton2);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        imageView1 = (ImageView) findViewById(R.id.imageView1);
        imageView2 = (ImageView) findViewById(R.id.imageView2);


        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(getApplicationContext(), myEdit.getText(), Toast.LENGTH_SHORT).show();

            }
        });

        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent mintent= new Intent(Intent.ACTION_VIEW, Uri.parse(myEdit.getText().toString()));
                startActivity(mintent);
            }
        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int Checkedld)
            {
                switch (Checkedld) {
                    case R.id.radioButton1:
                        imageView1.setVisibility(View.VISIBLE);
                        imageView2.setVisibility(View.INVISIBLE);
                        break;
                    case R.id.radioButton2:
                        imageView1.setVisibility(View.INVISIBLE);
                        imageView2.setVisibility(View.VISIBLE);
                        break;
                }
            }
        });

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_launcher);
    }
}