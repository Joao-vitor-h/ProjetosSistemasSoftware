package com.atividade.model;

import com.atividade.repository.UsuarioRepositoryMockado;
import java.time.LocalDate;

/**
 *
 * @author JoaoVitor
 */

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private Permissoes tipoUsuario;
    private LocalDate dataCadastro;
    private int totalNotificacao;
    private int notificacoesLidas;
    
    public Usuario(String nome, String senha, String email) {
        if(nome.isEmpty() || senha.isEmpty() || email.isEmpty()) {
            throw new RuntimeException("Campos não foram preenchidos.");
        }
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.dataCadastro = LocalDate.now();
        this.totalNotificacao = 0;
        this.notificacoesLidas = 0;
        setTipoUsuario();
    }
    
    private void setTipoUsuario() {
        if(UsuarioRepositoryMockado.tamanhoListaUsuarios() == 0) {
            this.tipoUsuario = new UsuarioAdministradorPrincipal(this);
        }
        else {
            this.tipoUsuario = null;
        }
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getEmail() {
        return email;
    }
    
    public Permissoes getPermissoes() {
        if(tipoUsuario == null) {
            throw new NullPointerException("Usuário: " + email + " não pode realizar essa operação.");
        }
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
    
    public void alterarSenha(String senhaAntiga, String senha, String confirmacaoSenha) {
        if(senhaAntiga.isEmpty() || senha.isEmpty() || confirmacaoSenha.isEmpty()) {
            throw new RuntimeException("Preencha todos os campos.");
        }
        if(!(senha.equals(confirmacaoSenha))) {
            throw new RuntimeException("As senhas não são iguais.");
        }
        this.senha = senha;
    }
    
    public void alterarPermissoes(Usuario usuario, Permissoes instancia) {
        if(usuario == null) {
            throw new RuntimeException("Usuário não é válido.");
        }
        if(!(this.tipoUsuario instanceof UsuarioAdministradorPrincipal)) {
            throw new RuntimeException("Você não tem permissão para alterar as permissões de usuário.");
        }
        usuario.tipoUsuario = instancia;
    }
    
    @Override
    public String toString() {
        if(tipoUsuario == null) {
            return "USUARIO: " + nome + " - E-MAIL: " + email + " - TIPO: PADRAO"; 
        }
        return "USUARIO: " + nome + " - E-MAIL: " + email + " - TIPO: " + tipoUsuario; 
    }
}