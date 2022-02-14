package Ejercicio_17;

public class Electrodomestico {
    private double pBase=100;
    private String color=c;
    private char ce=f;
    private int peso=5;
    private final static char f='F';
    private final static int p= 5;
    private final static double pb=100;
    private final static String c="Blanco";

    Electrodomestico(){

    }
    Electrodomestico(double pBase, int peso){
        this.pBase=pBase;
        this.peso=peso;
    }
    Electrodomestico(double pBase, String color, char ce, int peso){
        this.pBase=pBase;
        this.color= comprobarColor(color);
        this.ce=comprobarConsumoEnergetico(ce);
        this.peso=peso;
    }

    public double getpBase() {
        return pBase;
    }

    public String getColor() {
        return color;
    }

    public char getCe() {
        return ce;
    }

    public int getPeso() {
        return peso;
    }

    public char comprobarConsumoEnergetico(char ce){
        if(ce=='A' || ce=='B' || ce=='C' || ce=='D' || ce=='E' || ce=='F'){
            return ce;
        }
        return 'F';
    }

    public String comprobarColor(String color){
        if(color=="Blanco" || color=="Negro" || color=="Rojo" || color=="Azul" || color=="Gris"){
            return color;
        }
        return "Blanco";
    }

    public double precioFinal(){
        double precio = 0;

        if(this.ce == 'A'){
            if (this.peso >= 0 && this.peso <= 19){
                precio = (this.pBase + 10);
                return precio;
            }else if(this.peso >= 20 && this.peso <= 49){
                precio = (this.pBase + 50);
                return precio;
            }else if(this.peso >= 50 && this.peso <= 79){
                precio = (this.pBase + 80);
                return precio;
            }else if(this.peso >= 80){
                precio = (this.pBase + 100);
                return  precio;
            }
        }
        if(this.ce == 'B'){
            if (this.peso >= 0 && this.peso <= 19){
                precio = ((this.pBase - 20) + 10);
                return precio;
            }else if(this.peso >= 20 && this.peso <= 49){
                precio = ((this.pBase - 20) + 50);
                return precio;
            }else if(this.peso >= 50 && this.peso <= 79){
                precio = ((this.pBase - 20) + 80);
                return precio;
            }else if(this.peso >= 80){
                precio = ((this.pBase - 20) + 100);
                return  precio;
            }
        }
        if (this.ce == 'C'){
            if (this.peso >= 0 && this.peso <= 19){
                precio = ((this.pBase - 40) + 10);
                return precio;
            }else if(this.peso >= 20 && this.peso <= 49){
                precio = ((this.pBase - 40) + 50);
                return precio;
            }else if(this.peso >= 50 && this.peso <= 79){
                precio = ((this.pBase - 40) + 80);
                return precio;
            }else if(this.peso >= 80){
                precio = ((this.pBase - 40) + 100);
                return  precio;
            }
        }
        if(this.ce == 'D'){
            if (this.peso >= 0 && this.peso <= 19){
                precio = ((this.pBase - 50) + 10);
                return precio;
            }else if(this.peso >= 20 && this.peso <= 49){
                precio = ((this.pBase - 50) + 50);
                return precio;
            }else if(this.peso >= 50 && this.peso <= 79){
                precio = ((this.pBase - 50) + 80);
                return precio;
            }else if(this.peso >= 80){
                precio = ((this.pBase - 50) + 100);
                return  precio;
            }
        }
        if(this.ce == 'E'){
            if (this.peso >= 0 && this.peso <= 19){
                precio = ((this.pBase - 70) + 10);
                return precio;
            }else if(this.peso >= 20 && this.peso <= 49){
                precio = ((this.pBase - 70) + 50);
                return precio;
            }else if(this.peso >= 50 && this.peso <= 79){
                precio = ((this.pBase - 70) + 80);
                return precio;
            }else if(this.peso >= 80){
                precio = ((this.pBase - 70) + 100);
                return  precio;
            }
        }
        if(this.ce == 'F'){
            if (this.peso >= 0 && this.peso <= 19){
                precio = ((this.pBase - 90) + 10);
                return precio;
            }else if(this.peso >= 20 && this.peso <= 49){
                precio = ((this.pBase - 90) + 50);
                return precio;
            }else if(this.peso >= 50 && this.peso <= 79){
                precio = ((this.pBase - 90) + 80);
                return precio;
            }else if(this.peso >= 80){
                precio = ((this.pBase - 90) + 100);
                return  precio;
            }
        }
        return 0;
    }
}
