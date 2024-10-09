package com.example.model;

public class Agendamento {

    private Long id;

    private String data;
    private String horas;
    private String servico;

    private Funcionario funcionario;

    private Usuario usuario;

    private Orcamento orcamento;
    private String statusAgenda;


    public String getStatusAgenda() {
        return statusAgenda;
    }
    public void setStatusAgenda(String statusAgenda) {
        this.statusAgenda = statusAgenda;
    }

    public String getHoras() {
        return horas;
    }
    public void setHoras(String horas) {
        this.horas = horas;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getServico() {
        return servico;
    }
    public void setServico(String servico) {
        this.servico = servico;
    }
    public Funcionario getProfissional() {
        return funcionario;
    }
    public void setProfissional(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    public Funcionario getFuncionario() {
        return funcionario;
    }
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}

