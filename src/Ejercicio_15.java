import java.util.Scanner;

public class Ejercicio_15 {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        String a;
        do {
            System.out.println("***************** GESTION CINEMATOGRÁFICA ****************************************\n"+
                    "*                 1-NUEVO ACTOR                                                  *\n"+
                    "*                 2-BUSCAR ACTOR                                                 *\n"+
                    "*                 3-ELIMINAR ACTOR                                               *\n"+
                    "*                 4-MODIFICAR ACTOR                                              *\n"+
                    "*                 5-VER TODOS LOS ACTORES                                        *\n"+
                    "*                 6-VER PELICULAS DE LOS ACTORES                                 *\n"+
                    "*                 7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES                *\n"+
                    "*                 8-SALIR                                                        *\n"+
                    "**********************************************************************************\n");
            a=captura.nextLine();
            switch (a){
                case "1":
                    System.out.println("Se ingreso un Actor Nuevo\n");
                    break;
                case "2":
                    System.out.println("Actor buscado\n");
                    break;
                case "3":
                    System.out.println("Actor Eliminado\n");
                    break;
                case "4":
                    System.out.println("Actor Modificado\n");
                    break;
                case "5":
                    System.out.println("Todos los Actores\n");
                    break;
                case "6":
                    System.out.println("Peliculas del Actor\n");
                    break;
                case "7":
                    System.out.println("Categoria de la pelicula del Actor\n");
                    break;
            }
        }while (!a.equalsIgnoreCase("8"));
    }
}
