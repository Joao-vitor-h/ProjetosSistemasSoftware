package com.atividade.presenter;

import com.atividade.interfaces.UsuarioRepository;
import com.atividade.model.Usuario;
import com.atividade.view.CadastroUsuarioView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author JoaoVitor
 */

public class SalvarUsuarioPresenter {
    private CadastroUsuarioView telaCadastro;
    private Usuario usuario;
    private UsuarioRepository repository;
    
    // Isso aqui tem refazer porque não respeita o princípio de Inversão de dependência
    public SalvarUsuarioPresenter(UsuarioRepository repository) {
        if(repository == null) {
            throw new RuntimeException("Repositório Inválido.");
        }
        this.telaCadastro = new CadastroUsuarioView();
        this.repository = repository;
        configuraTelaCadastro();
    }
    
    private void configuraTelaCadastro(){
        telaCadastro.setVisible(false);
        
        telaCadastro.getBtnSalvar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    salvar();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(telaCadastro, "Erro: " + ex.getMessage(), "Criação de Usuário", 0);
                }
            }
        });
        
        telaCadastro.getBtnCancelar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    cancelar();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(telaCadastro, "Erro: " + ex.getMessage(), "Cancelar Operação", 0);
                }
            }
        });
        
        telaCadastro.setVisible(true);
    }
    
    private void salvar() {
        String nome = telaCadastro.getTxtNome().getText();
        String senha = telaCadastro.getTxtSenha().getText();
        String confirmacaoSenha = telaCadastro.getTxtConfirmarSenha().getText();
        String email = telaCadastro.getTxtEmail().getText();
        
        if(!(senha.equals(confirmacaoSenha))) {
            throw new RuntimeException("As senhas não são iguais.");
        }
        
        usuario = new Usuario(nome, senha, email);
        
        repository.salvarUsuario(usuario);
        JOptionPane.showMessageDialog(telaCadastro, "Usuario " + usuario.getEmail() + 
                                                     " criado com sucesso!");
        limparTela();
        imprimirUsuario();
        System.out.println("---------------------------------------------------------");
    }
    
    private void cancelar() {
        telaCadastro.dispose();
    }
    
    private void imprimirUsuario() {
        for(Usuario usuarioRecuperado : repository.getUsuarios()) {
            System.out.println(usuarioRecuperado);
        }
    }
    
    private void limparTela() {
        telaCadastro.getTxtNome().setText("");
        telaCadastro.getTxtSenha().setText("");
        telaCadastro.getTxtConfirmarSenha().setText("");
        telaCadastro.getTxtEmail().setText("");
    }
}
