package com.example.api;

import com.example.model.Usuario;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface UsuarioService {

    @POST("login")
    Call<Usuario> login(@Body Usuario usuario);

    @GET("agenda")
    Call<String> consultarAgenda();

    @GET("usuarios/{id}")
    Call<Usuario> getUsuario(@Path("id") Long id);
}
