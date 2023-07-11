/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lorem.model;

/**
 *
 * @author fabio
 */
public class Carro {
    String montadora;
    String modelo;
    double valor;
    String logo;
    String carroimagem;
    
    public Carro(String mont, String mode, double v){
        this.montadora = mont;
        this.modelo = mode;
        this.valor = v;
    }
    
      public Carro(String l, String car){
        this.logo =l;
        this.carroimagem = car;
    }

    public Carro(String text, String text0, String string, String string0, String text1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      
    public String getMontadora(){
        return montadora;
    }
     public String getModelo(){
        return modelo;
    }
     public double getValor(){
        return valor;
    }

    public String getLogo() {
        return logo;
    }

    public String getCarroimagem() {
        return carroimagem;
    }
    
}



