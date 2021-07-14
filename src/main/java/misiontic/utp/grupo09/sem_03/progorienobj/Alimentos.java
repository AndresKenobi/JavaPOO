/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.utp.grupo09.sem_03.progorienobj;

/*
 * @author andre
Interfaces
Another way to achieve abstraction in Java, is with interfaces.
An interface is a completely "abstract class" that is used to group related methods with empty bodies:
 */
interface Alimentos {
    public void tipo_Alimento(String tipoa); // interface method (does not have a body)
    public void estado_Alimento(String estadoa); // interface method (does not have a body)  
}
/*
To access the interface methods, the interface must be "implemented" (kinda like inherited) 
by another class with the implements keyword (instead of extends). The body of the interface 
method is provided by the "implement" class:
*/