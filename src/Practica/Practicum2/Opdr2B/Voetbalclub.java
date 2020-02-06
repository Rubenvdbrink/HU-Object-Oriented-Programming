package Practica.Practicum2.Opdr2B;

public class Voetbalclub {
    private String naam;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;

    public Voetbalclub (String nm){naam = nm;} //constructor

    public void verwerkResultaat(char ch){     //resultaat verwerken
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }

    public int aantalGespeeld(){return aantalGelijk + aantalGewonnen + aantalVerloren;} //totaal wedstrijden
    public int aantalPunten(){return aantalGewonnen*3+aantalGelijk;} // totaal punten

    public String toString(){
        return naam + " " + aantalGespeeld() + " " +  aantalGewonnen + " " +  aantalGelijk + " " +  aantalVerloren + " " +  aantalPunten();
    }
}
