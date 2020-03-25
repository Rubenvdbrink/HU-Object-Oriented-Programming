package Practica.Practicum11;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

//bron directory =                         C:\\Users\\Ruben\\IdeaProjects\\V1OOP\\src\\Practica\\Practicum11\\prac11bron.txt
//bestemming directory =                   C:\\Users\\Ruben\\IdeaProjects\\V1OOP\\src\\Practica\\Practicum11\\prac11bestemming.txt
//euro waarde in dollar volgens canvas =   0,918720

public class Main {

    public static String afronden(double bedrag) {
        return String.format("%.2f", bedrag);
    }

        public static void main (String[]args){

        try{
        Scanner keyboardScan = new Scanner(System.in);
        System.out.print("Vul hier de directory van het bronbestand in: ");
        String bron = keyboardScan.nextLine();
        System.out.print("Vul hier de directory van het bestemmingsbestand in: ");
        String bestemming = keyboardScan.nextLine();
        System.out.print("Vul de waarde van 1 euro in dollar in: ");
        double euroWaarde = keyboardScan.nextDouble();

        if (!Files.exists(Path.of(bron))) {
            throw new IOException("De directory van het bron bestand bestaat niet!");
        } //gooit een IOException als de directory van bron niet bestaat.

        if (!Files.exists(Path.of(bestemming))) {
            throw new IOException("De directory van het bestemmings bestand bestaat niet!");
        } //gooit een IOException als de directory van bestemming niet bestaat.

        List<String> in = Files.readAllLines(Path.of(bron)); //lezen van bron
        BufferedWriter out = Files.newBufferedWriter(Path.of(bestemming)); //schrijven naar bestemming


        for (String regel : in) {
            String[] splittedRegel = regel.split(" : ");
            String productBeschrijving = splittedRegel[0];
            String waardeInEuro = afronden(Double.parseDouble(splittedRegel[1]) * euroWaarde);
            out.write(productBeschrijving + " : €" + waardeInEuro);
            out.newLine();
        }
        out.close();
        System.out.println("Gelukt!");
    }

        catch(IOException e){
            System.out.println(e.getMessage());
            //vangt bron & bestemming bestanden exceptions op.
        }
        catch(Exception ee){
            System.out.println("De ingevoerde waarde van 1 euro in dollar is niet correct geformuleerd!");
            //vangt euro waarde invoer exception op.
        }
    }
}

