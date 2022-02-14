package Ejercicio_17;

public class Lavaropas extends Electrodomestico{
    private int carga= cdefault;
    private final static int cdefault=5;

    Lavaropas(){
        super();
    }

    public Lavaropas(int pBase, int peso){
        super(pBase, peso);
    }

    public Lavaropas(int pBase, int peso, String color, char ce, int carga) {
        super(pBase, color, ce, peso);
        this.carga = carga;

    }

    public int getCarga() {
        return this.carga;
    }

    public double precioFinal(){
        double precio = super.precioFinal();

        if(this.carga > 30){
            precio += 50;
            return precio;
        }
        return precio;
    }
}
