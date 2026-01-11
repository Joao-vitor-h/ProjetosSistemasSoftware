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
    
    @Override
    public String toString() {
        return "PADRAO";
    }
}
