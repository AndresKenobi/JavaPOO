/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.utp.grupo09.sem_03.progorienobj;

/**
 *
 * @author andre
 */
class Dieta implements Alimentos, FrecAlim {  //implements es similar a extends
    //multiples interfaces

    @Override
    public void tipo_Alimento(String tipoa) {
        System.out.println("De: " + tipoa); //Se crea el cuerpo del metodo/funcion
    }
    @Override
    public void estado_Alimento(String estadoa) {
        System.out.println("Estado: " + estadoa); //Se crea el cuerpo del metodo/funcion
    }

    @Override
    public void frec_am() {
        System.out.println("7hr - 10hr"); //Se crea el cuerpo del metodo/funcion
    }

    @Override
    public void frec_pm() {
        System.out.println("14hr - 17hr"); //Se crea el cuerpo del metodo/funcion
    }
    
    
}
