package Factory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //statycznej metody nie nadpisze
        FactoryLody factoryLody1 = new FactoryLody();
        FactoryLody factoryLody2 = new FactoryLody2();

        Lody truskawkowe = factoryLody1.getLody(LodyTyp.TRUSKAWKOWE);
        Lody czekoladowe = factoryLody1.getLody(LodyTyp.CZEKOLADOWE);
        Lody waniliowe = factoryLody2.getLody(LodyTyp.CZEKOLADOWE);

        System.out.println(truskawkowe.getNazwa());
        System.out.println(czekoladowe.getNazwa());
        System.out.println(waniliowe.getNazwa());


        List<FactoryLody> factoryLodyList = new ArrayList<>();
        factoryLodyList.add(factoryLody1);
        factoryLodyList.add(factoryLody2);

//chce wyprodukowac waniliowe z dwoch fabryk
        List<Lody> lodyList = factoryLodyList.stream()
                .map(factoryLody -> factoryLody.getLody(LodyTyp.WANILIOWE))
                .collect(Collectors.toList());

        lodyList.forEach(System.out::println);

    }
}
