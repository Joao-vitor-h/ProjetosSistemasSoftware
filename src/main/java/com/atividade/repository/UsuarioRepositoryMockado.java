/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.atividade.repository;

import com.atividade.model.UsuarioModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JoaoVitor
 */
public class UsuarioRepositoryMockado {
    private List<UsuarioModel> usuarios;
    
    public UsuarioRepositoryMockado() {
        usuarios = new ArrayList<UsuarioModel>();
    }
    
    public void salvar(UsuarioModel usuario) {
        if(usuario == null) {
            throw new RuntimeException("Usuário está nulo.");
        }
        usuarios.add(usuario);
    }
    
    public List<UsuarioModel> getUsuarios() {
        if(usuarios.isEmpty()) {
            throw new RuntimeException("Não existem usuários cadastrados.");
        }
        return usuarios;
    }
}
