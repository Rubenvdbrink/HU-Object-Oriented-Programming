package Practica.Practicum8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BedrijfsInventarisTest {
    //Controleer in de uitvoer (of schrijf een unittest) of...:

    @Test
    //1.telkens maar één van de twee dezelfde objecten is aangeschaft.
    public void eenAanschaffingMetTweeObjectenTest(){
        Computer c1 = new Computer("Dell Inspiron", "1A-0F-9C-7F-5E-FE", 500, 2014);
        Computer c2 = new Computer("Dell Inspiron", "1A-0F-9C-7F-5E-FE", 500, 2014);

        BedrijfsInventaris bi1 = new BedrijfsInventaris("Ruben inc.", 100000);
        bi1.schafAan(c1);
        bi1.schafAan(c2);
        BedrijfsInventaris bi2 = new BedrijfsInventaris("Ruben inc. 2", 100000);
        bi2.schafAan(c1);
        assertEquals(bi1.getAlleGoederen(),bi2.getAlleGoederen(), "Er is er niet maar 1 aangeschaft");
    }

    @Test
    //2.het aanschaffen mislukt als er onvoldoende budget is.
    public void aanschaffenMetOnvoldoendeBudgetTest(){
        BedrijfsInventaris bi1 = new BedrijfsInventaris("DitBedrijfGaatFalliet", 150);
        Computer c1 = new Computer("SuperComputer", "1A-0F-9C-7F-5E-FE", 20000, 2020);
        bi1.schafAan(c1);
        BedrijfsInventaris bi2 = new BedrijfsInventaris("BedrijfZonderSpullen", 150); // bedrijf zonder goederen
        assertEquals(bi1.getAlleGoederen(), bi2.getAlleGoederen(), "Het product is alsnog aangeschaft terwijl het budget te laag is");
    }

    @Test
    //3_1.het berekenen van de huidige waarde correct gebeurt. COMPUTER
    public void huidigeWaardeComputerTest(){
        Computer c1 = new Computer("SuperComputer", "1A-0F-9C-7F-5E-FE", 20000, 2019);
        assertEquals(Math.round(c1.huidigeWaarde()),12000,"Computer Huidige waarde wordt niet goed berekent");
    }

    @Test
    //3_2.het berekenen van de huidige waarde correct gebeurt. AUTO
    public void huidigeWaardeAutoTest(){
        Auto a1 = new Auto("Peugot 207sw", 15000, 2018, "69-HUT-5");
        assertEquals(Math.round(a1.huidigeWaarde()),7350,"Huidige waarde van Auto wordt niet goed berekent.");
    }

    @Test
    //3_3.het berekenen van de huidige waarde correct gebeurt. FIETS
    public void huidigeWaardeFietsTest(){
        Fiets f1 = new Fiets("Racefiets", 250, 2018, 100050);
        assertEquals(Math.round(f1.huidigeWaarde()),203,"Huidige waarde van Fiets wordt niet goed berekent.");
    }

}