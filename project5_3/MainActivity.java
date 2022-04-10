package com.cookandroid.project5_3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);



        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);

        LinearLayout baseLayout = new LinearLayout(this);
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        baseLayout.setBackgroundColor(Color.rgb(0,255,0));
        setContentView(baseLayout,params);

        TextView textView = new TextView(this);
        textView.setText("2020044005 김민정");
        baseLayout.addView(textView);

        EditText edit = new EditText(this);
        edit.setHint("문자를 입력하시오");
        TextView tv = new TextView(this);
        baseLayout.addView(edit);


        Button btn = new Button(this);
        btn.setText("버튼입니다");
        btn.setBackgroundColor(Color.MAGENTA);
        baseLayout.addView(btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(), edit.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        edit.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                tv.setText(edit.getText());
                return false;
            }
        });

    }
}