package Practica.Practicum8;

public class Main {
    public static void main(String[] args) {
        BedrijfsInventaris bi1 = new BedrijfsInventaris("Ruben inc.", 100000);
        Computer c1 = new Computer("Dell Inspiron", "1A-0F-9C-7F-5E-FE", 500, 2014);
        Computer c1_2 = new Computer("Dell Inspiron", "1A-0F-9C-7F-5E-FE", 500, 2014);
        Computer c2 = new Computer("Custom built", "F8-33-BA-58-24-14", 2500, 2017);
        Auto a1 = new Auto("Peugot 207sw", 15000, 2017, "69-HUT-5");
        Auto a1_2 = new Auto("Peugot 207sw", 15000, 2017, "69-HUT-5");
        Auto a2 = new Auto("Toyota Supra", 50000, 2016, "42-BLA-0");
        Fiets f1 = new Fiets("Racefiets", 250, 2018, 100050);
        Fiets f1_2 = new Fiets("Racefiets", 250, 2018, 100050);
        Fiets f2 = new Fiets("Mountainbike", 300, 2015, 200010);

        bi1.schafAan(c1);
        bi1.schafAan(c1_2);
        bi1.schafAan(c2);
        bi1.schafAan(a1);
        bi1.schafAan(a1_2);
        bi1.schafAan(a2);
        bi1.schafAan(f1);
        bi1.schafAan(f1_2);
        bi1.schafAan(f2);

        System.out.println(bi1);
    }
}
