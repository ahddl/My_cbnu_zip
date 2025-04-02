package com.example.a9week_mission_10_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RadioGroup radioGroup;
    private RadioButton radioButton, radioButton2;
    private Button button;

    int state;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("쿠앤크팀");

        radioButton = (RadioButton) findViewById(R.id.radioButton);
        radioButton2 = (RadioButton) findViewById(R.id.radioButton2);
        radioGroup = findViewById(R.id.radioGroup);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(state == 1) {
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    startActivity(intent);
                } else if(state == 2) {
                    Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "라디오 버튼을 클릭하시오", Toast.LENGTH_LONG).show();
                }
            }
        });


        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.radioButton:
                        state = 1;
                        break;
                    case R.id.radioButton2:
                        state = 2;
                }
            }
        });
    }
}
