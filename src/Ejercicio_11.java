import java.util.Scanner;

public class Ejercicio_11 {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        String b,a;
        int x;

        System.out.println("Ingrese una frase");
        b = captura.nextLine();
        a=b.replaceAll("[^a]","");
        x=a.length();
        a=b.replaceAll("[^e]","");
        x=x+a.length();
        a=b.replaceAll("[^i]","");
        x=x+a.length();
        a=b.replaceAll("[^o]","");
        x=x+a.length();
        a=b.replaceAll("[^u]","");
        x=x+a.length();
        System.out.println("la frase tiene "+b.length()+" letras y tiene "+x+" vocales");
    }
}
