package Les4.Opdr4_1;

public class Huisdier {
    private String naam;
    private String ras;
    private double gewicht;
    private Eigenaar baasje; //associate naar Eigenaar

    public Huisdier(String nm, String r) { //constructor Huisdier
        naam = nm;
        ras = r;
        gewicht = 0.0;
    }

    public Eigenaar getBaasje() { //getBaasje
        return baasje;
    }

    public void setBaasje(Eigenaar ba) { //setBaasje
        baasje = ba;
    }

    public String getNaam() {
        return naam;
    }

    public String getRas() {
        return ras;
    }

    public String toString() {
        return naam + ", de " + ras + ", weegt " + gewicht + " kg.";
    }
}
