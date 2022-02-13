import java.util.Random;

public class Pruebas {
    public static void main(String[] args) {
        String a;
        a= generarDNI();
        System.out.println(a);
    }

    public static String generarDNI(){
        String[] letras = {"M","G","T","A","R","W","Q","L","P","D","X","H","N","J","Z","S","E","V","C","F","B","K","Y"};
        Random r = new Random();
        int dni2;
        String dniFin;
        int dni = r.nextInt(99999999);
        dni2 = dni / 23;
        dni2 = dni2 * 23;
        dni2 = dni - dni2;
        dniFin = dni+"-"+letras[dni2];
        return dniFin;
    }

}
