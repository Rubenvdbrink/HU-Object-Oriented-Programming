package Les3.Opdr2;

import java.util.Random;

public class BelastingTarieven {
    public void produceerBelastingTarieven() {
        try{
            for (int i = 1; i <= 10; i++) {
                int random = new Random().nextInt(5);
                double tarief = (100 / random) - 20;
                System.out.println(tarief + " %");
            }
        }
        catch (ArithmeticException ae){
            System.out.println("mislukt " + ae.getMessage());
            produceerBelastingTarieven();
        }
    }
}
