package com.atividade.model;

// @author JoaoVitor

public abstract class Permissoes implements RegraUsuarioAdministradorEvoluido, RegraUsuarioAdministradorPadrao {
      protected Usuario usuario;

      public Permissoes(Usuario usuario) {
            this.usuario = usuario;
      }

      @Override
      public void enviarMensagem(UsuarioRepository repository) {
          throw new RuntimeException("Não é possível enviar mensagem.");
      }
      
      @Override
      public void autorizarUsuario(Usuario usuario) {
          throw new RuntimeException("Não é possível autorizar usuario.");
      }

      @Override
      public void evoluirUsuario(Usuario usuario) {
          throw new RuntimeException("Não é possível evoluir usuario.");
      }
      
      @Override
      public void rebaixarUsuario(Usuario usuario) {
          throw new RuntimeException("Não é possível rebaixar usuario.");
      }
}
