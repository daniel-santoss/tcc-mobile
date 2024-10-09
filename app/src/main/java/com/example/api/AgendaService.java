package com.example.api;

import com.example.model.Agendamento;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface AgendaService {
    @GET("agenda/usuario/{email}")
    Call<List<Agendamento>> getAgendamentosByUsuarioEmail(@Path("email") String email);
}
