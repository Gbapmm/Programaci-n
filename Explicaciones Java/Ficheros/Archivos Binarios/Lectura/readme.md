## Como leer archivos binarios:
>
A diferencia de un archivo de texto normal, para poder leer el contenido de un archivo binario debemos leer los **bytes** del archivo,
para esto se utiliza el método `read()` que la clase `FileInputStream`proporciona.
>
En el caso de querer leer datos de tipo primitivo, es decir **Int, String, Float, etc** se utilizará un objeto `DataInputStream` 
que proporciona los métodos especificos para cada tipo de dato.
