/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion.orientada.objetos.semana.tres.poo;

/**
 *
 * @author andre
 */
public class Ejecutar {

 
    public static void main(String[] args) {
        
        //Animal myObj = new Animal(); // will generate an error
        //La clase abstracta no puede ser instanciada
        
        /*
        //To access the abstract class, it must be inherited from another class. Animal ------>Marrano
        System.out.println("<<<<<Clases Abstractas>>>>>");
        Marrano myPig = new Marrano(); // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
        
        //Why And When To Use Abstract Classes and Methods?
        //To achieve security - hide certain details and only show the important details of an object.
        */
        
        /*
        System.out.println("<<<<<Interfaces>>>>>");
        Dieta mydieta = new Dieta(); //Se crea un objeto, similar a la herencia
        System.out.println("Dieta:\n");
        mydieta.tipo_Alimento("Vegetales");
        mydieta.estado_Alimento("Bueno");
        System.out.println("Frecuencia consumo:");
        mydieta.frec_am();
        mydieta.frec_pm();*/
        
        /*Like abstract classes, interfaces cannot be used to create objects 
        (in the example above, it is not possible to create an "Animal" object in the MyMainClass)
        Interface methods do not have a body - the body is provided by the "implement" class
        On implementation of an interface, you must override all of its methods
        Interface methods are by default abstract and public // Importante 
        Interface attributes are by default public, static and final // Importante
        An interface cannot contain a constructor (as it cannot be used to create objects)*/
        
        /*
        System.out.println("<<<<<Enum(Enumeraciones)>>>>>");
        NivelAlim myVar = NivelAlim.MEDIO; //Creamos una instancia
        System.out.println("\nNivel dietario: ");
        System.out.println(myVar);
        */
        /*Loop Through an Enum
        The enum type has a values() method, which returns an array of all enum constants. 
        This method is useful when you want to loop through the constants of an enum:*/
        /*
        System.out.println("\nNiveles dietarios");
         for (NivelAlim myNivel : NivelAlim.values()) {
            System.out.println(myNivel);
            }
         */
        
                               
    }
    
}
