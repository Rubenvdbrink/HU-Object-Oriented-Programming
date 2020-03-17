package Practica.Practicum9;

public class Utils {
    public static void main(String[] args) {
        System.out.println(Utils.euroBedrag(3.11614));
        System.out.println(Utils.euroBedrag(3.11314, 4));
        System.out.println(getBijhouden());
    }

    private static int bijhouden = 0;

    public static String euroBedrag(double bedrag) {
        return euroBedrag(bedrag, 2);

    }
    public static String euroBedrag(double bedrag, int precisie) {
        bijhouden ++;
        return String.format("%."+precisie+"f", bedrag);
    }

    public static int getBijhouden() {
        return bijhouden;
    }
}
