package com.atividade.interfaces;

import com.atividade.model.Usuario;

/**
 *
 * @author JoaoVitor
 */

public interface RegraUsuarioAdministradorEvoluido {
    // Mandar notificações e aceitar novos usuários.
    abstract void enviarMensagem(UsuarioRepository repository);
    abstract void autorizarUsuario(Usuario usuario);
}
