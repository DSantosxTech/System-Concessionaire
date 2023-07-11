/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lorem.model;

/**
 *
 * @author fabio
 */
public class Combustiveis {
    String combustiveis;
    double preco;

    public Combustiveis( String c, double p) {
        
        this.combustiveis = c;
        this.preco = p;
    }
    
    
    public String getCombustiveis() {
        return combustiveis;
    }
    
    public double getPreco() {
        return preco;
    }

    


}
