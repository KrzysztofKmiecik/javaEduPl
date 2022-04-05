package FactoryAbstract;

public class Main {
    public static void main(String[] args) {
        FabrykaMebli antyczneMeble=Factory.getTypMebli(TypMebli.ANTYCZNE);
        Szafa szafaAntyczna= antyczneMeble.stworzSzafe();
        System.out.println(szafaAntyczna.getWymiar());

        FabrykaMebli nowoczesneMeble=Factory.getTypMebli(TypMebli.NOWOCZESNE);
        Komoda komodaNowoczesna= nowoczesneMeble.stworzKomode();
        System.out.println(komodaNowoczesna.getPolki());
    }
}
