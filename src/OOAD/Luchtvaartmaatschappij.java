package OOAD;

public class Luchtvaartmaatschappij {
    private String naam;

    public Luchtvaartmaatschappij(String na){
        naam = na;
    }

    private static Vliegtuig vlTu;

    public void addVliegtuig(Vliegtuig vt){}

    public Vliegtuig geefVliegtuigen(){
        return vlTu;
    }
}
