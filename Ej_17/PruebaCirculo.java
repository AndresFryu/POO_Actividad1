package Actividad1_POO.Ej_17;

import java.util.Scanner; //pa llamar al scanner manin

public class PruebaCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble(); 

        // Creo aca el objeto Circulo pasándole el radio ingresado
        Circulo miCirculo = new Circulo(radio);

        System.out.println("El área del círculo es: " + (miCirculo.calcularArea()));
        System.out.println("La longitud de la circunferencia es: " + (miCirculo.calcularLongitud()));

        scanner.close(); // Cerramos el scanner al terminar
    }
}
