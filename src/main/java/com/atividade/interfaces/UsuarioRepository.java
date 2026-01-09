/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.atividade.interfaces;

import com.atividade.model.Usuario;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author JoaoVitor
 */

public interface UsuarioRepository {
    
    abstract void salvarUsuario(Usuario usuario);
    
    abstract boolean removerUsuario(String email);
    
    abstract Optional<Usuario> buscarUsuarioPorEmail(String email);
    
    abstract List<Usuario> getUsuarios();
}
