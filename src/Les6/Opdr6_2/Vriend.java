package Les6.Opdr6_2;

public class Vriend {
    private String voornaam;
    private String achternaam;
    private String email;

    public Vriend(String vnm, String anm, String em){ //constructor
        voornaam = vnm;
        achternaam = anm;
        email = em;
    }

    //public boolean equals(Object andereObject){}

    public String toString(){
        return voornaam + " " + achternaam + ", email: " + email;
    }
}
