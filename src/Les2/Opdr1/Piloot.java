package Les2.Opdr1;

public class Piloot {
    private String naam;
    private double salaris;
    private int vlieguren;

    public Piloot(String nm){ //constructor
        naam = nm;
    } //constructor
    public void setSalaris(double sal){ // set salaris naar double
        salaris = sal;
    }
    public void verhoogVliegurenMet(int vlU){ //verhoog vlieguren met int
        vlieguren = vlU;
    }
    public int getVlieguren(){ //get vlieguren
        return vlieguren;
    }
    public double getSalaris(){ //get salaris
        return salaris;
    }
    public String toString(){
        return naam + " heeft " + vlieguren + " vlieguren en verdient " + salaris;
    }
}
