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
public class MiprimeraClase {
    //Atributos de la clase (valores iniciales)
    int x = 5; 
    final int y = 3; // para que no se modifique, constante.
    String saludo = "Que hay?";
    // Los atributos solo son variables dentro de una clase.
    
    //Crear un objeto
    //Un objeto es una instancia de una clase. Un objeto hereda los atributos y metodos de la clase.
    //Notacion:            Nombre de la Clase  nombre del objeto = new  nombre del la clase();
    
   // MiprimeraClase objUno = new MiprimeraClase();
   //Crear un objeto en ambas clases es un error fatal <<<<<
    
   //Metodos public vs static
   //Dentro de la misma clase:
   /*
    In the example above, we created a static method, which means that it can be accessed 
    without creating an object of the class, unlike public, which can only be accessed by objects.
    */
    
   static void verificar1() {
       System.out.println("Este metodo NO aparece en la sugerencias de notacion de punto para ser llamado");
        
   }
   
   public void verificar2() {
       System.out.println("Este metodo aparece en la sugerencias de notacion de punto para ser llamado");
   
   }
   //Las funciones o metodos tambien pueden tener parametros
   public void verificar3(int num) {
       System.out.println("Este es el metodo numero: " + num);
       
   
   }
    
}
