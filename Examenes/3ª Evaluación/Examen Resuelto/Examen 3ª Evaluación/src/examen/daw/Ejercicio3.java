package examen.daw;

import java.io.BufferedOutputStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class Ejercicio3 {

    public static void ejecutar() {
        try(BufferedOutputStream br = new BufferedOutputStream(new FileOutputStream(".\\data\\ejercicio_3\\copia_ejercicio_3.mkv"));
            BufferedInputStream bi = new BufferedInputStream(new FileInputStream(".\\data\\ejercicio_3\\ejercicio_3.mkv"))){
            byte [] b = bi.readAllBytes();
            br.write(b);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }


    }
}
