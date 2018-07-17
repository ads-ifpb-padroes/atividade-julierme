/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.padroes.comportamentais.command;

import br.edu.ifpb.padroes.comportamentais.command.aparelhos.Aquecedor;
import br.edu.ifpb.padroes.comportamentais.command.aparelhos.Som;
import br.edu.ifpb.padroes.comportamentais.command.aparelhos.Televisao;
import br.edu.ifpb.padroes.comportamentais.command.comandos.DesligarAquecedor;
import br.edu.ifpb.padroes.comportamentais.command.comandos.DesligarSom;
import br.edu.ifpb.padroes.comportamentais.command.comandos.DesligarTelevisao;
import br.edu.ifpb.padroes.comportamentais.command.comandos.LigarAquecedor;
import br.edu.ifpb.padroes.comportamentais.command.comandos.LigarSom;
import br.edu.ifpb.padroes.comportamentais.command.comandos.LigarTelevisao;

/**
 *
 * @author Julierme Jadon
 */
public class Main {
    
    public static void main (String [] args){
        Invocador invocador = new Invocador();
        
        Televisao tv = new Televisao();
        Aquecedor aq = new Aquecedor();
        Som som = new Som();
        
        invocador.botaoLigar(new LigarTelevisao(tv));
        invocador.botaoLigar(new LigarAquecedor(aq));
        invocador.botaoLigar(new LigarSom(som));
        
        invocador.botaoDesligar(new DesligarTelevisao(tv));
        invocador.botaoDesligar(new DesligarAquecedor(aq));
        invocador.botaoDesligar(new DesligarSom(som));
        
        invocador.ligarTodos();
        System.out.println("<---------------->");
        invocador.desligarTodos();
    }
    
}
