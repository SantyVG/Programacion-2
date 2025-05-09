/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exception;

/**
 *
 * @author Sala de Sistemas
 */
public class main {

    
    public static void main(String[] args) {
       try{
           
           int v[]={1,2,4,5};
           System.out.println("el resultado es"+v[4]);
       }
           catch(Exception e){
                   System.out.println(e );
       }
       finally{
           System.out.println("esto es un mensaje desde el final");
       }
       }
    }
    

