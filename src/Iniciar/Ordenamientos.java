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
public class Ordenamientos {
    
    /*  valor por referencia
        valor por valor
        final
        ArrayList<Integer> result = data.clone();
        ArrayList<Integer> result = new ArrayList<Integer>(data);
    */
    //Ordenamiento burbuja.
    public ArrayList<Integer> ordBurbuja(ArrayList<Integer> data) {
        
        ArrayList<Integer> result = data; //Resultado.
        boolean swaped = false; //Variable en caso de que no haya intercambio.
        long tiempoInicio, tiempoFin, resTiempo;
        
        tiempoInicio = System.currentTimeMillis();
        
        for(int i=0; i<result.size()-1; i++) { //desde 0 a n-1 iteraciones.
            swaped=false;
            
            for(int j=0; j<result.size()-i-1; j++) { //desde 0 a n-i iteraciones - 1.
                //obtenemos los valores pos y next.
                int pos = result.get(j);
                int next = result.get(j+1);
                
                //si la pos es mayor a next, se hace el intercambio
                if(pos>next) {
                    result.set(j, next);
                    result.set(j+1, pos);
                    
                    swaped=true;
                }
    
            }
            
            if(!swaped) { //Si no hubo intercambio, se acaba el método.
                break;
            }
            
        }
        
        
        tiempoFin = System.currentTimeMillis();
        
        resTiempo = tiempoFin - tiempoInicio;
        
        System.out.println("Ordenamiento burbuja --> El tiempo de ordenamiento es: " + (resTiempo/1000.0) + " segundos.");
        
        return result;
    }
    
    
    
    //Ordenamiento por selección.
    public ArrayList<Integer> ordSeleccion(ArrayList<Integer> data) {
        
        ArrayList<Integer> result = data; //Resultado.
        long tiempoInicio, tiempoFin, resTiempo;
        
        tiempoInicio = System.currentTimeMillis();
        
        for(int i=0; i<result.size()-1; i++) {
            int pos = result.get(i); //se obtiene el mínimo supuesto.
            
            for(int j=i+1; j<result.size(); j++) { //compara desde la posición de i hasta el fin del arreglo.
                
                int next = result.get(j);
                
                if(pos>next) {
                    
                    result.set(i, next);
                    result.set(j, pos);
                    
                    pos=next;
                }
                
            }
        }
        
        tiempoFin = System.currentTimeMillis();
        
        resTiempo = tiempoFin - tiempoInicio;
        
        System.out.println("Ordenamiento por selección --> El tiempo de ordenamiento es: " + (resTiempo/1000.0) + " segundos.");
        
        return result;
    }
    
    
    
}
