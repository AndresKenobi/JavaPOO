/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.gr09.und01.sem2.teoriadeclases;

//import static misiontic.gr09.und01.sem2.teoriadeclases.MiprimeraClase.impresion;

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
        
        //Prueba del constructor
        
        Automovil autoN = new Automovil( 1420, "Generico"); //puede tener parametros
        // y no tienen que ir todos los atributos como parametros.
        
        System.out.println("Este auto tiene un peso (kg.) de : " + autoN.peso);
        System.out.println("Pueden ir en él : " + autoN.numPer + "personas");
        System.out.println("El auto es del tipo : " + autoN.tipo);
        System.out.println("La velocidad que alcanza es : " + autoN.vel + " km/seg");
        
        
        
    }
    
}

