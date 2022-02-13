import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner captura= new Scanner(System.in);
        final double iva= 21;
        double x;
        System.out.println("Ingrese el precio del Producto");
        x= captura.nextDouble();

        System.out.println("Valor del Producto con IVA "+ (x+(x*iva)/100));

    }
}
