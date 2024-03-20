public class GestAirport{
    public class static void (String[]args){
        inicio = System.currentTimeMillis();

        while(true){

       System.out.println("1. Mostrar cola de vuelos"
                    + "\n2. Añadir un nuevo vuelo"
                    + "\n3. Eliminar un vuelo"
                    + "\n4. Dar salida a un vuelo"
                    + "\n5. Actualizar lista de vuelos"
                    + "\n6. Modificar horarios de un vuelo"
                    + "\n7. Salir");

            System.out.println("Seleccione una opción:");
            int opcion = scanner.nextInt();

        switch (opcion) {
                case 1:
                    showVuelos(colaVuelos);
                    break;
                case 2:
                    darSalidaVuelo(colaVuelos);
                    break;
                case 3:
                    actualizarListaVuelos(colaVuelos);
                    break;
                case 4:
                    modificarHorariosVuelo(colaVuelos);
                    break;
                case 5:
                    mostrarAgradecimiento();
                    scanner.close();
                    System.exit(0);
                    break;
            }
        }
    }
}
