## Como crear un Fichero:
>
Para crear un archivo en Java se utiliza el método `createNewFile()`.
Este método devuelve un  `boolean: true` si el fichero se ha creado correctamente, y `false` si el fichero ya existe.
El método debe de estar encerrado en un bloque `try...catch`, pues
en caso de error se lanza una `IOException`.
>
>
```
import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

public class CreateFile {
  public static void main(String[] args) {
    try {
      File myObj = new File("filename.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
```
>
Se puede especificar el directorio concreto donde crear el Fichero especificando la nueva ruta, por ejemplo:
>
```
File myObj = new File("C:\\Users\\MyName\\filename.txt");
```
