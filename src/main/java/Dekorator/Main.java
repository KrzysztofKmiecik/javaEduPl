package Dekorator;

public class Main {
    public static void main(String[] args) {
        Sandwich sandwich = new MeatDecorator(new CheeseDecorator(new SimpleSandwich()));
        System.out.println(sandwich.make());
    }
}
