package Factory;

public class FactoryLody2 extends FactoryLody {

    @Override
    public Lody getLody(LodyTyp nazwa) {
        switch (nazwa) {
            case WANILIOWE:
                return new LodyWaniliowe(12.99, 500);
            default:
                return super.getLody(nazwa);
        }

    }


}

