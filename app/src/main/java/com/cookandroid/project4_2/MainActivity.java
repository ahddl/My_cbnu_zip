package com.cookandroid.project4_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView text1, text2;
    CheckBox  chkAgree;
    RadioGroup rgroup1;
    RadioButton rdodog, rdocat, rdorabbit;
    Button btnOK;
    ImageView imgPet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_launcher);

        setContentView(R.layout.activity_main);
        setTitle("애완동물 사진보기");

        text1 = (TextView) findViewById(R.id.Text1);
        chkAgree = (CheckBox) findViewById(R.id.ChkAgree);

        text2 = (TextView) findViewById(R.id.Text2);
        rgroup1 = (RadioGroup) findViewById(R.id.Rgroup1);
        rdodog = (RadioButton) findViewById(R.id.Rdodog);
        rdocat = (RadioButton) findViewById(R.id.Rdocat);
        rdorabbit = (RadioButton) findViewById(R.id.Rdorabbit);

        btnOK = (Button) findViewById(R.id.BtnOK);
        imgPet = (ImageView) findViewById(R.id.ImgPet);

        chkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (chkAgree.isChecked()==true) {
                    text2.setVisibility(android.view.View.VISIBLE);
                    rgroup1.setVisibility(android.view.View.VISIBLE);
                    btnOK.setVisibility(android.view.View.VISIBLE);
                    imgPet.setVisibility(android.view.View.VISIBLE);
                } else
                {
                    text2.setVisibility(android.view.View.INVISIBLE);
                    rgroup1.setVisibility(android.view.View.INVISIBLE);
                    btnOK.setVisibility(android.view.View.INVISIBLE);
                    imgPet.setVisibility(android.view.View.INVISIBLE);
                }
            }
        });

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                switch (rgroup1.getCheckedRadioButtonId()){
                    case R.id.Rdodog:
                        imgPet.setImageResource(R.drawable.dog_30);
                        break;
                    case R.id.Rdocat:
                        imgPet.setImageResource(R.drawable.cat_30);
                        break;
                    case R.id.Rdorabbit:
                        imgPet.setImageResource(R.drawable.rabbit_30);
                        break;
                    default:
                        Toast.makeText(getApplicationContext(),"동물 먼저 선택하세요",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}