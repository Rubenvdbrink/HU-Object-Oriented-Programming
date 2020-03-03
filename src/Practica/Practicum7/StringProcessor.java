package Practica.Practicum7;

import java.util.ArrayList;

public class StringProcessor{
    private ArrayList<OpmaakProces> processen = new ArrayList<OpmaakProces>();

    public StringProcessor(){}

    public void voegProcesToe(OpmaakProces proces){
        processen.add(proces);
    }

    public String verwerk(String input){
       for(OpmaakProces func : processen){
            input = func.maakOp(input);
       }
       return input;
    }
}
