import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        String b;

        System.out.println("Ingrese una frase");
        b = captura.nextLine();

        System.out.println(b.replaceAll(" ", ""));
    }
}
