package Practica.Practicum4.Opdr4B;

public class Auto {
    private String type;
    private double prijsPerDag;

    public Auto(String tp, double prPd){
        type = tp;
        prijsPerDag = prPd;
    }

    public String getType(){ return type; }

    public void setPrijsPerDag(double prPd){
        prijsPerDag = prPd;
    }
    public double getPrijsPerDag(){
        return prijsPerDag;
    }

    public String toString() {
        return type + " met prijs per dag: " + prijsPerDag;
    }
}
