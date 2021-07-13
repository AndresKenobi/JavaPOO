/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.gr09.und01.sem2.teoriadeclases;


/*The public keyword is an access modifier, meaning that it is used to set the access level for 
classes, attributes, methods and constructors

public	The code is accessible for all classes
default	The class is only accessible by classes in the same package. This is used when you don't specify a modifier.
private	The code is only accessible within the declared class
protected	The code is accessible in the same package and subclasses.
final	The class cannot be inherited by other classes
abstract	The class cannot be used to create objects

*/

public class Automovil {
    //Atributos
    int peso; //kg
    int numPer; //No de personas
    String tipo; //deportivo, generico, transporte
    double vel; // km/seg
    
    
       //Metodo constructor: es un metodo especial
        /*Note that the constructor name must match the class name, 
        and it cannot have a return type (like void).
         Also note that the constructor is called when the object is created.*/
    
         public double calcularvel() {
             peso = 1000;
             numPer = 4;
             return (numPer*20.25)/peso;
         }
    
        public Automovil (int _peso, String _tipo) {
            peso = _peso;
            numPer = 4;
            tipo = _tipo;
            vel = calcularvel(); // 
            

}
}
