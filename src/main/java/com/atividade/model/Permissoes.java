package com.atividade.model;

import com.atividade.interfaces.UsuarioRepository;

/**
 *
 * @author JoaoVitor
 */

public abstract class Permissoes {
    protected Usuario usuario;
    
    public Permissoes(Usuario usuario) {
        this.usuario = usuario;
    }

    public void enviarMensagem(UsuarioRepository repository) {
        throw new RuntimeException("Você não tem permissão para enviar mensagem.");
    }

    public void autorizarUsuario(Usuario usuario) {
        throw new RuntimeException("Você não tem permissão para autorizar usuario.");
    }

    // Função responsável por evoluir o usuário.
    public void atribuirPermissaoUsuario(Usuario usuario) {
        throw new RuntimeException("Você não tem permissão para evoluir usuario.");
    }
    // Função responsável por rebaixar o usuário.
    public void retirarPermissaoUsuario(Usuario usuario) {
        throw new RuntimeException("Você não tem permissão para rebaixar usuario.");
    }
}
