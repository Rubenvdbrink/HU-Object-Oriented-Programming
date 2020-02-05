package les1.opdr3tm5;

public class Student {
    private String naam;
    private int studentNummer;

    public Student(String nm) //constructor
    {
        naam = nm;
    }
    public Student(String nm, int sN) //constructor
    {
        naam = nm;
        studentNummer = sN;
    }

    public String getNaam(){  //Getters
        return naam;
    }

    public int getStudentNummer(){
        return studentNummer;
    }

    public void setStudentNummer(int nwSN){  //Setter
        studentNummer = nwSN;
    }

    public String toString(){  //toString
        String s = naam + " heeft studentnummer: " + studentNummer;
        return s;
    }
}
