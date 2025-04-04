/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciclos2025;

import java.util.Scanner;

/**
 *
 * @author Sala de Sistemas
 */
class ciclo {
    public static void main(String[] args) {
         boolean ciclo = true;
         double nota1=0, nota2=0, nota3=0;
        while (ciclo){
            Scanner leer = new Scanner (System.in);
            
            
            System.out.println("menu principal:\n1.digitar nota1,\n2. digite nota2,\n3.digite nota3,\n4.calcular nota final,\n5.salir");
            System.out.println("digite una opcion:");
            int opcion=leer.nextInt();
            
            
            switch (opcion){
            case 1-> {
                System.out.println("haz seleccionado la opcion 1,ingrese primera nota:");
                nota1=leer.nextDouble();
                ciclo = true;
            }
            case 2-> {
                System.out.println("haz selecionado la opcion 2,ingrese segunda nota:");
                nota2=leer.nextDouble();
                ciclo = true;
            }
            case 3-> {
                System.out.println("haz selecionado la opcion 3,ingrese tercera nota:");
                nota3=leer.nextDouble();
                ciclo = true;
            }
            case 4-> {
                double notaF =(nota1 + nota2 + nota3)/3;
                System.out.println("haz selecionado la opcion 4, su nota final es:"+notaF);
                notaF=leer.nextDouble();
                ciclo = true;
            }
            case 5-> {
                System.out.println("haz salido, adios ");
                ciclo= false;
                break;
                
    }
}
    }
    }
}