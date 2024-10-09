package com.example.login;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio);

        ImageButton buttonFace = findViewById(R.id.imageFace);
        ImageButton buttonInsta = findViewById(R.id.imageInsta);
        Button inicioButton = findViewById(R.id.btn_inicio);

        buttonFace.setOnClickListener(v -> {
            String url = "https://https://www.facebook.com";
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);
        });

        buttonInsta.setOnClickListener(v -> {
            String url = "https://https://www.instagram.com";
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);
        });

        inicioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Inicio.this, MainActivity.class);
                startActivity(intent);

            }
        });
    }
}
