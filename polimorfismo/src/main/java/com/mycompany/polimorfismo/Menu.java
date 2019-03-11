/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.polimorfismo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NATHALY
 * @version 1.0
 * Clase principal para iniciar el programa
 */
public class Menu {
     /**
      * Metodo para agregar los motorizados y sus hijos ademas de instansearlos 
      */
    public void agregarMotorizados()
    {
        System.out.println("AGREGANDO MOTORIZADOS.....");
        Avion a1 = new Avion ("Avianca","Negro","Aereo");
        Avion a2 = new Avion(" Latam ","Gris","Aereo");
        Avion a3 = new Avion(" Kayak","Azul","Aereo");
        Carro c1 = new Carro(" Bmw ","Negro","Terrestre");
        Carro c2 = new Carro(" Mercedez","Amarillo","Terrestre");
        Carro c3 = new Carro(" Nissan","Verde","Terrestre");
        
        
        Motorizados[] listaMotorizados = {a1,a2,a3,c1,c2,c3};
        
        for(Motorizados m : listaMotorizados){
            Motorizados mt = new Motorizados("","");
            if(m instanceof Avion){
                ((Avion) m).imprimirGeneral();
                System.out.println(((Avion) m).getAerolinea()+"  "+m.getColor()+"  "+m.getTipoTransporte()) ;
                mt.imprimirGeneral();
            }
            
            if( m instanceof Carro){
                ((Carro) m).imprimirGeneral();
                System.out.println(((Carro) m).getMarcaCarro()+"  "+m.getColor()+"  "+m.getTipoTransporte()) ;
                mt.imprimirGeneral();
            }
        }
    }
    /**
     * Metodo para agregar otros vehiculos que no pertenecen a los motorizados
     * 
     */
    public void agregarOtros(){
        
        System.out.println("AGREGANDO OTROS VEHICULOS...");
        Patineta p1 = new Patineta("Zero","Terrestre");
        Patineta p2 = new Patineta("Plan B","Terrestre");
        Patineta p3 = new Patineta("Element","Terrestre");
        Bicicleta b1 = new Bicicleta("Specialized"," Terrestre");
        Bicicleta b2 = new Bicicleta("Trek","Terrestre");
        Bicicleta b3 = new Bicicleta("Merida","Terrestre");
    
        Vehiculo[] listaVehiculo = {p1,p2,p3,b1,b2,b3};
        
        for(Vehiculo v : listaVehiculo){
            Vehiculo vh = new Vehiculo("");
            if(v instanceof Patineta){
                ((Patineta) v).imprimirGeneral();
                System.out.println(v.getTipoTransporte()+"  "+ ((Patineta)v).getMarcaPatineta());
                vh.imprimirGeneral();
            }
            if(v instanceof Bicicleta){
                ((Bicicleta) v).imprimirGeneral();
                System.out.println(v.getTipoTransporte()+"  "+ ((Bicicleta)v).getMarcaBicicleta());
                vh.imprimirGeneral();
            }
            
        }
    
    
    }
    /**
     * Main por el cual inicia el programa
     * @param args 
     */
     public static void main(String[] args) {		
	
         Menu menu = new Menu();
         menu.agregarMotorizados();
         menu.agregarOtros();
    }
}
