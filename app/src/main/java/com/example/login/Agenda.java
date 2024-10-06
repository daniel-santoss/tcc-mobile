package com.example.login;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Agenda extends AppCompatActivity {

    private EditText viewBemVindo;

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
                Intent intent = new Intent(Agenda.this, Inicio.class);
                startActivity (intent);
            }
        });
    }

  /*  private void carregarAgendamentos(Long usuarioId) {
        AgendaService agendaService = RetrofitClient.obterAgendaService();

        Call<List<Agendamento>> call = agendaService.getAgendamentosByUsuarioId(usuarioId);

        call.enqueue(new Callback<List<Agendamento>>() {
            @Override
            public void onResponse(Call<List<Agendamento>> call, Response<List<Agendamento>> response) {
                if (!response.isSuccessful()) {
                    Log.e("Erro", "Codigo: " + response.code());
                    return;
                }

                List<Agendamento> agendamentosResponse = response.body();
                if (agendamentosResponse != null) {
                    agendamentos.clear();
                    agendamentos.addAll(agendamentosResponse);
                    agendamentosAdapter.notifyDataSetChanged(); // Atualiza o RecyclerView

            }

            @Override
            public void onFailure(Call<List<Agendamento>> call, Throwable t) {

            }
        });
    } }*/
}