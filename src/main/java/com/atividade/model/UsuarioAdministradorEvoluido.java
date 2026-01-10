package com.atividade.model;

import com.atividade.interfaces.RegraUsuario;
import com.atividade.interfaces.RegraUsuarioAdministradorEvoluido;
import com.atividade.interfaces.UsuarioRepository;

/**
 *
 * @author JoaoVitor
 */

public class UsuarioAdministradorEvoluido implements RegraUsuario, 
                                                     RegraUsuarioAdministradorEvoluido {
    
    // Mandar notificações e autorizar usuários.
    @Override
    public boolean alterarSenha(String senha, String senha2) {
        return false; // Precisa de implementação.
    }
    
    @Override
    public void enviarMensagem(UsuarioRepository repository) {
        // Precisa de implementação.
    }
    
    @Override
    public void autorizarUsuario(Usuario usuario) {
        // Precisa de implementação.
    }
    
    @Override
    public String toString() {
        return "ADMINISTRADOR EVOLUIDO";
    }
}
