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
 * Clase que implementa la interface ademas de ser la clase padre
 */
public class Vehiculo implements IGeneral{
    /**
     * Variable que guara el tipo de transporte aereo, terrestre, acuatico
     */
    private String tipoTransporte;
    /**
     * Recibe parametro que implemento esta misma clase
     * @param tipoTransporte 
     */
    public Vehiculo(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }
    /**
     * Metodo especializado por la clase Vehiculo
     */
    @Override
    public void imprimirGeneral() {
        System.out.println("Es parte de los vehiculos");
    }
    
    public String getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }
    
    
}
