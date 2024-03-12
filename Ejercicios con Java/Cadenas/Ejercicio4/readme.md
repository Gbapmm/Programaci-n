# Enunciado
>
Se deberá crear un método llamado contarFrase al que se le pasará un String. El método deberá contabilizar el número de párrafos, frases, palabras y caracteres que conforman el String pasado como parámetro.
>
Para la implementación del método vamos a considerar que se pasa un texto bien escrito, es decir:
* Cada palabra está separada de otra por un solo espacio en blanco.
* El final de frase está marcado correctamente con un carácter de '.' pegado a la última palabra.
* Una nueva frase debe separarse de la anterior por un espacio en blanco, a menos que esta nueva frase esté en un nuevo párrafo.
* Los párrafos se separan por el carácter '\n'.
>
A la hora de contar los caracteres se tendrán en cuenta todos los espacios en blanco, caracteres de puntuación, símbolos, caracteres, etc.
>
Si se realizó la autoevaluación de la Tarea3, deberá incluirse este método en la clase OperacionesCadenas; de lo contrario, se deberá crear la clase e incluir en ella el método. En la clase principal se deberá mostrar el funcionamiento del método.