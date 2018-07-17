/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.padroes.comportamentais.state;

/**
 *
 * @author Julierme Jadon
 */
public class Panic implements Semaforo{

    @Override
    public Semaforo tick() { return this; }

    @Override
    public Semaforo panic() { return this; }

    @Override
    public Semaforo off() { return this; }

    @Override
    public Semaforo on() { return new SinalVermelho(); }

    @Override
    public String status() { return "Vermelho Pânico"; }
    
}
