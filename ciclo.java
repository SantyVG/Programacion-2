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
        while (ciclo){
            Scanner leer = new Scanner (System.in);
            
            System.out.println("menu principal:\n1.digitar nota1,\n2. digite nota2,\n3.digite nota3,\n4.calcular nota final,\n5.salir");
            System.out.println("digite una opcion:");
            int opcion=leer.nextInt();
            switch (opcion){
            case 1-> {
                System.out.println("haz seleccionado la opcion 1");
                ciclo = true;
            }
            case 2-> {
                System.out.println("haz selecionado la opcion 2");
                ciclo = true;
            }
            case 3-> {
                System.out.println("haz selecionado la opcion 3");
                ciclo = true;
            }
            case 4-> {
                System.out.println("haz selecionado la opcion 4");
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