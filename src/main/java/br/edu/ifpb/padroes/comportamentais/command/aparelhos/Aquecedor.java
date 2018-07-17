/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.padroes.comportamentais.command.aparelhos;

/**
 *
 * @author Julierme Jadon
 */
public class Aquecedor {
    
    private boolean estado;
    
    public void ligar() {
        this.estado = true;;
        System.out.println("Aquecedor ligado");
    }

    public void desligar() {
        this.estado = false;
        System.out.println("Aquecedor desligado");
    }
    
}
