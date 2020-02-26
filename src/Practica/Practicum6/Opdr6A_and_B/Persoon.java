package Practica.Practicum6.Opdr6A_and_B;

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
//
//Practicum 6B Opdr1
//    \/
    public Game zoekGameOpNaam(String naam){
        Game returnWaarde = null; //veranderd als game is gevonden
        for(int i = 0 ; i < mijnGames.size() ; i++){
            if(mijnGames.get(i).getNaam().equals(naam)){returnWaarde = mijnGames.get(i);}
        }
        System.out.println("##Practicum 6B Opdr1:##");
        return returnWaarde;
    }
//
//Practicum 6B Opdr2
//    \/
    public ArrayList<Game> bepaalGamesNietInBezit(ArrayList<Game> gameLijst){
        ArrayList<Game> gameReturnLijst = new ArrayList<Game>();
        for(int i = 0 ; i < mijnGames.size() ; i++){
            for(int in = 0 ; in < gameLijst.size() ; in++){
                if(!mijnGames.get(i).getNaam().equals(gameLijst.get(in).getNaam())){
                    gameReturnLijst.add(gameLijst.get(in));}
            }
        }
        System.out.println("##Practicum 6B Opdr2:##");
        return gameReturnLijst;
    }

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
