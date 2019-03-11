/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.polimorfismo;

/**
 *
 * @author NATHALY
 * @version
 * Esta clase hereda de la clases Vehiculo
 */
public class Patineta extends Vehiculo {
    /**
     * Variable para definir la marca de la patineta
     */
    private String marcaPatineta;
    
    /**
     * Constructor con los parametros de las clases padre y propia
     * @param marcaPatineta
     * @param tipoTransporte 
     */
    public Patineta(String marcaPatineta, String tipoTransporte) {
        super(tipoTransporte);
        this.marcaPatineta = marcaPatineta;
    }
    /**
     * Metodo especializado para imprimir tipo de vehiculo
     */
     @Override
    public void imprimirGeneral() {
        System.out.println("Soy una patineta");
    }
    
    public String getMarcaPatineta() {
        return marcaPatineta;
    }

    public void setMarcaPatineta(String marcaPatineta) {
        this.marcaPatineta = marcaPatineta;
    }
 
    
   
    
    
}
