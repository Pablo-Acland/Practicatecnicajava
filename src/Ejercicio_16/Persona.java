package Ejercicio_16;

import java.util.Random;

public class Persona {

    private String nombre="";
    private int edad=0;
    private String dni;
    private char sexo = sexoDefault;
    private int peso=0;
    private double altura=0;
    final int sobrePeso = 1;
    final int Ideal = 0;
    final int Inferior = -1;
    private final static char sexoDefault = 'H';

    Persona() {
        this.dni= generarDNI();
    }

    Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.dni= generarDNI();
        this.edad = edad;
        this.sexo = sexo;

        comprobarSexo();
    }

    Persona(String nom, int edad, char sexo, int peso, double alt) {
        this.nombre = nom;
        this.dni= generarDNI();
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = alt;

        generarDNI();
        comprobarSexo();
    }

    public int calcularIMC() {
        double pesocalculo = (double) this.peso / (Math.pow(this.altura, 2));

        if (pesocalculo >= 20 && pesocalculo <= 25) {
            return this.Ideal;
        } else if (pesocalculo < 20) {
            return this.Inferior;
        } else {
            return this.sobrePeso;
        }
    }

    public boolean esMayorDeEdad(){

        if(this.edad >= 18){
            return true;
        }else{
            return false;
        }
    }

    public void comprobarSexo(){

        if (this.sexo != 'H' && this.sexo != 'M') {
            this.sexo = sexoDefault;
        }
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + this.nombre + '\'' +
                ", edad=" + this.edad +
                ", dni='" + this.dni + '\'' +
                ", sexo=" + this.sexo +
                ", peso=" + this.peso +
                ", altura=" + this.altura +
                '}';
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
