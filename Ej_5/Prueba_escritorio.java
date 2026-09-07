package Actividad1_POO;

public class Prueba_escritorio {

    public static void main(String[] args) {
        
        // Declaramos las variables como 'double' para permitir decimales
        double suma = 0;
        double x = 20;
        
        suma+= x;
        
        double y = 40;
        
        x = x + Math.pow(y, 2);
        
        // Realizamos el cálculo final
        suma = suma + (x / y);
        
        // Imprimimos el resultado en pantalla
        System.out.println("EL VALOR DE LA SUMA ES: " + suma);
    }
}
