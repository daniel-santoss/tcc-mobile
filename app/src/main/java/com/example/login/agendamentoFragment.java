package com.example.login;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.api.AgendaService;
import com.example.api.RetrofitClient;
import com.example.model.Agendamento;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A fragment representing a list of Items.
 */
public class agendamentoFragment extends Fragment {

    // TODO: Customize parameter argument names
    private static final String ARG_COLUMN_COUNT = "column-count";
    // TODO: Customize parameters
    private int mColumnCount = 1;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public agendamentoFragment() {
    }

    // TODO: Customize parameter initialization
    @SuppressWarnings("unused")
    public static agendamentoFragment newInstance(int columnCount) {
        agendamentoFragment fragment = new agendamentoFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_COLUMN_COUNT, columnCount);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mColumnCount = getArguments().getInt(ARG_COLUMN_COUNT);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.lista_agendamento, container, false);

        SharedPreferences sharedPreferences = getActivity().getSharedPreferences("dados", Context.MODE_PRIVATE);
        String email = sharedPreferences.getString("email","email não identificado");
        AgendaService service = RetrofitClient.obterAgendaService();
        Call<List<Agendamento>> requisicao = service.getAgendamentosByUsuarioEmail(email);
        requisicao.enqueue(new Callback<List<Agendamento>>() {
            @Override
            public void onResponse(Call<List<Agendamento>> call, Response<List<Agendamento>> response) {

                List<Agendamento> agendamentos = response.body();
                System.out.println(agendamentos);
                RecyclerView recyclerView = (RecyclerView) view;
                recyclerView.setAdapter(new agendamentoAdapter1(agendamentos));

            }

            @Override
            public void onFailure(Call<List<Agendamento>> call, Throwable t) {
                System.out.println(t);

            }
        });

        // Set the adapter
        if (view instanceof RecyclerView) {

            Context context = view.getContext();
            RecyclerView recyclerView = (RecyclerView) view;
            if (mColumnCount <= 1) {
                recyclerView.setLayoutManager(new LinearLayoutManager(context));
            } else {

                recyclerView.setLayoutManager(new GridLayoutManager(context, mColumnCount));
            }

            recyclerView.setAdapter(new agendamentoAdapter1(new ArrayList<>()));

        }
        return view;
    }
}