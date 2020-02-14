package Practica.Practicum5;

public class Leerling {
    private String naam;
    private double cijfer;

    public Leerling(String nm){ //constructor
        naam = nm;
    }

    public String getNaam(){return naam;}
    public void setNaam(String na){naam = na;}

    public double getCijfer(){return cijfer;}
    public void setCijfer(double c){cijfer = c;}

    public String toString(){
        return naam + " heeft cijfer: " + cijfer;
    }

}
