package OOAD;

public class VliegtuigType {
    private String code;
    private int capiciteit;

    private static Fabrikant fabrikant;

    public int geefCapiciteit(){
        return capiciteit;
    }

    public VliegtuigType(Fabrikant fab, String cod, int cap){
        fabrikant = fab;
        code = cod;
        capiciteit = cap;
    }
}
