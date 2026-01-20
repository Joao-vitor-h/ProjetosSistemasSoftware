package com.atividade.model;

import com.atividade.interfaces.UsuarioRepository;

/**
 *
 * @author JoaoVitor
 */

public class UsuarioAdministradorEvoluido extends Permissoes {
    
    public UsuarioAdministradorEvoluido(Usuario usuario) {
        super(usuario);
    }
    
    // Mandar notificações e autorizar usuários.
    
    @Override
    public void enviarMensagem(UsuarioRepository repository) {
        // Precisa de implementação.
    }
    
    @Override
    public void autorizarUsuario(Usuario usuario) {
        System.out.printf("Usuario: %s autorizado.", usuario.getNome());
    }
    
    @Override
    public String toString() {
        return "ADMINISTRADOR EVOLUIDO";
    }
}
