import java.util.ArrayList;

public abstract class Wydzial {
    public String nazwa;
    public String dziekan;
    private ArrayList<Student> listaStudentow;

    public ArrayList<Student> getListaStudentow() {
        return listaStudentow;
    }

    public void setListaStudentow(ArrayList<Student> listaStudentow) {
        listaStudentow = listaStudentow;
    }


    abstract void dodajStudenta();
    abstract void usunStudenta();
    abstract void pokazStudentow();


}
