package Practica.Practicum8;

import java.util.ArrayList;

public class BedrijfsInventaris {
    private ArrayList<Goed> alleGoederen = new ArrayList<Goed>();
    private String bedrijfsnaam;
    private double budget;

    public BedrijfsInventaris(String bedrijfsnaam, double budget){
        this.bedrijfsnaam = bedrijfsnaam;
        this.budget = budget;
    }

    public void schafAan(Goed g){
        if(!alleGoederen.contains(g)){
            if(budget >= g.huidigeWaarde()){
        alleGoederen.add(g);
            }
        }
    }

    public String toString(){
        StringBuilder goederen = new StringBuilder();
        for(Goed goed : alleGoederen){
            goederen.append("\n" + goed);
        }
        return String.format("Het bedrijf %s heeft een budget van €%2f en heeft de volgende goederen: %s",bedrijfsnaam,budget,goederen);
    }
}
