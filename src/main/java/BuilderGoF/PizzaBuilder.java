package BuilderGoF;

public abstract class PizzaBuilder {
private Pizza pizza=null;

    public PizzaBuilder() {
        pizza=new Pizza();
    }

    public Pizza getPizza(){
        return pizza;
    }

    public abstract void dodajCiasto();
    public abstract void dodajSer();
    public abstract void dodajMieso();
    public abstract void dodajWarzywa();
    public abstract void dodajOwoce();
    public abstract void dodajSos();
    public abstract void dodajDodatki();

}
