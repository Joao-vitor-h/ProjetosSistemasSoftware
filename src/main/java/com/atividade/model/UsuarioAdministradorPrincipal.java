package com.atividade.model;

import com.atividade.interfaces.RegraUsuario;
import com.atividade.interfaces.RegraUsuarioAdministradorEvoluido;
import com.atividade.interfaces.RegraUsuarioAdministradorPrincipal;
import com.atividade.interfaces.UsuarioRepository;
import java.util.Optional;

/**
 *
 * @author JoaoVitor
 */

// Nessa classe utilizei o padrão de projeto Singleton adaptado.

public class UsuarioAdministradorPrincipal extends Permissoes {
    
    // Mandar notificações, autorizar usuários e evoluir ou rebaixar usuários.
    
    @Override
    public void enviarMensagem(UsuarioRepository repository) {
        // Precisa de implementação.
    }
    
    @Override
    public void autorizarUsuario(Usuario usuario) {
        // Precisa de implementação.
    }
    
    @Override
    public void evoluirUsuario(Usuario usuario) {
        // Precisa de implementação.
    }
    
    @Override
    public void rebaixarUsuario(Usuario usuario) {
        // Precisa de implementação.
    }
    
    @Override
    public String toString() {
        return "ADMINISTRADOR PRINCIPAL";
    }
}
