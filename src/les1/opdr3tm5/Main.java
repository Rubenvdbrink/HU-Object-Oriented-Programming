package les1.opdr3tm5;

public class Main {
    public static void main(String[] args) {

        Student st1 = new Student("Sylvester");
        System.out.println("naam: " + st1.getNaam());
        System.out.println("Studentnummer: " + st1.getStudentNummer());
        st1.setStudentNummer(111);
        System.out.println("toString: " + st1.toString());

        Student st2 = new Student("Karel", 222);
        System.out.println("Naam: " + st2.getNaam());
        System.out.println("Studentnummer: " + st2.getStudentNummer());
        System.out.println("toString: " + st2.toString());



    }
}
