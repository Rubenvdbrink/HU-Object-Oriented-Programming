package Practica.Practicum2.Opdr2B;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VoetbalclubTestPracticum3A {

    @Test //Eis: als de clubnaam null of leeg ("") is, moet de naam "FC" gebruikt worden.
    void testLegeNaam(){
        Voetbalclub v1 = new Voetbalclub();
        assertEquals("FC",v1.getNaam(), "Naam moet gelijk zijn aan FC als er geen naam wordt ingevuld");
    }

    @Test //Eis: het verwerken van de resultaten ‘w’, ‘g’ en ‘v’ levert respectievelijk 3, 1 en 0 punten op. Foutieve invoer mag het puntensaldo en totaalaantal gespeelde wedstrijden niet beïnvloeden!
        // & Eis: herhaaldelijk verwerken van deze resultaten moet zorgen voor een correcte optelling van wedstrijdaantallen en punten.
    void testPunten(){
        Voetbalclub v1 = new Voetbalclub("FC Utrecht");
        v1.verwerkResultaat('w');
        v1.verwerkResultaat('w');
        v1.verwerkResultaat('g');
        v1.verwerkResultaat('v');
        v1.verwerkResultaat('v');
        v1.verwerkResultaat('v');
        v1.verwerkResultaat('w');
        assertEquals(10,v1.aantalPunten(),"totale aantalpunten(aantalPunten()) klopt niet");
    }

    @Test //Eis: het verwerken van de resultaten ‘w’, ‘g’ en ‘v’ levert respectievelijk 3, 1 en 0 punten op, en is zichtbaar in de stringrepresentatie van de toString-methode.
    void testPuntenString(){
        Voetbalclub v1 = new Voetbalclub("FC Utrecht");
        v1.verwerkResultaat('w');
        v1.verwerkResultaat('w');
        v1.verwerkResultaat('g');
        String str1 = v1.toString();
        String str2 = "FC Utrecht 3 2 1 0 7";
        assertEquals(str2,str1, "toString van voetbalclub is niet correct");
    }

}