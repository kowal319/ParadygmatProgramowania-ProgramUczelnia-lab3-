import java.util.ArrayList;
import java.util.Scanner;

public class Informatyka extends Wydzial {

    Scanner input = new Scanner(System.in);


    public Informatyka() {
        this.nazwa = nazwa;
        this.dziekan = dziekan;
    }


        @Override
        void dodajStudenta() {
            System.out.println("Imie: ");
            String imię = input.nextLine();
            System.out.println("Nazwisko:");
            String nazwisko = input.nextLine();
            System.out.println("Adres");
            String adres = input.nextLine();
            System.out.println("Numer Albumu:");
            int numerAlbumu = input.nextInt();
            getListaStudentow().add(new Student(imię, nazwisko, adres, numerAlbumu));
        }


        @Override
        void usunStudenta() {
            System.out.println("Podaj numer studenta ktory usunac: ");
            int i = input.nextInt();
            i = -1;
            this.getListaStudentow().remove(i);
            System.out.println("---  ---  ---  ---  ---");
        }

        @Override
        void pokazStudentow() {
            System.out.println("---  ---  ---  ---  ---");
            for (int i = 0; i < getListaStudentow().size(); ++i) {
                System.out.println("Numer Listy: " + (i + 1));
                System.out.println(" ");
                ((Student) getListaStudentow().get(i)).wyswietlInfo();
                System.out.println("---  ---  ---  ---  ---");
            }
        }
    }


