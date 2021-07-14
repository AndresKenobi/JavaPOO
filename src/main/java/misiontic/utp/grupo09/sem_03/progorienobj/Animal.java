/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.utp.grupo09.sem_03.progorienobj;

/*
 * @author andre
 */
public abstract class Animal {
    /*Abstract Classes and Methods
    Data abstraction is the process of hiding certain details and showing only essential information to the user.
    Abstraction can be achieved with either abstract classes or interfaces.
    
    Abstract class: is a restricted class that cannot be used to create objects
    (to access it, it must be inherited from another class).*/
    
    
    public abstract void animalSound(); //metodo abstracto sin cuerpo
    /* Abstract method: can only be used in an abstract class, and it does not have a body. 
    The body is provided by the subclass (inherited from).
    An abstract class can have both abstract and regular methods:*/
    
    public void sleep() {                            //metodo normal
        System.out.println("Zzz");
    }
    /*Why And When To Use Abstract Classes and Methods?
    To achieve security - hide certain details and only show the important details of an object.*/
}
