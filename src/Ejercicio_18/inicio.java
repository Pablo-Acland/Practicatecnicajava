package Ejercicio_18;

public class inicio {
    public static void main(String[] args) {
        Series SArray[] = new Series[5];
        Videojuegos VArray[] = new Videojuegos[5];
        int CSEntregadas = 0;
        int CVEntregados = 0;

        SArray[0] = new Series("La casa de papel", 4, "Drama", "Alex Pina");
        SArray[1] = new Series("The Wicher", "Andrzej Sapkowski");
        SArray[2] = new Series("Karate kid", 4, "Comedia Dramatica", "Robert Mark Kamen");
        SArray[3] = new Series("The last dance", "Michael Jordan");
        SArray[4] = new Series();


        VArray[0] = new Videojuegos("Lige of legen", 300);
        VArray[1] = new Videojuegos();
        VArray[2] = new Videojuegos("Pokemon", 120, "RPG", "Games Friki");
        VArray[3] = new Videojuegos("FIFA22", 50);
        VArray[4] = new Videojuegos("Resident Evil 2", 40, "Survive Horror", "Capcom");

        SArray[1].entregado();
        SArray[3].entregado();
        SArray[0].entregado();

        VArray[2].entregado();
        VArray[4].entregado();
        VArray[0].entregado();

        Series SMT = SArray[0];
        Videojuegos VMH = VArray[0];

        for(int i = 0; i < SArray.length; i++){
            if(SArray[i].isEntregado()){
                CSEntregadas += 1;
                SArray[i].devolver();
            }
            if(SArray[i].compareTo(SMT) == 1 ){
                SMT = SArray[i];
            }
        }

        for( int i = 0; i < VArray.length; i++){
            if(VArray[i].isEntregado()){
                CVEntregados += 1;
                VArray[i].devolver();
            }
            if(VArray[i].compareTo(VMH) == 1){
                VMH = VArray[i];
            }
        }

        System.out.println("Series entregadas "+CSEntregadas+"\n");
        System.out.println("Videojuegos entregados "+CVEntregados+"\n\n");

        System.out.println(SMT.toString());
        System.out.println("\n");
        System.out.println(VMH.toString());

    }
}
