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
public interface SlotInterface {
    
    public void setProximo(SlotInterface proximoMetodo);
    public boolean insereMoeda(float valorMoeda);
    public boolean verificaMoeda(float valorMoeda);
    
}
