## Como crear un Fichero:
>
Para crear un archivo en Java se utiliza el método `createNewFile()`.
Este método devuelve un  `boolean: true` si el fichero se ha creado correctamente, y `false` si el fichero ya existe.
El método debe de estar encerrado en un bloque `try...catch`, pues
en caso de error se lanza una `IOException`.
>
Se puede especificar el directorio concreto donde crear el Fichero especificando la nueva ruta, por ejemplo:
>
```
File myObj = new File("C:\\Users\\MyName\\filename.txt");
```
