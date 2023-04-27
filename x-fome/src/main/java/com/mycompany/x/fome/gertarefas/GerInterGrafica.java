/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.x.fome.gertarefas;

import com.mycompany.x.fome.view.DlgLogin;
import com.mycompany.x.fome.view.DlgLoja;
import com.mycompany.x.fome.view.DlgPedido;
import com.mycompany.x.fome.view.DlgUsuario;
import com.mycompany.x.fome.view.DlgVisualizarPedidos;
import com.mycompany.x.fome.view.FormGerenciarPedidos;
import com.mycompany.x.fome.view.FormPrincipalCliente;
import java.awt.Frame;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author 2021122760232
 */
public class GerInterGrafica {
    
    private DlgLogin dlgLogin = null;
    private DlgLoja dlgLoja = null;
    private DlgPedido dlgPedido = null;
    private DlgUsuario dlgUsuario = null;
    private DlgVisualizarPedidos dlgDlgVisualizarPedidos = null;
    private FormGerenciarPedidos gerenciarPedidos = null;
    private FormPrincipalCliente telaPrincipalCliente = null;
    
            
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
        dlgLogin = (DlgLogin) abrirJanela(null, dlgLogin, DlgLogin.class);
    }
    
    public void openJanelaLoja(){
        dlgLoja = (DlgLoja) abrirJanela(telaPrincipalCliente, dlgLoja, DlgLoja.class);
    }
    
    public void openJanelaUsuario(){
        dlgUsuario = (DlgUsuario) abrirJanela(null, dlgUsuario, DlgUsuario.class);
    }
    
    public void openJanelaVisualizarPedidos(){
        dlgDlgVisualizarPedidos = (DlgVisualizarPedidos) abrirJanela(telaPrincipalCliente, dlgDlgVisualizarPedidos, DlgVisualizarPedidos.class);
    }
    
    public void openJanelaPrincipalDoCliente(){
        gerenciarPedidos = new FormGerenciarPedidos();
        gerenciarPedidos.setVisible(true);
    }
    
    public void openJanelaGerenciarPedidos(){
        gerenciarPedidos = new FormGerenciarPedidos();
        gerenciarPedidos.setVisible(true);
    }
    
    public static void main(String args[]) {
  
        // TRADUÇÃO
        javax.swing.UIManager.put("OptionPane.yesButtonText", "Sim"); 
        javax.swing.UIManager.put("OptionPane.noButtonText", "Não");
        

        GerInterGrafica gerIG = new GerInterGrafica();
        gerIG.openJanelaLogin();
        

    }
    
}
