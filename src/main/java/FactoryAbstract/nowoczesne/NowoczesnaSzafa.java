package FactoryAbstract.nowoczesne;

import FactoryAbstract.Szafa;

public class NowoczesnaSzafa implements Szafa {
    @Override
    public String getWymiar() {
        return "10x10";
    }
}
