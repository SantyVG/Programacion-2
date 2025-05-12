
import java.io.BufferedWriter;
import java.io.FileWriter;
import java. util.Arrays;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Sala de Sistemas
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    }
    private static void crearArchivoListas(){
        List<String> lineas = Arrays.asList(
        "duban",
        "vasquez",
        "gallo"
        );
        
        try (bufferedWriter writer = new BufferedWriter(new FileWriter("archivo.txt"))){
            
        }
    }
    
}
