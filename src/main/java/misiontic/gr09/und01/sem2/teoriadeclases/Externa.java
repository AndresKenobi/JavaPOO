/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.gr09.und01.sem2.teoriadeclases;

import java.util.HashSet;
import java.util.Set;

/*
Java Inner Classes (Clases anidadas)
In Java, it is also possible to nest classes (a class within a class). 
The purpose of nested classes is to group classes that belong 
together, which makes your code more readable and maintainable.

To access the inner class, create an object of the outer class, and then create an object of the inner class:
 */

class Externa {
    int x = 10;
    
    class Interna {
        int y = 5;
        //Set<Integer> conjunto = new HashSet();
        /*Private Inner Class
        Unlike a "regular" class, an inner class can be private or protected. If you don't want 
        outside objects to access the inner class, declare the class as private:*/
        
        /*Static Inner Class
        An inner class can also be static, which means that you can access it 
        without creating an object of the outer class:*/
        
        public int metodoInterno() {
            return x + 2;
        }
        
    }
}
