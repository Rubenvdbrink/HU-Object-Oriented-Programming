package OOAD;

public class VliegtuigType {
    private String code;
    private int capiciteit;

    public int geefCapiciteit(){
        return capiciteit;
    }

    private static Fabrikant fabrikant;

    public VliegtuigType(Fabrikant fab, String cod, int cap){
        fabrikant = fab;
        code = cod;
        capiciteit = cap;
    }
}
