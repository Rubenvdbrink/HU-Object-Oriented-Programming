package Practica.Practicum6.Opdr6A;

import java.time.LocalDate;

public class Game {
    private String naam;
    private int releaseJaar;
    private double nieuwprijs;

    public Game(String nm, int rJ, double nwpr){
        naam = nm;
        releaseJaar = rJ;
        nieuwprijs = nwpr;
    }

    public String getNaam(){
        return naam;
    }

    public double huidigeWaarde(){
        int jaarVerschil = LocalDate.now().getYear() - releaseJaar;
        return nieuwprijs * (Math.pow(0.7,jaarVerschil));
    }

    //public boolean equals(Object andereObject){}

    public String toString(){
        return naam + ", uitgegeven in " + releaseJaar + ", nieuwprijs: €" + nieuwprijs + " nu voor: €" + huidigeWaarde();
    }
}
