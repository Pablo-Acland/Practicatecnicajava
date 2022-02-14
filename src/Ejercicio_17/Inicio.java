package Ejercicio_17;

public class Inicio {
    public static void main(String[] args) {
        int PFLavadora = 0;
        int PFTelevision = 0;
        int PFElectrodomestico = 0;
        int PFTotal = 0;

        Electrodomestico[] EArreglo = new Electrodomestico[10];
        EArreglo[0] = new Electrodomestico(200,"Gris" , 'A', 100 );
        EArreglo[1] = new Electrodomestico(542, "Rojo", 'D', 240);
        EArreglo[2] = new Electrodomestico();
        EArreglo[3] = new Lavaropas(600, 150, "negro", 'F', 60);
        EArreglo[4] = new Lavaropas(400, 92, "azul", 'C', 77);
        EArreglo[5] = new Lavaropas(370, 50);
        EArreglo[6] = new Televisor(920, 12, "negro", 'B', 65, true);
        EArreglo[7] = new Televisor(1500, 18, "azul", 'A', 50, true);
        EArreglo[8] = new Televisor(790, 12, "blanco", 'C', 35, false);
        EArreglo[9] = new Televisor(1200, 15);



        for(Electrodomestico electrodomestico : EArreglo){

            if(electrodomestico instanceof Lavaropas){
                PFLavadora += electrodomestico.precioFinal();

            }else if(electrodomestico instanceof Televisor){
                PFTelevision += electrodomestico.precioFinal();

            }else if (electrodomestico instanceof Electrodomestico){
                PFElectrodomestico += electrodomestico.precioFinal();

            }
        }

        System.out.println("Precio total de lavadoras "+PFLavadora+"\n");
        System.out.println("Precio total de Televisores "+PFTelevision+"\n");
        System.out.println("Precio total de Electrodomesticos "+PFElectrodomestico+"\n");

        PFTotal= PFElectrodomestico+PFLavadora+PFTelevision;
        System.out.println("Precio total de todo "+PFTotal);
    }
}
