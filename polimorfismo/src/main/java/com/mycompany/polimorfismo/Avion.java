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
 * Esta clase se implementa para definir un objeto tipo avion que pertenece a la clase padre vehiculos
 */
public class Avion extends Motorizados {
    
    /**
     * Esta variable guarda el tipo de aerolinea a la que pertenece el avion
     */
    private String aerolinea;
    
    /**
     * Recibe estos parametros propios y heredados de las clases padre
     * @param aerolinea
     * @param color
     * @param tipoTransporte 
     */
    public Avion(String aerolinea, String color, String tipoTransporte) {
        super(color, tipoTransporte);
        this.aerolinea = aerolinea;
    }
    /**
     * Metodo especializado para imprimir avion
     */
    @Override
    public void imprimirGeneral() {
        System.out.println("Soy un avion");
    }
   

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }
    
}
