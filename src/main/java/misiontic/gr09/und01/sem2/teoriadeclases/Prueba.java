/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.gr09.und01.sem2.teoriadeclases;

//import static misiontic.gr09.und01.sem2.teoriadeclases.MiprimeraClase.impresion;
import java.util.Date;
import java.time.*;
/**
 *
 * @author andre
 */
class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //Crear un objeto
        //Nombre de la Clase  nombre del objeto = new  nombre del la clase();
        //Un objeto es una instancia de una clase. Un objeto hereda los atributos y metodos de la clase.
        /*
        MiprimeraClase objUno = new MiprimeraClase();  //objeto 1 
        MiprimeraClase objDos = new MiprimeraClase(); //objeto 2
        
        objUno.x = 10; //modificacion de atributos
        //objUno.y = 6;  //me señala un error No se puede asignar un valor a una variable con 'final'
        
        System.out.println("El valor del atributo x del objeto Uno es: " + objUno.x);
        System.out.println("El valor del atributo x del objeto Uno es: " + objDos.x);
        System.out.println( objDos.saludo);
        
        //Verificacion de metodos .........Static vs Public
        
        //verificar1(); error .....solo se ejecutaria asi dentro de la misma clase
        
        objUno.verificar1(); //metodo static No aparece en las sugerencias de notacion de punto
        //Igual lo deja ejecutar con la creacion del objeto.
        objUno.verificar2(); // metodo public  Aparece en las sugerencias de notacion de punto
        // requiere un objeto para ejecutarse.
        objUno.verificar3(objUno.y); // metodo public  Aparece en las sugerencias de notacion de punto
        //acepta el atributo y como argumento. 
        System.out.println("<<<<<<<<---------------------------------------------------->>>>>>>>>\n " );
        */
        
        /*
        //Prueba del constructor
        
        Automovil autoN = new Automovil( 1420, "Generico"); //puede tener parametros
        // y no tienen que ir todos los atributos como parametros.
        
        System.out.println("Este auto tiene un peso (kg.) de : " + autoN.peso);
        System.out.println("Pueden ir en él : " + autoN.numPer + "personas");
        System.out.println("El auto es del tipo : " + autoN.tipo);
        System.out.println("La velocidad que alcanza es : " + autoN.vel + " km/seg");
        */
        
        /*
        Year año =   Year.now() ;  //Tipo de dato Year????
        System.out.println("El año actual es : " + año);
        //Pero no puedo hacer operaciones de suma o resta con el porque no es un entero
        //solucion: int modelo = Year.now().getValue();
        */
        
        /*
        System.out.println("<<<<<Herencia>>>>>\n" );
        //
        Auto auto_1 = new Auto(); //Creamos una instancia u objeto auto.
        
        auto_1.setModelo(2020); //Setter de la clase vehiculo
        System.out.println("Marca: " + auto_1.marca + "\n" ); //herede el atributo de vehiculo
        System.out.println("Modelo (año): " + auto_1.getModelo() + "\n" ); //Getter de la clase vehiculo
        System.out.println("Prototipo : " + auto_1.marca + " " + auto_1.modelo_Tipo + " " + auto_1.getModelo() + "\n" );
        auto_1.honk();
       */
        
        /*
        //Polimorfismo - De la mano con la herencia
        Like we specified in the previous chapter; Inheritance lets us inherit attributes and methods
        from another class. Polymorphism uses those methods to perform different tasks. 
        This allows us to perform a single action in different ways.

        For example, think of a superclass called Animal that has a method called animalSound().
        Subclasses of Animals could be Pigs, Cats, Dogs, Birds - And they also have their own 
        implementation of an animal sound (the pig oinks, and the cat meows, etc.):
        */
        
         /*
        System.out.println("<<<<<Polimorfismo>>>>>\n" );
        //Creamos los objetos de una manera diferente....
        Vehiculo v_Auto = new Auto();  //Vehiculo - Auto
        Vehiculo v_Barco = new Barco(); //Vehiculo - Barco
        
        System.out.println("<<<<< toca la bocina >>>>>\n" );
        System.out.println("Auto.....");
        v_Auto.honk();
        System.out.println("Barco....." );
        v_Barco.honk(); // La misma funcion/metodo para multiples objetos
        */
        
        System.out.println("<<<<<Clases anidadas o internas>>>>>\n" );
        /*
        Externa c_externa = new Externa(); // creamos un objeto de la clase externa
        Externa.Interna c_interna = c_externa.new Interna(); //con el objeto de la clase externa creamos el de la interna
        System.out.println(c_interna.y + c_externa.x); //llamamos los atributos de ambas..
        */
        //Si la clase interna tuviera un acceso static....
        /*
        Externa.Interna c_interna = new Externa.Interna(); //Solo creamos el objeto con la notacion de punto
        System.out.println(c_interna.y);
        */
        
        //Acceso a la clase externa desde la interna....
        Externa c_externa = new Externa(); // creamos un objeto de la clase externa
        Externa.Interna c_interna = c_externa.new Interna(); //con el objeto de la clase externa creamos el de la interna
        System.out.println(c_interna.metodoInterno());
    }
    
}

