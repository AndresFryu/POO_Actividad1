package Actividad1_POO.Ej_14;


import java.util.Scanner;

public class PruebaPotenciacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Numero: ");
        double numero = scanner.nextDouble();

        double cuadrado = Potenciacion.calcularcuadrado(numero);
        double cubo = Potenciacion.calcularcubo(numero);

        System.out.println("El cuadrado de " + Math.round(numero) + " es: " + Math.round(cuadrado));
        System.out.println("El cubo de " + Math.round(numero) + " es: " + Math.round(cubo));

        scanner.close();
    }
}
