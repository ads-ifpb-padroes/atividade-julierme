/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.padroes.comportamentais.command.comandos;

import br.edu.ifpb.padroes.comportamentais.command.aparelhos.Aquecedor;

/**
 *
 * @author Julierme Jadon
 */
public class LigarAquecedor implements Comando{
    
    private Aquecedor aquecedor;

    public LigarAquecedor(Aquecedor aquecedor) { this.aquecedor = aquecedor; }
    
    @Override
    public void botao() { this.aquecedor.ligar(); }
    
}
