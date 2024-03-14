package PriorityQueue;

import java.util.PriorityQueue;

public class Farmacia {
    public static void main(String[] args) {
        PriorityQueue<Cliente> colaEspera = new PriorityQueue<>();
        colaEspera.offer(new Cliente("Juan", "No"));
        colaEspera.offer(new Cliente("María", "Si")); 
        colaEspera.offer(new Cliente("Pedro", "No")); 
        colaEspera.offer(new Cliente("Julia", null)); 
        colaEspera.offer(new Cliente("Oscar", "Si")); 
        colaEspera.offer(new Cliente("Pedro", "No")); 

        System.out.println("Cola de espera de clientes:");
        while (!colaEspera.isEmpty()) {
            System.out.println(colaEspera.poll());
        }
    }
}