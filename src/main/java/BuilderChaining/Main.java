package BuilderChaining;

public class Main {

    public static void main(String[] args) {
        Pizza mojeZamowienie = new Pizza.Builder("Cienkie ciasto", "Ser Gouda").mieso("salami").warzywa("kukurydza").build();


        System.out.println("Pizza 1 :" + mojeZamowienie.getCiasto()
                + " " + mojeZamowienie.getSer()
                + " " + mojeZamowienie.getWarzywa()
                + " " + mojeZamowienie.getMieso()
                + " " + mojeZamowienie.getSos());

        Pizza.Builder builder = new Pizza.Builder("Grube ciasto", "Ser mozzarella");
        builder.mieso("szynka").sos("czosnkowy");
        Pizza drugaPizza = builder.build();

        System.out.println("Pizza 2 :" + drugaPizza.getCiasto()
                + " " + mojeZamowienie.getSer()
                + " " + mojeZamowienie.getWarzywa()
                + " " + mojeZamowienie.getMieso()
                + " " + mojeZamowienie.getSos());

    }
}
