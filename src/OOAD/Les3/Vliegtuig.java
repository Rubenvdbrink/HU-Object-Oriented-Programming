package OOAD.Les3;

import java.util.Calendar;

public class Vliegtuig {
    private String naam;
    private Calendar datumInGebruik;

    private static Luchtvaartmaatschappij lvm;
    private static VliegtuigType vlTy;

    public Vliegtuig(Luchtvaartmaatschappij luvama){
        lvm = luvama;
    }
    private void zetVliegtuigType (VliegtuigType type){
        vlTy = type;
    }
    private Calendar geefDatumInGebruik(){
        return datumInGebruik;
    }
    public void bewaar(){}
}
