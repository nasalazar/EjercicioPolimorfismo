/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.polimorfismo;

/**
 *
 * @author NATHALY
 * @versio 1.0
 * Clase que hereda de Vehiculo
 */
public class Bicicleta extends Vehiculo{
    /**
     * Variable que guarda la marca de la bicicleta
     */
    private  String marcaBicicleta;
    /**
     * Constructor con los parametros propios y de la clase Padre
     * @param marcaBicicleta
     * @param tipoTransporte 
     */
    public Bicicleta(String marcaBicicleta, String tipoTransporte) {
        super(tipoTransporte);
        this.marcaBicicleta = marcaBicicleta;
    }
     @Override
    public void imprimirGeneral() {
        System.out.println("Soy una bicicleta");
    }
    
    public String getMarcaBicicleta() {
        return marcaBicicleta;
    }

    public void setMarcaBicicleta(String marcaBicicleta) {
        this.marcaBicicleta = marcaBicicleta;
    }
    
    
    

    

    
    
    
    
    
    
}
