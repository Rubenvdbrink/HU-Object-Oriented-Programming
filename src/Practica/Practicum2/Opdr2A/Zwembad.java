package Practica.Practicum2.Opdr2A;

public class Zwembad {
    private double breedte;
    private double lengte;
    private double diepte;
    private double inhoud;

    public Zwembad(double Br, double Le, double Di){ //constructor 1
        breedte = Br;
        lengte = Le;
        diepte = Di;
    }
    public Zwembad(){} //constructor 2

    public double inhoud(){return lengte*breedte*diepte;} //inhoud

    public double getBreedte(){return breedte;} //getbreedte
    public double getLengte(){return lengte;} //getlengte
    public double getDiepte(){return diepte;} //getdiepte

    public void setBreedte(double nwBr){breedte = nwBr;} //setbreedte
    public void setLengte(double nwLe){lengte = nwLe;} //setlengte
    public void setDiepte(double nwDi){diepte = nwDi;} //setdiepte

    public String toString(){return "Dit zwembad is " + breedte + " meter breed, " + lengte + " meter lang, en " + diepte + " meter diep";}
}
