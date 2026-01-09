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
public interface RegraUsuarioAdministradorEvoluido {
    // Mandar notificações e aceitar novos usuários.
    abstract void enviarMensagem(UsuarioRepository repository);
    abstract void autorizarUsuario(Usuario usuario);
}
