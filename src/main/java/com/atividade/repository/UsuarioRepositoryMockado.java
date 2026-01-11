package com.atividade.repository;

import com.atividade.interfaces.UsuarioRepository;
import com.atividade.model.Usuario;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author JoaoVitor
 */

public class UsuarioRepositoryMockado implements UsuarioRepository {
    private List<Usuario> listaUsuarios;
    
    public UsuarioRepositoryMockado() {
        listaUsuarios = new ArrayList<Usuario>();
    }
    
    @Override
    public void salvarUsuario(Usuario usuario) {
        if(usuario == null) {
            throw new RuntimeException("Usuário está nulo.");
        }
        listaUsuarios.add(usuario);
    }
    
    @Override
    public boolean removerUsuario(String email) {
        if(email == null) {
            throw new RuntimeException("O e-mail é nulo.");
        }
        
        Optional<Usuario> usuario = buscarUsuarioPorEmail(email);
        
        if(!usuario.isPresent()){
            return false;
        }
        listaUsuarios.remove(usuario.get());
        return true;
    }
    
    @Override
    public Optional<Usuario> buscarUsuarioPorEmail(String email) {
        if(email == null) {
            return Optional.empty();
        }
        
        for(Usuario usuarioRecuperado : listaUsuarios) {
            if(usuarioRecuperado.getEmail().equals(email)) {
                return Optional.of(usuarioRecuperado);
            }
        }
        
        return Optional.empty();
    }
    
    @Override
    public int tamanhoListaUsuarios() {
        return listaUsuarios.size();
    }
    
    @Override
    public List<Usuario> getUsuarios() {
        if(listaUsuarios.isEmpty()) {
            throw new RuntimeException("Não existem usuários cadastrados.");
        }
        return listaUsuarios;
    }
}
