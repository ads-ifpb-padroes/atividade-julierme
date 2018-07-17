/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.padroes.comportamentais.observer;

/**
 *
 * @author Julierme Jadon
 */
public class Main {
    
    public static void main(String[] args) {
        Forum f = new Forum();
        f.novoObserver(new Email());
        f.novoObserver(new Notification());
        f.novoObserver(new SMS());
        
        f.novoTopico("Linguagens de Programação");
        f.novoTopico("Assembly");
        f.novoTopico("Basic");
        f.novoTopico("Cobol");
        f.novoTopico("Fortran");
    }
    
}
