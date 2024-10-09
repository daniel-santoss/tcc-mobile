/*  public class AgendamentoAdapter extends RecyclerView.Adapter<AgendamentoAdapter.AgendamentoViewHolder> {

    private List<Agendamento> agendamentoList;

    public AgendamentoAdapter(List<Agendamento> agendamentoList) {
        this.agendamentoList = agendamentoList;
    }

    @NonNull
    @Override
    public AgendamentoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.item_agendamento, parent, false);
        return new AgendamentoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AgendamentoViewHolder holder, int position) {
        Agendamento agendamento = agendamentoList.get(position);
        holder.diaMarcado.setText(agendamento.getDiaMarcado());
        holder.horario.setText(agendamento.getHorario());
        holder.tipoServico.setText(agendamento.getTipoServico());
        holder.profissional.setText(agendamento.getProfissional());
    }

    @Override
    public int getItemCount() {
        return agendamentoList.size();
    }

    public static class AgendamentoViewHolder extends RecyclerView.ViewHolder {

        TextView diaMarcado, horario, tipoServico, profissional;

        public AgendamentoViewHolder(@NonNull View itemView) {
            super(itemView);
            diaMarcado = itemView.findViewById(R.id.tv_dia_marcado);
            horario = itemView.findViewById(R.id.tv_horario);
            tipoServico = itemView.findViewById(R.id.tv_tipo_servico);
            profissional = itemView.findViewById(R.id.tv_profissional);
        }
    }*/

