package com.example.model;

import java.time.LocalDate;

public class Orcamento {
        private long id;
        private String cor;
        private String horas;
        private String hora;
        private double valor;
        private LocalDate data;
        private String statusOrcamento;

        private Funcionario funcionario;
        private Usuario usuario;

        public String getHora() {
            return hora;
        }
        public void setHora(String hora) {
            this.hora = hora;
        }
        public double getValor() {
            return valor;
        }
        public void setValor(double valor) {
            this.valor = valor;
        }
        public String getStatusOrcamento() {
            return statusOrcamento;
        }
        public void setStatusOrcamento(String statusOrcamento) {
            this.statusOrcamento = statusOrcamento;
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
        public LocalDate getData() {
            return data;
        }
        public void setData(LocalDate data) {
            this.data = data;
        }
        public long getId() {
            return id;
        }
        public void setId(long id) {
            this.id = id;
        }
        public String getCor() {
            return cor;
        }
        public void setCor(String cor) {
            this.cor = cor;
        }
        public String getHoras() {
            return horas;
        }
        public void setHoras(String horas) {
            this.horas = horas;
        }


    }
