package Practica.Practicum6.Opdr6Av2;

import java.time.LocalDate;

public class Game {

    private String naam;
    private int releaseJaar;
    private double nieuwprijs;

    public Game(String naam, int releaseJaar, double nieuwprijs){
        this.naam = naam;
        this.releaseJaar = releaseJaar;
        this.nieuwprijs = nieuwprijs;
    }

    public double getNieuwprijs() {return nieuwprijs;}
    public void setNieuwprijs(double nieuwprijs) {this.nieuwprijs = nieuwprijs; }

    public int getReleaseJaar() {return releaseJaar;}
    public void setReleaseJaar(int releaseJaar) {this.releaseJaar = releaseJaar;}

    public String getNaam() {return naam;}
    public void setNaam(String naam) {this.naam = naam; }

    public double huidigeWaarde(){
        int jaarVerschil = LocalDate.now().getYear() - releaseJaar;
        return nieuwprijs * (Math.pow(0.7,jaarVerschil));
    }

    public boolean equals(Object andereObject){
        boolean gelijkeObjecten = false; //blijft false tenzij:

        if (andereObject instanceof Game){
            Game andereGame = (Game) andereObject;

            if (this.naam.equals(andereGame.naam) && this.releaseJaar==andereGame.releaseJaar) {
                gelijkeObjecten = true;
            }
        }
        return gelijkeObjecten;
    }


    @Override
    public String toString(){
        return String.format("%s, uitgegeven in %d; nieuwprijs: €%.2f nu voor: €%.2f", naam, releaseJaar, nieuwprijs, huidigeWaarde());
    }



}
