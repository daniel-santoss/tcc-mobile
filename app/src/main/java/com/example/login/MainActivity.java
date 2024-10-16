package com.example.login;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.api.RetrofitClient;
import com.example.api.UsuarioService;
import com.example.model.Usuario;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private EditText edLogin;
    private EditText edSenha;
    private Button btnEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        TextView titulo = findViewById(R.id.titulo_ink);
        UsuarioService service = RetrofitClient.obterUsuarioService();
        Call<Usuario> requisicao = service.getUsuario(1l);


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
                    Call<Usuario> requisicao = service.login(edLogin.getText().toString(), edSenha.getText().toString());
                    requisicao.enqueue(new Callback<Usuario>() {
                        @Override
                        public void onResponse(Call<Usuario> call, Response<Usuario> response) {
                            Usuario usuario = response.body();

                            System.out.println(usuario);

                                System.out.println(usuario);
                                SharedPreferences sharedPreferences = getSharedPreferences("dados", Context.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("email", edLogin.getText().toString());

                                editor.apply();
                                Intent intent = new Intent(MainActivity.this, Agenda.class);
                                startActivity(intent);

                        }

                        @Override
                        public void onFailure(Call<Usuario> call, Throwable t) {
                            System.out.println(t);
                            Toast toast =  Toast.makeText(getApplicationContext(),"Usuário ou senha inválidos", Toast.LENGTH_LONG);
                            toast.show();
                        }
                    });

                } else {
                    // Exibe a mensagem de erro caso não seja válido
                    Toast.makeText(MainActivity.this, getString(R.string.msg_form_invalido), Toast.LENGTH_LONG).show();
                }
            }
        });

    };
}


