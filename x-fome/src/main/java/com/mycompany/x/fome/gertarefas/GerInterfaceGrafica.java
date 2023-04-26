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
import com.mycompany.x.fome.view.FormPrincipalCliente;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 *
 * @author prisc
 */
public class GerInterfaceGrafica {
   
   
    public GerInterfaceGrafica(JFrame home) {
        this.home = home;
    }
    
    public void abrirPanelLoja(){
        if(lojaPanel == null){
            lojaPanel = new Loja(home);
            lojaPanel.setBounds(0,0,600,600);
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
                
                Login dialog = new Login(new FormPrincipalCliente(), true);
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
