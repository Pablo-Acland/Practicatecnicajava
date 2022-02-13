import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner captura= new Scanner(System.in);
        int x;
        do {
            System.out.println("Ingrese un numero mayor a 0 ");
            x=captura.nextInt();
        }while (x<0);
        System.out.println("El numer es "+x);
    }
}
