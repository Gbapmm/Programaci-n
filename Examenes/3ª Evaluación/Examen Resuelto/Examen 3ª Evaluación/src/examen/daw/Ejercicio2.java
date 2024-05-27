package examen.daw;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Ejercicio2 {

    public static void ejecutar() {
        Scanner scan = new Scanner(System.in);
        String respuesta = "";
        String line = "";
        String comp="";
        int counter = 0;
        System.out.println("Dime una palabra:");
        respuesta=scan.nextLine();
        try(BufferedReader br = new BufferedReader(new FileReader(".\\data\\ejercicio_2\\ejercicio_2.txt"))){
            line=br.readLine();
            while(line!=null){
                comp+=line;
                line=br.readLine();
            }
            String [] palabras = comp.split(" ");
            for(String palabra:palabras){
                if(palabra.equals(respuesta)){
                    counter++;
                }
            }
            System.out.println("La palabra "+respuesta+"aparece "+counter+" veces.");

        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

}