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
public class SMS implements Observer{

    @Override
    public void reload(Forum f) {
        System.out.println("[SMS] Tópicos do Fórum: ");
        f.getTopicos().forEach(System.out::println);
    }
    
}
