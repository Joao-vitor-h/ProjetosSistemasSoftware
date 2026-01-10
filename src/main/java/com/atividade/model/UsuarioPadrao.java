/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.atividade.model;

import com.atividade.interfaces.RegraUsuario;

/**
 *
 * @author JoaoVitor
 */
public class UsuarioPadrao implements RegraUsuario {
    
    @Override
    public boolean alterarSenha(String senha, String senha2) {
        return false; // Precisa de implementação.
    }
}
