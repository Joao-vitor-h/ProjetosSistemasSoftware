package com.atividade.model;

import com.atividade.interfaces.RegraUsuario;
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
    private RegraUsuario tipoUsuario; // Define qual se o usuário é ADM, ADM-EVOLUIDO ou PADRAO.
    private LocalDate dataCadastro;
    private int totalNotificacao;
    private int notificacoesLidas;
    
    public Usuario(String nome, String senha, String email, RegraUsuario tipoUsuario) {
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
    
    public RegraUsuario getTipoUsuario() {
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
    
    @Override
    public String toString() {
        return "USUARIO: " + nome + " - E-MAIL: " + email + " - SENHA: " + senha +
               " - TIPO: " + tipoUsuario; 
    }
}