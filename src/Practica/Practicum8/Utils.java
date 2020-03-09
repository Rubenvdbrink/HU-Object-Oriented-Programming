package Practica.Practicum8;

public class Utils {
//    public static void main(String[] args) {
//        System.out.println(Utils.euroBedrag(3.11314));
//        System.out.println(Utils.euroBedrag(3.11314, 1));
//        System.out.println(getBijhouden());
//    }

    private static int bijhouden = 0;

    public static String euroBedrag(double bedrag) {
        bijhouden ++;
        return String.format("%.2f", bedrag);

    }
    public static String euroBedrag(double bedrag, int precisie) {
        bijhouden ++;
        return String.format("%."+precisie+"f", bedrag);
    }

    public static int getBijhouden() {
        return bijhouden;
    }
}
