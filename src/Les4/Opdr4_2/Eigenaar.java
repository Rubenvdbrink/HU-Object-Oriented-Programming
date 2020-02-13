package Les4.Opdr4_2;

public class Eigenaar {
    private String naam;
    private int giroNr;
    private Huisdier beestje; //associatie met Huisdier

    public Eigenaar(String nm) {
        naam = nm;
    }

    public void setGiroNr(int nr) {
        giroNr = nr;
    }

    public int getGiroNr() {
        return giroNr;
    }

    public Huisdier getBeestje() {
        return beestje;
    }

    public void setBeestje(Huisdier beestje) {
        this.beestje = beestje;
    }

    public String getNaam() {
        return naam;
    }

    public String toString() {
        return naam + " heeft giro " + giroNr + ". En is het baasje van " + beestje;
    }
}
