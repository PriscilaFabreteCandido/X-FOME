/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.x.fome.domain;

/**
 *
 * @author prisc
 */
public class Desconto {
    protected Double desconto = 0.0;

    public Desconto(Double desconto) {
        this.desconto = desconto;
    }
    
    public Double getDesconto(Carrinho carrinho){
        return carrinho.getTotal() - (carrinho.getTotal() * this.desconto/100);
    }
}


