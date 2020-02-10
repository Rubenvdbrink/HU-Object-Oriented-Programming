package Practica.Practicum3;

public class Cirkel {
    private int radius;
    private int xPositie;
    private int yPositie;

    public Cirkel(int rad, int x, int y){
        if (rad <= 0){
            throw new IllegalArgumentException("Radius moet groter dan 0 zijn!");
        }
        radius = rad;
        xPositie = x;
        yPositie = y;
    }

    public String toString(){
        return "Cirkel " + "("+xPositie +","+yPositie+") met radius: " + radius;
    }
}
