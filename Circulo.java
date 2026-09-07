package Actividad1_POO;

public class Circulo {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    // Método para calcular el área usando Math.PI y Math.pow
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    // Método para calcular la longitud de la circunferencia
    public double calcularLongitud() {
        return 2 * Math.PI * radio;
    }
}