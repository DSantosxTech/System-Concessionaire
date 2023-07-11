/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lorem.model;

/**
 *
 * @author fabio
 */

public class Clientes {
    String nome;
    String cpf;

    public Clientes (String n, String c) {
        this.nome = n;
        this.cpf = c;
    }
   

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}
