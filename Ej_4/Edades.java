package Actividad1_POO.Ej_4;

public class Edades{
    public static double Calcular_edalber(double edjuan){
        return (edjuan*2/3);
    }
    public static double Calcular_edana(double edjuan){
        return (edjuan*4/3);
    }

    public static double Calcular_edmama(double edjuan, double edana, double edalber){
        return edjuan + edana + edalber ;
    }

}

class main{
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Ingrese la edad de Juan: ");
        double edjuan = scanner.nextDouble();

        double edalber = Edades.Calcular_edalber(edjuan);
        double edana = Edades.Calcular_edana(edjuan);
        double edmama = Edades.Calcular_edmama(edjuan, edana, edalber);

        System.out.println("La edad de Juan es: " + edjuan);
        System.out.println("La edad de Alberto es: " + edalber);
        System.out.println("La edad de Ana es: " + edana);
        System.out.println("La edad de la mamá es: " + edmama);
    }
}
