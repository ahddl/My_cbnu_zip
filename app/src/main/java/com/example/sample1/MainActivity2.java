package com.example.sample1;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;


public class MainActivity2 extends AppCompatActivity {

    ImageView imageView1;

    Button outputOk;
    Button outputNo;
    TextView outputmenu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        imageView1 = findViewById(R.id.imageView1);

        //사진 받아 출력
        String imageUriString = getIntent().getStringExtra("imageUri");
        Uri imageUri = Uri.parse(imageUriString);
        imageView1.setImageURI(imageUri);

        outputOk.setOnClickListener(v -> {
            String outputMenu = outputmenu.getText().toString();
            Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
            intent.putExtra("outputMenu", outputMenu);
            startActivity(intent);
        });

        outputNo.setOnClickListener(v -> {
            Intent intent2 = new Intent(MainActivity2.this, MainActivity.class);
            startActivity(intent2);
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

}