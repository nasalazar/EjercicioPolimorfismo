/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.polimorfismo;

/**
 *
 * @author NATHALY
 * @version 1.0
 * Clase que contiene de hijos a todos los motorizados y que es hijo a su vez de vehiculo
 */
public class Motorizados extends Vehiculo {
    /**
     * Variable que guarda el color del vehiculo
     */
    private String color;
    /**
     * Parametros heredados de la clase vehiculo y propio
     * @param color
     * @param tipoTransporte 
     */
    public Motorizados(String color, String tipoTransporte) {
        super(tipoTransporte);
        this.color = color;
    }
    /**
     * Metodo especializado para imprimir los motorizados
     */
    @Override
    public void imprimirGeneral() {
        System.out.println("Es hijo de los motorizados");
    }
    
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    

   
}
