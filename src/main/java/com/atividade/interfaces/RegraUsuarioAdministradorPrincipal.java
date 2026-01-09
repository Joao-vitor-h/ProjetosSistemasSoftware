/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.atividade.interfaces;

import com.atividade.model.Usuario;

/**
 *
 * @author JoaoVitor
 */
public interface RegraUsuarioAdministradorPrincipal {
    // Mandar notificações, aceitar novos usuários e evoluir ou rebaixar usuários.
    abstract void evoluirUsuario(Usuario usuario);
    abstract void rebaixarUsuario(Usuario usuario);
}
