/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.x.fome.gertarefas;

import com.mycompany.x.fome.view.Cadastro;
import com.mycompany.x.fome.view.Carrinho;
import com.mycompany.x.fome.view.CarrinhoProduto;
import com.mycompany.x.fome.view.Login;
import com.mycompany.x.fome.view.Loja;
import com.mycompany.x.fome.view.Pedidos;
import com.mycompany.x.fome.view.Principal;
import com.mycompany.x.fome.view.Usuario;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 *
 * @author prisc
 */
public class GerInterfaceGrafica {
    private Loja lojaPanel = null; 
    private Pedidos pedidosPanel = null;
    private Carrinho carrinhoPanel = null;
    private Usuario usuario = null;
    private ArrayList<CarrinhoProduto> carrinhoProdutoPanel = null;
    private JFrame home;
    private JDialog janelaCadastro = null;
    private Cadastro cadastro = null;
    
    public GerInterfaceGrafica(JFrame home) {
        this.home = home;
    }
    
    public void abrirPanelLoja(){
        if(lojaPanel == null){
            lojaPanel = new Loja(home);
            lojaPanel.setBounds(0,0,400,500);
            lojaPanel.setBackground(Color.gray);
            home.setLayout(null);
            home.add(lojaPanel);
            home.setSize(400,500);
        }else{
            lojaPanel.setVisible(true);
            if(carrinhoPanel != null)  carrinhoPanel.setVisible(false); 
            if(pedidosPanel != null) pedidosPanel.setVisible(false);
            if(usuario != null)  usuario.setVisible(false); 
        }
        
    }
    
    public void abrirPanelConfiguracoes(){
         if(usuario == null){
            this.usuario = new Usuario();
            this.usuario.setNomeButton("Editar");
            this.usuario.setTitulo("Minha Conta");
            this.usuario.setBounds(0,0,400,500);
            this.usuario.setBackground(Color.gray);
            home.setLayout(null);
            home.add(usuario);
            home.setSize(400,500);
        }else{
            this.usuario.setVisible(true);
            if(carrinhoPanel != null)  carrinhoPanel.setVisible(false); 
            if(lojaPanel != null)  lojaPanel.setVisible(false); 
            if(pedidosPanel != null) pedidosPanel.setVisible(false);
        } 
    }
    
    public void abrirPanelPedidos(){
        if(pedidosPanel == null){
            pedidosPanel = new Pedidos();
            pedidosPanel.setBounds(0,0,400,500);  
            pedidosPanel.setBackground(Color.gray);
            home.setLayout(null);
            home.add(pedidosPanel);
            home.setSize(400,500);
        }else{
            pedidosPanel.setVisible(true);
            if(lojaPanel != null)  lojaPanel.setVisible(false); 
            if(carrinhoPanel != null) carrinhoPanel.setVisible(false);
            if(usuario != null)  usuario.setVisible(false); 
        }
    }
    
    public void abrirPanelCarrinho(){
        if(carrinhoPanel == null){
            carrinhoPanel = new Carrinho();
            carrinhoPanel.setBounds(0,0,400,500);
            carrinhoPanel.setBackground(Color.gray);
            home.setLayout(null);
            home.add(carrinhoPanel);
            home.setSize(400,500);
        }else{
            carrinhoPanel.setVisible(true);
            if(lojaPanel != null)  lojaPanel.setVisible(false); 
            if(pedidosPanel != null) pedidosPanel.setVisible(false);
            if(usuario != null)  usuario.setVisible(false); 
        } 
    }
    
    public void abrirTelaCadastro(){
        cadastro = new Cadastro(home, true);
        cadastro.setVisible(true);
    }
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                Login dialog = new Login(new Principal(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
}
