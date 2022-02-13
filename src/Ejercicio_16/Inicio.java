package Ejercicio_16;

import java.util.Locale;
import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        String nom;
        int edad, peso,x;
        double alt;
        char sexo;

        System.out.println("Increse nombre");
        nom= captura.nextLine();

        System.out.println("Ingrese edad");
        edad=captura.nextInt();

        System.out.println("Ingrese peso");
        peso=captura.nextInt();

        System.out.println("Ingrese altura");
        alt=captura.nextDouble();

        System.out.println("Ingrese sexo");
        sexo = captura.next().toUpperCase(Locale.ROOT).charAt(0);

        Persona P1=new Persona(nom, edad, sexo, peso, alt);
        edad=edad+10;
        Persona P2=new Persona("Gerardo", edad, sexo);
        Persona P3=new Persona();

        peso= peso+38;
        alt= alt+0.40;
        P2.setPeso(peso);
        P2.setAltura(alt);

        peso=peso-15;
        alt=alt-0.15;
        edad=edad-18;
        P3.setNombre("Naty");
        P3.setEdad(edad);
        P3.setSexo('M');
        P3.setPeso(peso);
        P3.setAltura(alt);

        //ejecucion de los metodos para la primera persona
        System.out.println(P1.toString());
        System.out.println("\n");
        System.out.println("La primera persona tiene \n");
        x= P1.calcularIMC();
        if (x>0){
            System.out.println("Sobre peso \n");
        }else if (x==0){
            System.out.println("Peso ideal \n");
        }else{
            System.out.println("Peso inferior al ideal \n");
        }
        if (P1.esMayorDeEdad()){
            System.out.println("La Primera persona es mayor \n");
        }else {
            System.out.println("La Primera persona es menor \n");
        }

        //ejecucion de los metodos a la segunda persona
        System.out.println(P2.toString());
        System.out.println("\n");
        System.out.println("La Segunda persona tiene \n");
        x= P2.calcularIMC();
        if (x>0){
            System.out.println("Sobre peso \n");
        }else if (x==0){
            System.out.println("Peso ideal \n");
        }else{
            System.out.println("Peso inferior al ideal \n");
        }
        if (P2.esMayorDeEdad()){
            System.out.println("La Segunda persona es mayor \n");
        }else {
            System.out.println("La Segunda persona es menor \n");
        }

        //ejecucion de los metodos a la tercera persona
        System.out.println(P3.toString());
        System.out.println("\n");
        System.out.println("La Tercera persona tiene \n");
        x= P3.calcularIMC();
        if (x>0){
            System.out.println("Sobre peso \n");
        }else if (x==0){
            System.out.println("Peso ideal \n");
        }else{
            System.out.println("Peso inferior al ideal \n");
        }
        if (P3.esMayorDeEdad()){
            System.out.println("La Tercera persona es mayor \n");
        }else {
            System.out.println("La Tercera persona es menor \n");
        }

    }
}
