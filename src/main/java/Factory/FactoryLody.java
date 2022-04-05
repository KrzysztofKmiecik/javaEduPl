package Factory;

public class FactoryLody {

    public enum LodyTyp {
        TRUSKAWKOWE, CZEKOLADOWE
    }

    public static Lody getLody(LodyTyp nazwa) {

        switch (nazwa) {
            case TRUSKAWKOWE:
                return new LodyTruskawkowe(4.99, 700);
            case CZEKOLADOWE:
                return new LodyCzekoladowe(3.99, 900);

            default:
                return null;
        }
    }
}
