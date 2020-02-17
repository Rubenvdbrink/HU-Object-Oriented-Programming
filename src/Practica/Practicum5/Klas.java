package Practica.Practicum5;

import java.util.ArrayList;

public class Klas {
    private String klasCode;
    private ArrayList<Leerling> deLeerlingen = new ArrayList<>(); //associatie met Leerling

    public Klas(String kC){ //constructor
        klasCode = kC;
    }

    public String getKlasCode() {return klasCode;}
    public void setKlasCode(String kC) {klasCode = kC;}

    public ArrayList<Leerling> getLeerlingen(){return deLeerlingen;}

    public void voegLeerlingToe(Leerling l){ //voegt Leerling l toe aan ArrayList
        deLeerlingen.add(l);
    }

    public void wijzigCijfer(String nm, double nweCijfer){ // WIP
        for (int i = 0; i < deLeerlingen.size(); i++) {
            String leerlingWijzigCijer = String.valueOf(deLeerlingen.get(i));
            if(leerlingWijzigCijer.contains(nm)){
                Leerling leerlingMetNieuwCijfer = new Leerling(nm);
                deLeerlingen.set(i,leerlingMetNieuwCijfer);
                leerlingMetNieuwCijfer.setCijfer(nweCijfer);
            }
        }
    }

    public int aantalLeerlingen(){ //telt aantal in ArrayList
        return deLeerlingen.size();
    }

    public String toString(){
        String losseLeerlingen = "";
        for(int i=0; i < deLeerlingen.size(); i++){
            losseLeerlingen += deLeerlingen.get(i) + "\n";
        }
        return "In klas " + klasCode + " zitten de volgende leerlingen:\n" + losseLeerlingen;
    }

}
