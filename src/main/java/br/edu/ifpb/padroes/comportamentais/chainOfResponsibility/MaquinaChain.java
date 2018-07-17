/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.padroes.comportamentais.chainOfResponsibility;

import br.edu.ifpb.padroes.comportamentais.chainOfResponsibility.slots.SlotInterface;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Julierme Jadon
 */
public class MaquinaChain {
    
    private SlotInterface chain;
    private float acumulado;
    private Map<String, Float> produtos;

    public MaquinaChain(SlotInterface chain) {
        this.chain = chain;
        this.produtos = new HashMap<>();
        adicionarProdutos();
    }

    public float inserir(float valor) {
        if (chain.insereMoeda(valor)) { this.acumulado += valor; }
        return valor;
    }
    
    private void adicionarProdutos(){
        this.produtos.put("Refrigerante", 3.5f);
        this.produtos.put("Salgadinho", 2f);
        this.produtos.put("Chocolate", 1f);
    }
    
    public Map<String, Float> getProdutos() { return produtos; }
    public boolean receberProduto(String produto) throws Exception {
        System.out.println(this.acumulado);
        if (this.acumulado >= produtos.get(produto)) { return true; }
        else { throw new Exception("O valor inserido é insuficiente"); }
    }
    
}
