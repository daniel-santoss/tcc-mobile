package com.example.login;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.login.databinding.ItemAgendamentoBinding;
import com.example.model.Agendamento;

import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link Agendamento}.
 * TODO: Replace the implementation with code for your data type.
 */
public class agendamentoAdapter1 extends RecyclerView.Adapter<agendamentoAdapter1.ViewHolder> {

    private final List<Agendamento> mValues;

    public agendamentoAdapter1(List<Agendamento> items) {
        mValues = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new ViewHolder(ItemAgendamentoBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));

    }
        //MOSTRAR OS VALORES

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        Agendamento valor = mValues.get(position);
        holder.mItem = mValues.get(position);
        // holder.mIdView.setText(mValues.get(position).id);
        // holder.mContentView.setText(mValues.get(position).content);
        holder.dia.setText(valor.getData());
        holder.horario.setText(valor.getHoras());
        holder.servico.setText(valor.getServico());
        holder.profissional.setText(valor.getFuncionario().getNome());

    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public Agendamento mItem;

        public TextView dia;
        public TextView horario;
        public TextView servico;
        public TextView profissional;

        public ViewHolder(ItemAgendamentoBinding binding) {
            super(binding.getRoot());
            dia = binding.viewDiasMarcados;
            horario = binding.viewHorarios;
            servico = binding.viewServicos;
            profissional = binding.viewProfissional;
        }
    }
}