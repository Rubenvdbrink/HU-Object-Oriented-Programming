package Practica.Practicum8;

import java.time.LocalDate;

public class Auto extends Voertuig{
    private String kenteken;

    public Auto(String type, double nieuwprijs, int bouwjaar, String kenteken){
        super(type,nieuwprijs,bouwjaar);
        this.kenteken = kenteken;
    }

    @Override
    public double huidigeWaarde() {
        int jaarVerschil = LocalDate.now().getYear() - bouwjaar;
        return nieuwprijs * (Math.pow(0.7,jaarVerschil));
    }

    @Override
    public boolean equals(Object obj){
        boolean returnWaarde = false; //blijft false tenzij objects equal
        if(obj instanceof Auto){
            Auto andereAuto = (Auto) obj;
            if(super.equals(obj) && this.kenteken.equals(andereAuto.kenteken)){
                returnWaarde = true;
            }
        }
        return returnWaarde;
    }

//    @Override
//    public String toString(){
//        return "fiets: " + super.toString();
//    }
}