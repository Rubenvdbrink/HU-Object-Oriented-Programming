package Practica.Practicum4.Opdr4B;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class AutoHuurTest {
    @Test
    void testTotaalPrijsMetKorting(){ // met korting
        AutoHuur ah1 = new AutoHuur();
        ah1.setAantalDagen(1);
        Klant k1 = new Klant("henk");
        k1.setKorting(50.0);
        Auto a1 = new Auto("Nissan SkyLine r32", 100.0);
        ah1.setGehuurdeAuto(a1);
        ah1.setHuurder(k1);

        assertEquals(50,ah1.totaalPrijs(), "de berekening met korting werkt niet goed");
    }
    @Test
    void testTotaalPrijsZonderKorting(){ // zonder korting
        AutoHuur ah2 = new AutoHuur();
        ah2.setAantalDagen(1);
        Klant k2 = new Klant("bamibal");
        k2.setKorting(0.0);
        Auto a2 = new Auto("Nissan SkyLine r32", 100.0);
        ah2.setGehuurdeAuto(a2);
        ah2.setHuurder(k2);
        assertEquals(100.0, ah2.totaalPrijs(), "de berekening zonder korting werkt niet goed");
    }

    @Test
    void testGeenHuurderEnGeenAuto(){ //geen huurder en geen auto
        AutoHuur ah3 = new AutoHuur();
        assertNull(ah3.getHuurder(), "AutoHuur functioneert niet zonder huurder");
        assertNull(ah3.getGehuurdeAuto(), "Autohuur functioneert nier zonder auto");
    }

    @Test
    void testGeenHuurderWelAuto(){ //geen huurder en wel een auto
        AutoHuur ah4 = new AutoHuur();
        Auto a4 = new Auto("Nissan Skyline r34", 200);
        ah4.setGehuurdeAuto(a4);
        assertNull(ah4.getHuurder(), "AutoHuur werkt niet zonder huurder");
        assertEquals("Nissan Skyline r34",a4.getType(), "AutoType klopt niet als er geen huurder is.");
        assertEquals(200.0,a4.getPrijsPerDag(),"prijsPerDag klopt niet als er geen huurder is.");
    }

    @Test
    void testWelHuurderGeenAuto(){ //wel huurder geen auto
        AutoHuur ah5 = new AutoHuur();
        Klant k5 = new Klant("Jan Hendriks");
        ah5.setHuurder(k5);
        assertNull(ah5.getGehuurdeAuto(), "AutoHuur werkt niet zonder gehuurdeAuto");
        assertEquals("Jan Hendriks",k5.getNaam(), "Naam klopt niet als er geen gehuurdeAuto is");
    }
}
