public class Student {
    private String imie;
    private String nazwisko;
    private String adres;
    private int numerAlbumu;
    private double sredniaOcen = 0;

    public Student(String imie, String nazwisko, String adres, int numerAlbumu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.numerAlbumu = numerAlbumu;
    }

    public void obliczSrednia(double[] tab){
        double suma = 0.0;
        for (int i = 0; i < tab.length; i++)
            suma += tab[i];
        sredniaOcen = suma / tab.length;
        System.out.println(sredniaOcen);
    }
    public void wyswietlInfo(){
        System.out.println(imie);
        System.out.println(nazwisko);
        System.out.println(adres);
        System.out.println(numerAlbumu);
        System.out.println(sredniaOcen);
    }
}
