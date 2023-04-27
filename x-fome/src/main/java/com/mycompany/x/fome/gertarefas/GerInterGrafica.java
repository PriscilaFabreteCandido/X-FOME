/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.x.fome.gertarefas;

import java.awt.Frame;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author 2021122760232
 */
public class GerInterGrafica {

     public GerInterGrafica() {
        
    }
   
    // ABRIR JDIALOG
    private JDialog abrirJanela(java.awt.Frame parent, JDialog dlg, Class classe) {
        if (dlg == null){     
            try {
                dlg = (JDialog) classe.getConstructor(Frame.class, boolean.class, GerInterGrafica.class ).newInstance(parent,true,this);
            } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                JOptionPane.showMessageDialog(parent, "Erro ao abrir a janela " + classe.getName() );
            } 
        }        
        dlg.setVisible(true); 
        return dlg;
    }
    
    public void openJanelaLogin(){
        
    }
    
    public void openJanelaLoja(){
        
    }
    
    public void openJanelaUsuario(){
        
    }
    
    public void openJanelaVisualizarPedidos(){
        
    }
    
    public void openJanelaPrincipalDoCliente(){
        
    }
    
    public void openJanelaGerenciarPedidos(){
        
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                // System.out.println( info.getName() );
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        // TRADUÇÃO
        javax.swing.UIManager.put("OptionPane.yesButtonText", "Sim"); 
        javax.swing.UIManager.put("OptionPane.noButtonText", "Não");
        

        GerInterGrafica gerIG = new GerInterGrafica();
        gerIG.openJanelaLogin();
        

    }
    
}
