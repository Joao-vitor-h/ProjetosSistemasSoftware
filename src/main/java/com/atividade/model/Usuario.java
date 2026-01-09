package com.atividade.model;

import java.time.LocalDate;

/**
 *
 * @author JoaoVitor
 */

// Preciso fazer muitas alterações, pois o papel dessa classe vai mudar.

public class Usuario {
    private String nome;
    private String senha;
    private String email;
    private String tipoUsuario;
    /**
    *
    * O tipo do atributo acima irá mudar para "RegraUsuario", pois a partir da instância
    * definida o usuário terá acesso a novas funcionalidades.
    */
    private LocalDate dataCadastro;
    private int totalNotificacao;
    private int notificacoesLidas;
    private static int superAdm = 0; // Isso aqui vai sumir.
    
    public Usuario(String nome, String senha, String email, String tipoUsuario) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.tipoUsuario = tipoUsuario;
        this.dataCadastro = LocalDate.now();
        this.totalNotificacao = 0;
        this.notificacoesLidas = 0;
        if(superAdm == 0) {
            superAdm = 1; // Quer dizer que recebeu o primeiro usuário.
        }
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
    
    public static int getSuperAdm() {
        return superAdm;
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
    
    public void setSenha(String senha, String senha2) {
        if(!(senha.equals(senha2))) {
            throw new RuntimeException("Erro de confirmacao de senha.");
        }
        this.senha = senha;
    }
    
    @Override
    public String toString() {
        return "USUARIO: " + nome + " - E-MAIL: " + email + " - SENHA: " + senha +
               " - TIPO: " + tipoUsuario; 
    }
}