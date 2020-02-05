package Practica.Practicum1.Opdr5;

public class Main5 {
    public static void main(String[] args) {
        String saw = "s";
        for(int i=0; i<13 ; i++){
            if(saw == "s"){
                System.out.println("s");
                saw = "ss";
            }
            else{
                System.out.println("ss");
                saw = "s";
            }
        }
    }
}
