package Practica.Practicum4.Opdr4B;

public class AutoHuur {
    private int aantalDagen;
    private Klant huurder; //associatie met Klant
    private Auto gehuurdeAuto; //associatie met Auto

    public AutoHuur(){} //constructor

    public void setAantalDagen(int aD){
        aantalDagen = aD;
    }
    public int getAantalDagen(){
        return aantalDagen;
    }

    public void setGehuurdeAuto(Auto gA){
        gehuurdeAuto = gA;
    }
    public Auto getGehuurdeAuto(){
        return gehuurdeAuto;
    }

    public void setHuurder(Klant k){
        huurder = k;
    }
    public Klant getHuurder(){
        return huurder;
    }

    public double totaalPrijs(){
        try {
            return aantalDagen * gehuurdeAuto.getPrijsPerDag() * (1 - huurder.getKorting() / 100); //dag * autoprijs * 1-korting
        }
        catch(NullPointerException npe){
            return 0.0;
        }
        }

    public String toString(){
        if (gehuurdeAuto == null && huurder == null){return "er is geen auto bekend" +
                "\ner is geen huurder bekend" +
                "\naantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs();}
        if (gehuurdeAuto == null){return "er is geen auto bekend"+
                "\nop de naam van: " + huurder +
                "\naantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs();}
        if (huurder == null){return "autotype: " + gehuurdeAuto +
                "\ner is geen huurder bekend" +
                "\naantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs();}
        else{
        return "autotype: " + gehuurdeAuto +
                "\nop de naam van: " + huurder +
                "\naantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs();}
    }
}
