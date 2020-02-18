package Les6.Opdr6_2;

import java.util.ArrayList;

public class FacebookAccount {
    private String naam;
    private ArrayList<Vriend> mijnVrienden = new ArrayList<Vriend>(); //verbinding met Vriend

    public FacebookAccount(String nm){
        naam = nm;
    }

    public String getNaam(){
        return naam;
    }

    public void voegVriendToe(Vriend nwV){
        mijnVrienden.add(nwV);
    }

    public boolean verwijderVriend(Vriend exV){
        int index = mijnVrienden.indexOf(exV);
        for(int i=0; i < mijnVrienden.size(); i++){
            if(mijnVrienden.get(i).equals(exV)){mijnVrienden.remove(i);
            return false;}
            else{return true;}}

        return false;
    }

    public boolean isVriendMet(Vriend v){
        int index = mijnVrienden.indexOf(v);
        for(int i = 0; i< mijnVrienden.size(); i++){
            if(mijnVrienden.get(i).equals(v)){
                return true;
            }
        }
        return false;
    }

    public int aantalVrienden(){
        System.out.println("aantal vrienden: "+mijnVrienden.size());
        return mijnVrienden.size();
    }

    public String toString(){
        return naam + " heeft 2 vrienden:\n" + mijnVrienden;
    }
}
