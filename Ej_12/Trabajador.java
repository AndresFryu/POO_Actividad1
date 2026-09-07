package Actividad1_POO;

public class Trabajador {

    public static void main(String[] args) {
        
        // Datos dados del trabajador
        int horasTrabajadas = 48;
        double valorHora = 5000;
        
        // 0.125 / 12.5% de retención en la fuente
        double porcentajeRetencion = 0.125; 
        
       
        double salarioBruto = horasTrabajadas * valorHora;
        double retencion = salarioBruto * porcentajeRetencion;
        double salarioNeto = salarioBruto - retencion;
        
        // Notar que dice printf, otra forma es usar math.round() para redondear el valor a 0 decimales
        System.out.printf("El salario bruto es: $%.0f\nLa retención en la fuente es: $%.0f\nEl salario neto es: $%.0f\n", 
                        salarioBruto, retencion, salarioNeto); // el \n es para hacer un salto de línea en la consola

    }
} 
    
