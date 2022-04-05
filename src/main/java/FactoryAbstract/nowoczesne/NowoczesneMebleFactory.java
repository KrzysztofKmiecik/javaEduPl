package FactoryAbstract.nowoczesne;

import FactoryAbstract.FabrykaMebli;
import FactoryAbstract.Komoda;
import FactoryAbstract.Lozko;
import FactoryAbstract.Szafa;

public class NowoczesneMebleFactory implements FabrykaMebli {
    @Override
    public Szafa stworzSzafe() {
        return new NowoczesnaSzafa();
    }

    @Override
    public Komoda stworzKomode() {
        return new NowoczesnaKomoda();
    }

    @Override
    public Lozko stworzLozko() {
        return new NowoczesneLozko();
    }
}
