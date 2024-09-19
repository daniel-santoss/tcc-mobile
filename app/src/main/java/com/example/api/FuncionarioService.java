package com.example.api;

import com.example.model.Usuario;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface FuncionarioService {

    @POST("funcionario/login")
    Call<Usuario> login(@Query("email") String name, @Query("senha") String senha);

    @GET("agenda")
    Call<String> consultarAgenda();

    @GET("funcionario/{id}")
    Call<Usuario> getUsuario(@Path("id") Long id);
}
