package com.atividade.main;

import com.atividade.interfaces.UsuarioRepository;
import com.atividade.model.Usuario;
import com.atividade.repository.UsuarioRepositoryMockado;

/**
 *
 * @author JoaoVitor
 */

public class Main {

    public static void main(String[] args) {
//        UsuarioRepository repository = new UsuarioRepositoryMockado();
//        try {
//            SalvarUsuarioPresenter telaCadastroPresenter = new SalvarUsuarioPresenter(repository);
//        } catch (Exception ex) {
//            System.out.println("Erro: " + ex.getMessage());
//        }

        UsuarioRepository repository = new UsuarioRepositoryMockado();
        Usuario adm = new Usuario("Joao", "1234", "joao@adm.com");
        repository.salvarUsuario(adm);
        Usuario candidato = new Usuario("teste", "4321", "teste@padrao.com");
        repository.salvarUsuario(candidato);
        
        try {
            candidato.getPermissoes().atribuirPermissaoUsuario(candidato);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        System.out.println(candidato);
        System.out.println(UsuarioRepositoryMockado.tamanhoListaUsuarios());
    }
}
