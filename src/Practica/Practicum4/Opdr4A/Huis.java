package Practica.Practicum4.Opdr4A;

public class Huis {
    private String adres;
    private int bouwjaar;
    private Persoon huisbaas; //associatie met Persoon

    public Huis(String adr, int bwjr){ //constructor Huis
        adres = adr;
        bouwjaar = bwjr;
    }

    public void setHuisbaas(Persoon hb){
        huisbaas = hb;
    }

    public Persoon getHuisbaas(){
        return huisbaas;
    }

    public String toString(){
        return "Huis " + adres + " is gebouwd in " + bouwjaar +
                "\nen heeft huisbaas " + getHuisbaas();
    }
}
