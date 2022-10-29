/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iniciar;

import java.util.ArrayList;

/**
 *
 * @author Julio Cesar Santaman Cruz.
 */
public class Iniciar {

    
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        
        /*
            Realizamos la creación de dos objetos.
            burbuja -> lo utilizaremos para el ordenamiento de burbuja.
            selección -> lo utilizaremos para el ordenamiento de selección.
        */
        Ordenamientos burbuja = new Ordenamientos();
        Ordenamientos seleccion = new Ordenamientos();
        
        /*
            Creamos dos ArrayList, es donde se almacenarán los valores númericos.
        
            valor por referencia.
        */
        //ArrayList<Integer> dato = new ArrayList();
        int [] dato = new int[1000];
        ArrayList<Integer> dato2 = new ArrayList();
        
        
        /*
            Rellenamos nuestro ArrayList dato con
            números aleatorios entre 1 y 1000 hasta que sean 1000 números.
        
        */
        for(int i=0; i<1000; i++) {
            //dato.add(((int) (Math.random() * 1000) + 1));
            dato[i] = ((int) (Math.random() * 1000) + 1);
        }
        
        /*
            Vamos a rellenar nuestro ArrayList dato2 con los valores aleatorios
            que contiene el ArrayList dato.
        */
        /*for(int i=0; i<1000; i++) {
            dato2.add(dato.get(i));
        }*/
        
        //dato2 = (ArrayList<Integer>) dato.clone();
        
        

        /*
            burbuja llama al método ordBurbuja y como parámetro le pasamos -> dato.
            seleccion llama al método ordSeleccion y como parámetro le pasamos -> dato2.
            
            dato es nuestro ArrayList.
            dato2 es nuestro segundo ArrayList.
            Los dos tienen los mismos valores desordenados.
            
        */

        int[] datoOrdenado = new int[1000];
        //datoOrdenado = burbuja.ordBurbuja2(dato);
        
        for(int i=0; i<1000; i++) {
            System.out.println(dato[i]);
        }
        
        //seleccion.ordSeleccion(dato2);

        /*
            Imprimimos por consola los números ordenados del ArrayList dato.
            Como los dos ArrayList son ordenados por los métodos anteriores 
            y son los mismos valores entonces con que se muestre cualquiera
            de los dos ArrayList es correcto porque es la misma impresión de valores.
        */
        /*for(int i=0; i<1000; i++) {
            System.out.println("Valor "+ (i+1) + " --> " + dato.get(i));
        }*/
 
    }
    
}
