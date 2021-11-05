public class LepszyStudent extends Student{

    public double sredniaOcen = 0.0;

    public LepszyStudent(String imie, String nazwisko, String Adres, int numerAlbumu){
        super(imie, nazwisko, Adres, numerAlbumu);

    }

  public  void obliczSrednia(double[] tab1){
        double suma = 0.0;
        for (int i = 0; i < tab1.length; i++)
        suma += tab1[i];
        sredniaOcen = suma / tab1.length;
       sredniaOcen =  Math.round(sredniaOcen * 2) / 2.0;
      System.out.println(sredniaOcen);
    }
}
