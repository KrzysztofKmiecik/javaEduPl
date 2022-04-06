package Dekorator.Adapter;

public class Main {
    public static void main(String[] args) {
        AdapterKompozycja adapterKompozycja=new AdapterKompozycja(new Adoptowana());
        System.out.println(adapterKompozycja.noweZadanie());

        AdapterDziedziczenie adapterDziedziczenie=new AdapterDziedziczenie();
        System.out.println(adapterDziedziczenie.noweZadanie());

    }
}
