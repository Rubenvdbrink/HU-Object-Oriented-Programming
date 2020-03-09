package Practica.Practicum8;

import java.time.LocalDate;

public class Computer implements Goed{
    private String type;
    private String macAdres;
    private double aanschafPrijs;
    private int productieJaar;

    public Computer(String type, String macAdres, double aanschafPrijs, int productieJaar){
        this.type = type;
        this.macAdres = macAdres;
        this.aanschafPrijs = aanschafPrijs;
        this.productieJaar = productieJaar;
    }


    @Override
    public double huidigeWaarde() {
        int jaarVerschil = LocalDate.now().getYear() - productieJaar;
        return aanschafPrijs * (Math.pow(0.6,jaarVerschil));
    }

    public boolean equals(Object obj){
        boolean returnwaarde = false; //blijft false tenzij equals
        if(obj instanceof Computer){
            Computer andereComputer = (Computer) obj;
            if(this.type.equals(andereComputer.type)
                    && this.macAdres.equals(andereComputer.macAdres)
                    && this.aanschafPrijs == andereComputer.aanschafPrijs
                    && this.productieJaar == andereComputer.productieJaar){
                returnwaarde = true;
            }
        }
        return returnwaarde;
    }

    public String toString(){
        int decimalen = 2; //vul hier het aantal gewenste decimalen in
        return String.format("Computer: %s uit %d met Mac-Adress %s heeft een waarde van: €%s",type,productieJaar,macAdres, Utils_From_Prac8.euroBedrag(huidigeWaarde(),decimalen));
    }
}
