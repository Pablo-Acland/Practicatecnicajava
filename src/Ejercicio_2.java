import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner captura= new Scanner(System.in);

        int x,y;

        System.out.println("Ingrese el primer valor ");
        x= captura.nextInt();
        System.out.println("Ingrese el segundo valor ");
        y= captura.nextInt();
        if (x > y) {
            System.out.println(x+" es mayor que "+y);
        }else if (y > x) {
            System.out.println(y+" es mayor que "+x);
        }else {
            System.out.println(x+" es igual que "+y);
        }
    }
}
