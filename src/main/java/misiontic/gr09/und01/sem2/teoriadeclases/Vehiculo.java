/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.gr09.und01.sem2.teoriadeclases;
/*
 * @author andre
 */

public class Vehiculo {
    /*
    If you don't want other classes to inherit from a class, use the final keyword:
    If you try to access a final class, Java will generate an error:
    */
    
    protected String marca = "Ford";        // Vehicle attribute
    private Integer modelo;
    
    public void honk() {                            // Vehicle method
    System.out.println("Beep, beep!");
    }
   
    public int getModelo() {
        return modelo;
        }
    
    public void setModelo(int ano_Modelo) {
         this.modelo = ano_Modelo;
         /*The set method takes a parameter (newName) and assigns it to the name variable. 
        The this keyword is used to refer to the current object. 
         Tal vez porque puede haber en otra clase una variable con el mismo nombre???
         */
         
        }
    
}
