# Practica de Ramoncín

Objetivos:

Manejar estructuras de datos avanzadas (matrices bidimensionales)
Práctica:

Un cliente nos solicita realizar un juego del estilo "hundir la flota", pero en este caso se llamará "APescar".
Consistirá en un tablero (filas x columnas) donde en cada casilla se representará uno de los siguientes estados numéricos entre [1 - 4]:
1 - Tierra
2 - Mar
3 - Peces ya NO (en esta zona había peces pero ya han sido pescados)
4 - Peces SI (aún no han sido pescados)
El programa en su fase inicial solo permitirá gestionar el tablero
Crearlo (filas x columnas)
Cargarlo con los 4 estados
Mostrarlo
Ponerlo a cero
Entregar:

Implementación en lenguaje de programación Java (.java).
Especificaciones: (Crear las siguientes clases con las propiedades y métodos indicados)

Clase: Tablero
 Propiedades: int (fila), int (columna), int[][] tablero
 Métodos:
getters/setters
Constructores
setEstado (fila int, columna int, estado int)
showTableroEstados() // Mostrará todo el tablero en pantalla con los valores
showTableroGrafico
1 - Tierra > #
2 - Mar > ~
3 - Peces si > *
4 - Peces no > x
setTableroCostaNoroeste() // Cargará un tablero simulando la consta noroeste y las zonas de pesca.
deleteTablero() // Pone a un valor 1 "Tierra" todo el tablero. Debes utilizar dos bucles anidados para realizar esta operación.
Clase: Instanciadora
Propiedades: (ninguna)
Métodos: main(String[] args)
El método main debe instanciar 1 Tablero y mostrarlo en pantalla.
====================================================

.- Tablero de ejemplo de dimensiones (7x16). No hay que implementar este ejemplo, implementa uno que te inventes con el límite de dimensiones de 15x15

~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ * * * * ~

~ ~ ~ ~ * * * * ~ ~ ~ ~ ~ ~ ~ ~

~ ~ ~ ~ * * * ~ ~ ~ ~ ~ ~ ~ ~ ~

~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~

~ ~ ~ ~ ~ ~ ~ ~ * * * ~ ~ ~ # #

~ ~ ~ ~ ~ ~ ~ ~ * * ~ # # # # #

~ ~ ~ ~ ~ ~ ~ ~ ~ ~ # # # # # #
====================================================


Plan de pruebas:

Se debe de ejecutar la siguiente secuencia: Crear tablero (dimensiones entre 5x5 y 15x15 a elegir, y que incluya una variedad de todos los valores permitidos) > Mostrar tablero con valores numéricos > Borrar tablero > Mostrar tablero con valores numéricos > Crear tablero (dimensiones entre 5x5 y 15x15 a elegir, y que incluya una variedad de todos los valores permitidos) > Mostrar tablero de forma gráfica interpretando cada valor numérico
Estas llamadas puedes realizarlas dentro de la clase Instanciadora creando un método llamado "planDePruebas_01()" que sea llamado desde la clase main()
