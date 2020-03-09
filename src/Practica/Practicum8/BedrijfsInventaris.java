package Practica.Practicum8;

import java.util.ArrayList;

public class BedrijfsInventaris {
    private ArrayList<Goed> alleGoederen = new ArrayList<Goed>();
    private String bedrijfsnaam;
    private double budget;

    public double getBudget(){
        return budget;
    }

    public ArrayList<Goed> getAlleGoederen(){
        return alleGoederen;
    }


    public BedrijfsInventaris(String bedrijfsnaam, double budget){
        this.bedrijfsnaam = bedrijfsnaam;
        this.budget = budget;
    }

    public void schafAan(Goed g){
        if(!alleGoederen.contains(g)){
            if(budget >= g.huidigeWaarde()){
        alleGoederen.add(g);
        budget -= g.huidigeWaarde();
            }
        }
    }

    public String toString(){
        StringBuilder goederen = new StringBuilder();
        for(Goed goed : alleGoederen){
            goederen.append("\n" + goed);
        }
        int decimalen = 2;
        return String.format("Het bedrijf %s heeft een budget van €%s en heeft de volgende goederen:%s",bedrijfsnaam, Utils_From_Prac8.euroBedrag(budget,decimalen),goederen);
    }
}
