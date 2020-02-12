package OOAD;

import java.util.HashSet;
import java.util.TreeMap;

public class Fabrikant {
    private String naam; //attributen
    private static HashSet<Fabrikant> alleFabrikanten;

    private static TreeMap<String,VliegtuigType> VliegtuigTypen;

    public static TreeMap<String, VliegtuigType> geefAlleVliegtuigTypen(){
        return VliegtuigTypen;
    }
    private static HashSet<Fabrikant> geefAlleFabrikanten(){
        return alleFabrikanten;
    }
}
