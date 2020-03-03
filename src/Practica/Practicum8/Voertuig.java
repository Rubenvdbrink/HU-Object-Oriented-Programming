package Practica.Practicum8;

public abstract class Voertuig implements Goed {
    private String type;
    protected double nieuwprijs;
    protected int bouwjaar;

    public Voertuig(String type, double nieuwprijs, int bouwjaar){
        this.type = type;
        this.nieuwprijs = nieuwprijs;
        this.bouwjaar = bouwjaar;
    }
    public boolean equals(Object obj){
        boolean returnWaarde = false; //blijft false tenzij objecten zijn equal

        if(obj instanceof Voertuig){
            Voertuig andereVoertuig = (Voertuig) obj;

            if(this.type.equals(andereVoertuig.type)
                    && this.nieuwprijs==andereVoertuig.nieuwprijs
                    && this.bouwjaar == andereVoertuig.bouwjaar){returnWaarde = true;}
        }
        return returnWaarde;
    }

    public String toString(){
        return type + " kost nieuw: €" + nieuwprijs + " en is gebouwd in: " + bouwjaar;
    }
}
