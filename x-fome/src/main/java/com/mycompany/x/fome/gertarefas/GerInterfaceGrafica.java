/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.x.fome.gertarefas;

import com.mycompany.x.fome.view.Carrinho;
import com.mycompany.x.fome.view.CarrinhoProduto;
import com.mycompany.x.fome.view.Loja;
import com.mycompany.x.fome.view.Pedidos;
import com.mycompany.x.fome.view.Usuario;
import java.awt.Color;
import java.util.ArrayList;
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
            usuario = new Usuario();
            usuario.setNomeButton("Editar");
            usuario.setTitulo("Minha Conta");
            usuario.setBounds(0,0,400,500);
            usuario.setBackground(Color.gray);
            home.setLayout(null);
            home.add(usuario);
            home.setSize(400,500);
        }else{
            usuario.setVisible(true);
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
}
