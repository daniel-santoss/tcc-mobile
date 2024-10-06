package com.example.api;

import com.example.model.Agendamento;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface AgendaService {

    @GET("api/agendamentos/usuario/{id}")
    Call<List<Agendamento>> getAgendamentosByUsuarioId(@Path("id") Long id);
}
