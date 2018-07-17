/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.padroes.comportamentais.command.comandos;

import br.edu.ifpb.padroes.comportamentais.command.aparelhos.Televisao;

/**
 *
 * @author Julierme Jadon
 */
public class LigarTelevisao implements Comando{

    private Televisao tv;

    public LigarTelevisao(Televisao tv) { this.tv = tv; }
    
    @Override
    public void botao() { this.tv.ligar(); }
    
}
