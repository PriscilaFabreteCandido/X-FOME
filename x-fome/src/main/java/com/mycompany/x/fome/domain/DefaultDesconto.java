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
public class DefaultDesconto extends Desconto {
    protected Double desconto = 0.0;

    public DefaultDesconto(Double desconto) {
        super(desconto);
    }
    
    @Override 
    public Double getDesconto(Carrinho carrinho){
        Double total = 0.0;
        if(total >= 100 && total < 200){
            this.desconto = 5.0;
        }else if(total >= 200 && total < 300){
            this.desconto = 10.0;
        }else if(total >= 400 && total < 500){
            this.desconto = 20.0;
        }else{
            this.desconto = 30.0;
        }
        return carrinho.getTotal() - (carrinho.getTotal() * this.desconto/100);
    }
}
