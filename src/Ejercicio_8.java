import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner captura= new Scanner(System.in);
        String dia;
        do {


        System.out.println("Ingrese un Dia de la Semana");
        dia= captura.nextLine();

        switch (dia){
            case "lunes":
                System.out.println("Dia Laborable");
                break;
            case "martes":
                System.out.println("Dia Laborable");
                break;
            case "miercoles":
                System.out.println("Dia Laborable");
                break;
            case "jueves":
                System.out.println("Dia Laborable");
                break;
            case "viernes":
                System.out.println("Dia Laborable");
                break;
            case "sabado":
                System.out.println("Dia No Laborable");
                break;
            case "domingo":
                System.out.println("Dia No Laborable");
                break;
        }
        }while (!dia.equalsIgnoreCase("n"));
    }
}
