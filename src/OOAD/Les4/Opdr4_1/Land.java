package OOAD.Les4.Opdr4_1;

import java.util.ArrayList;

public class Land {
    private String naam;
    private int code;
    private static ArrayList<Land> alleLanden = new ArrayList<Land>();
    private ArrayList<Luchthaven> luchthavens = new ArrayList<Luchthaven>();

    public static ArrayList<String> getAlleLanden(){
        ArrayList<String> alAlleLanden = new ArrayList<String>();

        for (int i = 0; i <alleLanden.size(); i++){
            Land land = alleLanden.get(i);
            String landnaam = alleLanden.get(i).geefNaam();
            alAlleLanden.add(landnaam);
        }
        return alAlleLanden;
    }
    public String geefNaam(){
        return this.naam;
    }
}