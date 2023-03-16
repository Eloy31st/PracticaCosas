package Ejercicio1;

import java.util.Scanner;

public class Menu {
    private Funciones funcion;

    public Menu(){
        funcion = new Funciones();
    }

    public void mostrar(){
        System.out.println(funcion.calculoSucesivo());
    }

    public void recogerDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce valor x");
        int x = sc.nextInt();
        System.out.println("Introduce valor y al que está elevado");
        int y = sc.nextInt();
        funcion.setX(x);
        funcion.setY(y);
    }
    public void ejercicio1(){
        recogerDatos();
        mostrar();
    }
}
