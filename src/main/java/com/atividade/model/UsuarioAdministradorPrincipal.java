package com.atividade.model;

/**
 *
 * @author JoaoVitor
 */

// Nessa classe utilizei o padrão de projeto Singleton para não depender do repository,
// pois em testes foi necessário criar a repository.

public class UsuarioAdministradorPrincipal extends UsuarioAdministradorEvoluido {
    
    public UsuarioAdministradorPrincipal(Usuario usuario) {
        super(usuario);
    }
    
    // Mandar notificações, autorizar usuários e evoluir ou rebaixar usuários.
    
    @Override
    public void atribuirPermissaoUsuario(Usuario usuarioEvoluido) {
        this.usuario.alterarPermissoes(usuarioEvoluido, new UsuarioAdministradorEvoluido(usuarioEvoluido));
    }
    
    @Override
    public void retirarPermissaoUsuario(Usuario usuarioRebaixado) {
        this.usuario.alterarPermissoes(usuarioRebaixado, null);
    }
    
    @Override
    public String toString() {
        return "ADMINISTRADOR PRINCIPAL";
    }
}
