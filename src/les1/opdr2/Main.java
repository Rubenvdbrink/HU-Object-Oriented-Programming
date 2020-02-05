package les1.opdr2;

public class Main {
    public static void main(String[] args) {
        Klant k1 = new Klant("Jan","Nijenoord 1", "Utrecht");
        Klant k2 = new Klant("Wim","Oudenoord 340", "Utrecht");

        System.out.println(k1.getNaam() + " " + k1.getAdres());
        System.out.println(k1.getAdres());
        System.out.println(k1.getPlaats());
        System.out.println(k1.toString());

        System.out.println(k2.getNaam());
        System.out.println(k2.getAdres());
        System.out.println(k2.getPlaats());
        System.out.println(k2.toString());
    }
}
