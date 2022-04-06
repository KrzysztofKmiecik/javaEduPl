package Dekorator.Adapter;

public class AdapterKompozycja implements WymaganyInterfejs{

    Adoptowana adoptowana;

    public AdapterKompozycja(Adoptowana adoptowana) {
        this.adoptowana = adoptowana;
    }

    @Override
    public String noweZadanie() {
        return adoptowana.stareZadanie()+" cos nowego przez kompozycje ";
    }
}
