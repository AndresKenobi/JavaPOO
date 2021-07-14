/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.utp.grupo09.sem_03.progorienobj;

/*
 * @author andre
Enums
An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).
To create an enum, use the enum keyword (instead of class or interface), and separate the constants 
with a comma. Note that they should be in uppercase letters:
 */
public enum Nivel_Alim {
    ALTO,
    MEDIO,
    BAJO
}
/*Difference between Enums and Classes
An enum can, just like a class, have attributes and methods. The only difference is that enum constants
are public, static and final (unchangeable - cannot be overridden).
An enum cannot be used to create objects, and it cannot extend other classes (but it can implement interfaces).

Why And When To Use Enums?
Use enums when you have values that you know aren't going to change, like 
month days, days, colors, deck of cards, etc.*/