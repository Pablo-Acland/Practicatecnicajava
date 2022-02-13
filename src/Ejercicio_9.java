import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {
        Scanner captura= new Scanner(System.in);
        String b;
        String a= "La sonrisa sera la mejor arma contra la tristeza ";

        System.out.println("Ingrese una frase");
        b=captura.nextLine();
        System.out.println(a.replace("a","e")+b);
    }
}
