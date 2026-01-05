package com.atividade.model;

import java.time.LocalDate;

/**
 *
 * @author JoaoVitor
 */
public class UsuarioModel {
    private String nome;
    private String senha;
    private String email;
    private String tipoUsuario;
    private LocalDate dataCadastro;
    private int totalNotificacao;
    private int notificacoesLidas;
    
    public UsuarioModel(String nome, String senha, String email, String tipoUsuario) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.tipoUsuario = tipoUsuario;
        this.dataCadastro = LocalDate.now();
        this.totalNotificacao = 0;
        this.notificacoesLidas = 0;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getTipoUsuario() {
        return tipoUsuario;
    }
    
    public LocalDate getDataCadastro() {
        return dataCadastro;
    }
    
    public int getTotalNoficacao() {
        return totalNotificacao;
    }
    
    public int getNotificacaoLidas() {
        return notificacoesLidas;
    }
    
    public void adicionarNotificacao() {
        this.totalNotificacao++;
    }
    
    public void adicionarNotificacaoLida() {
        this.notificacoesLidas++;
    }
    
    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    
    public void setSenha(String senha, String senha2) throws RuntimeException {
        if(!(senha.equals(senha2))) {
            throw new RuntimeException("Erro de confirmacao de senha.");
        }
        this.senha = senha;
    }
}