/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.padroes.comportamentais.command.comandos;

import br.edu.ifpb.padroes.comportamentais.command.aparelhos.Som;

/**
 *
 * @author Julierme Jadon
 */
public class DesligarSom implements Comando{
    
    private Som som;

    public DesligarSom(Som som) { this.som = som; }
    
    @Override
    public void botao() { this.som.desligar(); }
    
}
