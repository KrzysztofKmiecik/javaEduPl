package BuilderGoF;

public class Main {
    public static void main(String[] args) {
        PizzaBuilder hawaiiPizzaBuilder = new HawaiiPizzaBuilder();
        Cook cook = new Cook(hawaiiPizzaBuilder);
        cook.buildPizza();
        Pizza hawaii = cook.getPizza();
        System.out.println(hawaii.getDodatki());
    }
}
