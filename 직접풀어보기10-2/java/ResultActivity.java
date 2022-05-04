package com.cookandroid.project10_2;

import android.content.Intent;
import android.media.Image;
import android.media.Rating;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        setTitle("2018038033 김태인 투표 결과");

        Intent intent = getIntent();
        int[] voteResult = intent.getIntArrayExtra("VoteCount");
        String[] imageName = intent.getStringArrayExtra("ImageName");

        Integer imageField[] = {R.drawable.a1, R.drawable.a2, R.drawable.a3,
                R.drawable.a4, R.drawable.a5, R.drawable.a6,
                R.drawable.a7, R.drawable.a8, R.drawable.a9};

        TextView tvTop = findViewById(R.id.tvTop);
        ImageView ivTop = findViewById(R.id.ivTop);
        int maxEntry = 0;
        for (int i = 1; i < voteResult.length; i++)
        {
            if(voteResult[maxEntry] < voteResult[i])
                maxEntry = i;
        }
        tvTop.setText(imageName[maxEntry]);
        ivTop.setImageResource(imageField[maxEntry]);

        TextView tv[] = new TextView[imageName.length];
        RatingBar rbar[] = new RatingBar[imageName.length];

        Integer tvID[] = {R.id.tv1, R.id.tv2, R.id.tv3,
                R.id.tv4, R.id.tv5, R.id.tv6,
                R.id.tv7, R.id.tv8, R.id.tv9};
        Integer rbarID[] = {R.id.rbar1, R.id.rbar2, R.id.rbar3,
                R.id.rbar4, R.id.rbar5, R.id.rbar6,
                R.id.rbar7, R.id.rbar8, R.id.rbar9};

        for (int i = 0; i < voteResult.length; i++)
        {
            tv[i] = (TextView) findViewById(tvID[i]);
            rbar[i] = (RatingBar) findViewById(rbarID[i]);
        }

        for (int i = 0; i < voteResult.length; i++)
        {
            tv[i].setText(imageName[i]);
            rbar[i].setRating((float) voteResult[i]);
        }

        Button btnReturn = (Button) findViewById(R.id.btnReturn);
        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
