/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.atividade.model;

import com.atividade.interfaces.RegraUsuario;
import com.atividade.interfaces.RegraUsuarioAdministradorEvoluido;
import com.atividade.interfaces.RegraUsuarioAdministradorPrincipal;
import com.atividade.interfaces.UsuarioRepository;

/**
 *
 * @author JoaoVitor
 */

// Nessa classe vou usar o padrão singleton, pois só pode haver uma instância da mesma.

public class UsuarioAdministradorPrincipal implements RegraUsuario, 
                                                     RegraUsuarioAdministradorEvoluido,
                                                     RegraUsuarioAdministradorPrincipal {
    
    // Mandar notificações, autorizar usuários e evoluir ou rebaixar usuários.
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
    public void evoluirUsuario(Usuario usuario) {
        // Precisa de implementação.
    }
    
    @Override
    public void rebaixarUsuario(Usuario usuario) {
        // Precisa de implementação.
    }
}
