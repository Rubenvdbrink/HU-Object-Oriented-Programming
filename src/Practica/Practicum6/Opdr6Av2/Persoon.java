package Practica.Practicum6.Opdr6Av2;

import java.util.ArrayList;

public class Persoon {

    private String naam;
    private double budget;
    private ArrayList<Game> mijnGames = new ArrayList<Game>();

    public Persoon(String naam, double budget){
        this.naam = naam;
        this.budget = budget;
    }

    public String getNaam() {return naam;}
    public void setNaam(String naam) {this.naam = naam;}

    public double getBudget() {return budget;}
    public void setBudget(double budget) {this.budget = budget;}

    public boolean koop(Game g){
        boolean kanKopen = false; //blijft false tenzij:

        if (g.huidigeWaarde() <= budget){
            if(!mijnGames.contains(g)){ //if (mijnGames.contains(g) == false)
                mijnGames.add(g); //game toevoegen aan koper
                budget -= g.huidigeWaarde(); //budget omlaag omdat game gekocht
                kanKopen = true;
            }
        }
        return kanKopen;
    }

    public boolean verkoop(Game g, Persoon koper){
        boolean kanVerkopen = false; //blijft false tenzij:

        if(mijnGames.contains(g)){
            if(koper.budget >= g.huidigeWaarde()){
                if(!koper.mijnGames.contains(g)){ //if (koper.mijngames.contains(g) == false)
                    koper.mijnGames.add(g); //game toevoegen aan koper
                    mijnGames.remove(g); //game verwijderen van verkoper
                    koper.budget -= g.huidigeWaarde(); //budget van koper omlaag omdat game gekocht
                    budget += g.huidigeWaarde(); //budget van verkoper omhoog omdat game verkocht
                    kanVerkopen = true;
                }
            }
        }
        return kanVerkopen;
    }

    @Override
    public String toString(){
        String games = String.format("%s heeft een budget van €%.2f en bezit de volgende games:", naam, budget);
        for(int i = 0; i < mijnGames.size(); i++){
            games += ("\n" + mijnGames.get(i));
        }
        return games;
    }
}
