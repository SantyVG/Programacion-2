/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasjava;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Sala de Sistemas
 */
public class listas {
    public static void main(String[] args) {
        
        
        int a[]= new int [10];
        
        a[0] = 100;
        a[1] = 200;
        a[2] = 300;
        a[3] = 400;
        System.out.println(" el valor del array es: "+a[0]);
        
        ArrayList<String> lst = new ArrayList();
        
        lst.add(0,"duban");
        lst.add("santiago");
        
        System.out.println("el valor del array es: "+lst);
        
        lst.remove(0);
        System.out.println("array despues de eliminar "+lst);
         lst.clear();
        System.out.println("array despues de limpiar: "+lst);
        
        
        
        boolean existe = lst.contains("duban");
        
        if(existe){
            System.out.println(" hemos encontrado tu busqueda:");
        }else{
            System.out.println("lo lamentamos no hems encontrado tu busqueda:");
        }
        lst.add(0,"duban");
        lst.add(0,"santiago");
        lst.add(0,"mateo");
        lst.add(0,"marian");
        
        Collections.sort(lst);
        System.out.println("ordenando la lista:"+lst);
    }
}
