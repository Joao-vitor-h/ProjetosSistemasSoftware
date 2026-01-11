package com.atividade.main;

import com.atividade.interfaces.UsuarioRepository;
import com.atividade.presenter.SalvarUsuarioPresenter;
import com.atividade.repository.UsuarioRepositoryMockado;

/**
 *
 * @author JoaoVitor
 */

public class Main {

    public static void main(String[] args) {
        UsuarioRepository repository = new UsuarioRepositoryMockado();
        try {
            SalvarUsuarioPresenter telaCadastroPresenter = new SalvarUsuarioPresenter(repository);
        } catch (Exception ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
    }
}
