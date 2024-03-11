# Enunciado
>
En esta tarea se creará un método que nos permita leer dos cadenas y comprobar que ambas son iguales. A continuación, se creará un programa que utilice el método para solicitar y verificar las dos cadenas por parte del usuario. Deberá mostrar el resultado de comprobar las dos cadenas.
>
Este método deberá solicitar la introducción de una cadena desde la consola. A continuación, pedirá una confirmación de esa cadena. Una vez leídas las dos cadenas, deberá comprobar que son iguales.
>
Para implementar este método, deberán tenerse en cuenta las siguientes consideraciones:
>
* Las cadenas no pueden estar vacías; en ese caso, se dará un aviso al usuario y se solicitará nuevamente su introducción.
* También se debe comprobar que ambas cadenas son iguales. Hay que tener en cuenta que la longitud de las dos cadenas debe coincidir y también que pueden ser iguales, pero tal vez no estén escritas de la misma forma (mayúsculas/minúsculas).
* La salida del método será:
    * -1 cuando la longitud de las cadenas no sea la misma y, por lo tanto, no se pueden comparar.
    * 0 cuando no sean iguales.
    * 1 cuando sean iguales lexicográficamente.
    * 2 cuando sean exactamente iguales, es decir, coincidan lexicográficamente y además las mayúsculas y minúsculas se correspondan entre sí.