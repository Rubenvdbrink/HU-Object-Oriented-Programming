package Practica.Practicum6.Opdr6A;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Persoon {
    private String naam;
    private double budget;
    private ArrayList<Game> mijnGames = new ArrayList<Game>();

    public Persoon(String nm, double bud){
        naam = nm;
        budget = bud;
    }

    public double getBudget(){return budget;}

    public boolean koop(Game g){
        for(int i = 0; i < mijnGames.size() ; i++ ){
            String selectedGame = mijnGames.get(i).getNaam();
            if (selectedGame.equals(g.getNaam())){return false;}
        }
        if (g.huidigeWaarde() <= budget){mijnGames.add(g);
        budget -= g.huidigeWaarde();
        return true;}
        return false;
    }

    public boolean verkoop(Game g, Persoon koper){
        for(int i = 0; i < mijnGames.size() ; i++ ){
            if(mijnGames.get(i).equals(g)){
                Game verkoopGame = mijnGames.get(i);
            if(koper.budget >= verkoopGame.huidigeWaarde()){
                koper.mijnGames.add(g);
                budget += verkoopGame.huidigeWaarde();
                koper.budget -= verkoopGame.huidigeWaarde();
                return true;}
            }
        }
        return false;
    }

    public static double round(double value, int places) { //round functie van internet geplukt
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public String toString(){
        return naam + " heeft een budget van €" + round(budget,2) + " en bezit de volgende games:"
                + mijnGames;
    }
}
