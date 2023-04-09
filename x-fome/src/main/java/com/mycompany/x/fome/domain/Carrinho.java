/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.x.fome.domain;

import java.util.ArrayList;

/**
 *
 * @author 2021122760232
 */
public class Carrinho {
    
    private Pedido pedido;
    private ArrayList<Produto> produtos;
    private Desconto desconto = new DefaultDesconto(10.0);
    
    public Double getTotalWithDesconto(){
        return this.desconto.getDesconto(this);
    }

    public void setDesconto(Desconto desconto) {
        this.desconto = desconto;
    }

    public Double getTotal(){
        Double total = 0.0;
        for(Produto p: this.produtos){
            total += p.getValor();
        }
        
        return total;
    }
}
