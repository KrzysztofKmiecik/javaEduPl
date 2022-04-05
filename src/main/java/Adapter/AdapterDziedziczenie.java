package Adapter;

public class AdapterDziedziczenie extends Adoptowana implements WymaganyInterfejs{
    @Override
    public String noweZadanie() {
        return super.stareZadanie()+" cos nowego przezz dziedziczenie";
    }
}
