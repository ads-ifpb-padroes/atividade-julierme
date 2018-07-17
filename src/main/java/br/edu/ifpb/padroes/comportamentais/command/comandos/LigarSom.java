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
public class LigarSom implements Comando{

    private Som som;

    public LigarSom(Som som) { this.som = som; }
    
    @Override
    public void botao() { this.som.ligar(); }
    
}
