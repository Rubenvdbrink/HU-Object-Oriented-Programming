package Practica.Practicum8;

import java.time.LocalDate;

public class Fiets extends Voertuig {

    private int framenummer;

    public Fiets(String type, double nieuwprijs, int bouwjaar, int framenummer) {
        super(type, nieuwprijs, bouwjaar);
        this.framenummer = framenummer;
    }


    @Override
    public double huidigeWaarde() {
        int jaarVerschil = LocalDate.now().getYear() - bouwjaar;
        return nieuwprijs * (Math.pow(0.9, jaarVerschil));
    }

    @Override
    public boolean equals(Object obj) {
        boolean returnwaarde = false; //blijft false tenzij equals
        if (obj instanceof Fiets) {
            Fiets andereFiets = (Fiets) obj;
            if (super.equals(obj) && this.framenummer == andereFiets.framenummer) {
            returnwaarde = true;
            }
        }
        return returnwaarde;
    }

//    @Override
//    public String toString(){
//        return "auto: " + super.toString();
//    }
}
