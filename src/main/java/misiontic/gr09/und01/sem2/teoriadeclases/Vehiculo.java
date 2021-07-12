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
    
    protected String marca = "Ford";        // Vehicle attribute
    private Integer modelo;
    
    public void honk() {                            // Vehicle method
    System.out.println("Beep, beep!");
    }
   
    public int getModelo() {
        return modelo;
        }
    
    public void setModelo(int ano_Modelo) {
         modelo = ano_Modelo;
        }
    
}
