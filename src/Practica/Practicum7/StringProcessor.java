package Practica.Practicum7;

import java.util.ArrayList;

public class StringProcessor{
    private ArrayList<OpmaakProces> processen = new ArrayList<OpmaakProces>();

    public StringProcessor(){}

    public void voegProcesToe(OpmaakProces proces){
        processen.add(proces);
    }

    public String verwerk(String input){
       for(int i = 0; i < processen.size(); i++){
            input = processen.get(i).maakOp(input);
       }
       return input;
    }
}
