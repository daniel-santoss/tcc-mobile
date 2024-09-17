package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class agenda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda);
        Button voltar_login = findViewById(R.id.voltarAgenda);
        SharedPreferences sharedPreferences = getSharedPreferences("dados", Context.MODE_PRIVATE);
        String email = sharedPreferences.getString("email","email não identificado");
        System.out.println(email);
        voltar_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(agenda.this, inicio.class);
                startActivity (intent);
            }
        });
    }
}