package Factory;

public class Main {
    public static void main(String[] args) {
        Lody truskawkowe = FactoryLody.getLody(FactoryLody.LodyTyp.CZEKOLADOWE);
        System.out.println(truskawkowe.getNazwa());

    }
}
