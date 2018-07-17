/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.padroes.comportamentais.chainOfResponsibility.slots;

/**
 *
 * @author Julierme Jadon
 */
public class SlotChain implements SlotInterface{
    
    private SlotInterface proximo;
    private float moeda;

    public SlotChain(float moeda) { this.moeda = moeda; }

    @Override
    public void setProximo(SlotInterface proximoMetodo) {
        if (proximo == null) {
            this.proximo = proximoMetodo;
        } else {
            this.proximo.setProximo(proximoMetodo);
        }
    }

    @Override
    public boolean insereMoeda(float valorMoeda) {
        if (verificaMoeda(valorMoeda)) { return true; }
        else { return this.proximo.insereMoeda(valorMoeda); }
    }

    @Override
    public boolean verificaMoeda(float valorMoeda) { return valorMoeda == this.moeda; }
    
}
