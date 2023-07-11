/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lorem.model;

/**
 *
 * @author fabio
 */
public class Dados {

    String nome;
    String cpf;
    String mont;
    String mode;
    double total;
    String combustivel;
    String ar;
    String direcao;
    String multi;
    String teto;
    String banco;
    String freio;
    String roda;
    
    public Dados (String nome, String cpf, String mont, String mode,double total, String combustivel, String ar, String direcao, String multi, String teto, String banco, String freio, String roda ){
        this.nome = nome;
        this.cpf = cpf;
        this.mont = mont;
        this.mode = mode;
        this.total = total;
        this.combustivel = combustivel;
        this.ar = ar;
        this.direcao = direcao;
        this.multi = multi;
        this.teto = teto;
        this.banco = banco;
        this.freio = freio;
        this.roda = roda;
    }

    public String getNome() {
        return nome;
    }
    
    public String getCpf() {
        return cpf;
    }

    public String getMont() {
        return mont;
    }

    public String getMode() {
        return mode;
    }

    public double getTotal() {
        return total;
    }
   
    public String getCombustivel() {
        return combustivel;
    }
    public String getAr() {
        return ar;
    }

    public String getDirecao() {
        return direcao;
    }

    public String getMulti() {
        return multi;
    }

    public String getTeto() {
        return teto;
    }

    public String getBanco() {
        return banco;
    }

    public String getFreio() {
        return freio;
    }

    public String getRoda() {
        return roda;
    }
    
}
