/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.padroes.comportamentais.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Julierme Jadon
 */
public class Forum {
    
    private List<String> topicos;
    private List<Observer> observers;

    public Forum() {
        this.observers = new ArrayList<>();
        this.topicos = new ArrayList<>();
    }

    public void novoTopico(String topico) {
        this.topicos.add(topico);
        notificar();
    }

    public List<String> getTopicos() { return topicos; }

    public void novoObserver(Observer o) { this.observers.add(o); }

    private void notificar() {
        for (Observer o : observers) {
            o.reload(this);
        }
    }
    
}
