package com.example.dietimagerecognition;

import static java.nio.file.Files.createFile;

import android.content.ContentResolver;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    ImageButton gallerybutton;
    Uri uri;
    ImageView imageView;
    File file;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        /*View anotherLayout = getLayoutInflater().inflate(R.layout.activity_menu, null);
        imageView = anotherLayout.findViewById(R.id.imageView);*/
        ImageButton camerabutton = findViewById(R.id.camerabutton);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Menu.class);
                startActivity(intent);
            }
        });

        /*camerabutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                takePicture();
            }
        });*/

        ImageButton gallerybutton = findViewById(R.id.gallerybutton);
        gallerybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGallery();
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    //deprecated 된거 해결한 코드
   /* private final ActivityResultLauncher<Intent> cameraLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(),
            result -> {
                if (result.getResultCode() == RESULT_OK) {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inSampleSize = 8;
                    Bitmap bitmap = BitmapFactory.decodeFile(file.getAbsolutePath(), options);

                    imageView.setImageBitmap(bitmap);
                }
            });*/

    /*public void takePicture(){
        try {
            file = createFile();
            if (file.exists()) {
                file.delete();
            }

            file.createNewFile();
        }catch(Exception e){
            e.printStackTrace();
        }
        if(Build.VERSION.SDK_INT>=24){
            uri= FileProvider.getUriForFile(this, getApplicationContext().getPackageName() + ".provider", file);
        }else{
            uri=Uri.fromFile(file);
        }

        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
        intent.putExtra(MediaStore.EXTRA_OUTPUT,uri);

        cameraLauncher.launch(intent);
    }

    private File createFile(){
        String filename = "capture.jpg";
        File outFile = new File(getFilesDir(),filename);
        Log.d("Main","File path : "+ outFile.getAbsolutePath());

        return outFile;
    }*/

    //이건 deprecated 되기전 코드
   /* @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode,resultCode,data);

        if(requestCode==101 && resultCode == RESULT_OK){
    BitmapFactory.Options options = new BitmapFactory.Options();
    options.inSampleSize=8;
    Bitmap bitmap = BitmapFactory.decodeFile(file.getAbsolutePath(),options);

    imageView.setImageBitmap(bitmap);
        }
    }*/


    public void openGallery() {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);

        galleryLauncher.launch(intent);
    }

    private final ActivityResultLauncher<Intent> galleryLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(),
            result -> {
                if (result.getResultCode() == RESULT_OK) {
                    Intent data = result.getData();
                    if (data != null) {
                        Uri fileUri = data.getData();
                        if (fileUri != null) {
                            ContentResolver resolver = getContentResolver();

                            try {
                                InputStream instream = resolver.openInputStream(fileUri);
                                Bitmap imgBitmap = BitmapFactory.decodeStream(instream);
                                gallerybutton.setImageBitmap(imgBitmap);

                                instream.close();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            });
}

   /* @Override
    protected void onActivityResult(int requestCode,int resultCode, Intent data){
        super.onActivityResult(requestCode,resultCode,data);

        if(requestCode==101){
            if(resultCode==RESULT_OK){
                Uri fileUri = data.getData();

                ContentResolver resolver = getContentResolver();

                try {
                    InputStream instream = resolver.openInputStream(fileUri);
                    Bitmap imgBitmap = BitmapFactory.decodeStream(instream);
                    gallerybutton.setImageBitmap(imgBitmap);

                    instream.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }*/


   /* ActivityResultLauncher<Intent>startActivityResult=registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
        @Override
        public void onActivityResult(ActivityResult result) {
            if (result.getResultCode() == RESULT_OK && result.getData() != null) {
                uri = result.getData().getData();

                try {
                    Bitmap bitmap = MediaStore.Images.Media.getContentUri(getContentResolver(), uri);
                    gallerybutton.setImageBitmap(bitmap);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    });*/
