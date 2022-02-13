public class Ejercicio_6 {
    public static void main(String[] args) {
        int x=1;
        for (int i=0;i<100;i++){
            if ((x%2)==0) {
                System.out.println("Numero par "+x);
                x++;
            }else {
                System.out.println("Numero impar "+x);
                x++;
            }
        }
    }
}
