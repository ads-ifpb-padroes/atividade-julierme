/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.padroes.comportamentais.command;

import br.edu.ifpb.padroes.comportamentais.command.comandos.Comando;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Julierme Jadon
 */
public class Invocador {
    
    private List<Comando> ligados;
    private List<Comando> desligados;

    public Invocador() {
        this.ligados = new ArrayList<>();
        this.desligados = new ArrayList<>();
    }

    public void botaoLigar(Comando c) { this.ligados.add(c); }
    public void botaoDesligar(Comando c) { this.desligados.add(c); }
    public void ligarTodos(){ this.ligados.forEach(c->c.botao()); }
    public void desligarTodos(){ this.desligados.forEach(c->c.botao()); }
    
}
