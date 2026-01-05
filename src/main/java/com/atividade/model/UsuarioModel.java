package com.atividade.model;

/**
 *
 * @author JoaoVitor
 */
public class UsuarioModel {
    private String nome;
    private String senha;
    private String email;
    private String tipoUsuario;
    
    public UsuarioModel(String nome, String senha, String email, String tipoUsuario) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.tipoUsuario = tipoUsuario;
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