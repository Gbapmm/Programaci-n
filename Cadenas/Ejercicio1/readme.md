# Enunciado
>
Crea una pequena aplicación que permita leer una serie de caracteres, que se leerán en formato de número (de 0 a 65535, que son las posiciones en las que se encuentran los caracteres en la tabla Unicode), y que realizará una determinada operación sobre este listado de caracteres.
>
A aplicación debe cumprir os seguintes requisitos:
>
* Solicitar una cantidad de números a leer, que estará entre 1 e 50. Si se selecciona 0
se mostrará un mensaje de que se está saliendo del programa, y terminará su execución.
>
* Mostrará un pequeno menú para realizar operaciones sobre los números que se van a leer.
Este menú tendrá un formato como el siguiente:
```
Opciones disponibles:
    1. Indicar cuantas letras hay.
    2. indicar cuantos dígitos hay.
    3. Indicar cuantos son mayúsculas.
    4. Trasnformalro todo a minúsculas.
    5. Salir.
```
* Se deberá de repetir la lectura de la opción seleccionada meintras que no se escoja una de las
opciones disponibles.
>
* En caso de seleccionar la opción 5, se mostrará un mensaje de que se está saliendo del
programa, y terminará a su ejecución.
* Para cualquier otra opción, a continuación se leerán tantos números (simbolizando a los caracteres de la tabla Unicode) como se indicara previamente.
* Para cada número leído se mostrará el valor del carácter correspondiente.
* Para las opciones 1, 2 y 3, se mostrará al final de la lectura el resultado.
* Para la opción 4 se mostrará a continuación del valor del carácter su minúscula.
* Se debe controlar los posibles errores que ocurran a lo largo del programa, no puede en ningún caso surgir una excepción o cualquier otro error.
* La ejecución se repetirá continuamente hasta que no se seleccione la opción de salida.