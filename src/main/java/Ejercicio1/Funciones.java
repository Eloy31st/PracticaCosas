package Ejercicio1;

public class Funciones {
    private int x,y;
    private double resultado = 1;

    public Funciones (int x, int y){
        this.x = x;
        this.y = y;
    }

    public Funciones() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double calculoSucesivo(){
        if(y != 0){
            resultado = resultado * x;
            y--;
            calculoSucesivo();
        }
        return resultado;
    }
}
