import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_12 {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        String b,a;

        System.out.println("primera palabra");
        a=captura.nextLine();
        System.out.println("segunda palabra");
        b=captura.nextLine();

        if (a.equalsIgnoreCase(b)){
            System.out.println("son iguales");
        }else{
            System.out.println("Son diferentes");
        }
    }
}
