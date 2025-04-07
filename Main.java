import java. util.ArrayList;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Sala de Sistemas
 */
public class Main {

    
    public static void main(String[] args) {
       // int i;
        ArrayList<Integer> lst = new ArrayList();
        
        lst.add(200);
        lst.add(300);
        lst.add(400);
        lst.add(500);
        
        
        System.out.println(lst);
        for(int i=0;  i<lst.size();i++) {
            
            System.out.println("Los valores del array son:"+lst.get(i));
            lst.remove(i);
            //System.out.println("Los valores del array despues de eliminar :"+lst.remove(i));
            
            System.out.println(lst.size());
            
        }
   
    



       
        
    }
    
}
