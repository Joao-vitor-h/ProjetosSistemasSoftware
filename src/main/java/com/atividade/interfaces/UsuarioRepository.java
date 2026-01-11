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
    
    abstract int tamanhoListaUsuarios();
    
    abstract List<Usuario> getUsuarios();
}
