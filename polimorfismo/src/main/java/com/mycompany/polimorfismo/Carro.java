/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.polimorfismo;

/**
 *
 * @author NATHALY
 */
public class Carro extends Motorizados {
    
    private String marcaCarro;

    public Carro(String marcaCarro, String color, String tipoTransporte) {
        super(color, tipoTransporte);
        this.marcaCarro = marcaCarro;
    }
    /**
     * Metodo especializado para imprimir carro
     */
    @Override
    public void imprimirGeneral() {
        System.out.println("Soy un carro");
    }
    
    public String getMarcaCarro() {
        return marcaCarro;
    }

    public void setMarcaCarro(String marcaCarro) {
        this.marcaCarro = marcaCarro;
    }

   
    
}
