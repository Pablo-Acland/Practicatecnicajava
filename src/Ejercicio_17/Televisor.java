package Ejercicio_17;

public class Televisor extends Electrodomestico {
    private int resolucion=20;
    private boolean STDT=false;


    public Televisor(){
        super();
    }

    public Televisor(int pBase, int peso){
        super(pBase, peso);

    }

    public Televisor(int pBase, int peso, String color, char ce, int resolucion, boolean STDT) {
        super(pBase, color, ce, peso);
        this.resolucion = resolucion;
        this.STDT = STDT;
    }

    public int getResolucion() {
        return this.resolucion;
    }

    public boolean isSTDT() {
        return this.STDT;
    }

    public double precioFinal(){
        double precio = super.precioFinal();

        if(this.resolucion > 40){
            if(this.STDT == true){
                precio = ((precio * 1.30) + 50);
                return precio;
            }
            precio = (precio * 1.30);
            return precio;

        }else {
            return precio;
        }

    }
}
