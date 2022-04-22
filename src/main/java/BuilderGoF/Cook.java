package BuilderGoF;

public class Cook {
    private PizzaBuilder pizzaBuilder;

    public Cook(PizzaBuilder pizzaBuilder){
        this.pizzaBuilder=pizzaBuilder;
    }


    public void buildPizza(){
        pizzaBuilder.dodajCiasto();
        pizzaBuilder.dodajSer();
        pizzaBuilder.dodajMieso();
        pizzaBuilder.dodajWarzywa();
        pizzaBuilder.dodajOwoce();
        pizzaBuilder.dodajSos();
        pizzaBuilder.dodajDodatki();
    }
    public Pizza getPizza(){
        return pizzaBuilder.getPizza();
    }
}
