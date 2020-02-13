package OOAD.Les3;

import java.util.TreeMap;

public class Luchtvaartmaatschappij {
    private String naam;

    public Luchtvaartmaatschappij(String na){
        naam = na;
    }

    private TreeMap<String,Vliegtuig> vlTu;

    public void addVliegtuig(Vliegtuig vt){}

    public TreeMap<String, Vliegtuig> geefVliegtuigen(){
        return vlTu;
    }
}
