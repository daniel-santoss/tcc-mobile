package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText edLogin;
    private EditText edSenha;
    private Button btnEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);


        edLogin = (EditText) findViewById(R.id.edLogin);
        edSenha = (EditText) findViewById(R.id.edSenha);
        btnEntrar = (Button) findViewById(R.id.btnEntrar);

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Boolean isValido = true;

                // Verifica se o campo de login está vazio
                if (edLogin.getText().toString() == null ||
                        edLogin.getText().toString().trim().length() == 0) {
                    isValido = false;
                    edLogin.setError(getString(R.string.msg_erro_campo_vazio));
                }

                // Verifica se o campo de senha está vazio
                if (edSenha.getText().toString() == null ||
                        edSenha.getText().toString().trim().length() == 0) {
                    isValido = false;
                    edSenha.setError(getString(R.string.msg_erro_campo_vazio));
                }

                // Se tudo estiver válido
                if (isValido) {
                    Intent intent = new Intent(MainActivity.this, agenda.class);
                    startActivity(intent);
                } else {
                    // Exibe a mensagem de erro caso não seja válido
                    Toast.makeText(MainActivity.this, getString(R.string.msg_form_invalido), Toast.LENGTH_LONG).show();
                }
            }
        });

        };
    }


