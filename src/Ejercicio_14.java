import java.util.Scanner;

public class Ejercicio_14 {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        int x;
        System.out.println("increse un numero");
        x=captura.nextInt();
        if (x>1000){
            System.out.println("el numero no es valido");
            x=x+2;
        }
        while (x<1002)
            if (1000<x) {
                x=x-1;
                System.out.println(x);
                x=x+2;
            }else {
                System.out.println(x);
                x=x+2;
            }
        }
    }

