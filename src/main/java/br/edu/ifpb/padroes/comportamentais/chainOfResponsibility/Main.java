/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.padroes.comportamentais.chainOfResponsibility;

import br.edu.ifpb.padroes.comportamentais.chainOfResponsibility.slots.Slot01;
import br.edu.ifpb.padroes.comportamentais.chainOfResponsibility.slots.Slot05;
import br.edu.ifpb.padroes.comportamentais.chainOfResponsibility.slots.Slot1;
import br.edu.ifpb.padroes.comportamentais.chainOfResponsibility.slots.Slot10;
import br.edu.ifpb.padroes.comportamentais.chainOfResponsibility.slots.Slot25;
import br.edu.ifpb.padroes.comportamentais.chainOfResponsibility.slots.Slot50;
import br.edu.ifpb.padroes.comportamentais.chainOfResponsibility.slots.SlotInterface;

/**
 *
 * @author Julierme Jadon
 */
public class Main {
    
    public static void main(String[] args) {
        SlotInterface chain = new Slot01(0.01f);
        chain.setProximo(new Slot05(0.05f));
        chain.setProximo(new Slot10(0.1f));
        chain.setProximo(new Slot25(0.25f));
        chain.setProximo(new Slot50(0.5f));
        chain.setProximo(new Slot1(1));
        MaquinaChain maquina = new MaquinaChain(chain);
        
        maquina.inserir(1);
        maquina.inserir(1);
        //maquina.inserir(1);
        //maquina.inserir(0.5f);
        
        try {
            //if(maquina.receberProduto("Refrigerante")){
            if(maquina.receberProduto("Salgadinho")){
                System.out.println("Produto recebido");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
