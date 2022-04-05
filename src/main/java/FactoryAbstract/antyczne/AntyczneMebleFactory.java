package FactoryAbstract.antyczne;

import FactoryAbstract.FabrykaMebli;
import FactoryAbstract.Komoda;
import FactoryAbstract.Lozko;
import FactoryAbstract.Szafa;

public class AntyczneMebleFactory implements FabrykaMebli {


    @Override
    public Szafa stworzSzafe() {
        return new AntycznaSzafa();
    }

    @Override
    public Komoda stworzKomode() {
        return new AntycznaKomoda();
    }

    @Override
    public Lozko stworzLozko() {
        return new AntyczneLozko();
    }
}
