package Practica.Practicum7;

public class NieuweRegelProces implements OpmaakProces {

    public NieuweRegelProces(){}

    @Override
    public String maakOp(String input) {
        return input.replace(". ",".\n"); //Er wordt alleen een nieuwe regel gemaakt als er ook een
                                                             //spatie achter de punt staat.
    }
}
