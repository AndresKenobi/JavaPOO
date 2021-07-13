/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.gr09.und01.sem2.teoriadeclases;

/**
 *
 * @author andre
 */
class Auto extends Vehiculo {
    
    protected String modelo_Tipo = "Mustang";    // Car attribute
//We set the brand attribute in Vehicle to a protected access modifier. 
//If it was set to private, the Vehiculo class would not be able to access it.
    public void honk() {                            // Vehicle method
    System.out.println("Peep, peep!");
    }
}
