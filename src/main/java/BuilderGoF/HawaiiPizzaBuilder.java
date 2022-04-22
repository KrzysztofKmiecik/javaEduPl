package BuilderGoF;

public class HawaiiPizzaBuilder extends PizzaBuilder {
    @Override
    public void dodajCiasto() {
        getPizza().setCiasto("Cienkie");
    }

    @Override
    public void dodajSer() {
        getPizza().setSer("Emantaler");
    }

    @Override
    public void dodajMieso() {
        getPizza().setMieso("Szynka");
    }

    @Override
    public void dodajWarzywa() {

    }

    @Override
    public void dodajOwoce() {
        getPizza().setOwoce("Ananas");
    }

    @Override
    public void dodajSos() {
        getPizza().setSos("przecier pomidorowy");
    }

    @Override
    public void dodajDodatki() {
        getPizza().setDodatki("Bazylia i oregano");
    }
}
