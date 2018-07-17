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
public class Main {
    
    public static void main(String[] args) {
        Semaforo semaforo = new SinalIntermitente();
        semaforo = semaforo.on();
        status(semaforo);

        for (int k = 0; k < 5; k++) {
            semaforo = semaforo.tick();
            status(semaforo);
        }

        semaforo = semaforo.panic();
        semaforo = semaforo.tick();
        semaforo = semaforo.off();
        status(semaforo);
    }
    
    public static void status(Semaforo s){
        System.out.println("Sinal " + s.status());
    }
    
}
