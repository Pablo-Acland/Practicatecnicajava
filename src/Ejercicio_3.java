import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner captura= new Scanner(System.in);

        final double pi= 3.14159265359;
        double R;
        System.out.println("Ingrese el Radio");
        String x= captura.next();
        R= Double.parseDouble(x);
        System.out.println("El area del Circulo es "+pi*Math.pow(R,2.0));
    }
}
