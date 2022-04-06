package Dekorator;

public abstract class SandwichDecorator implements Sandwich {

    protected Sandwich customSandwich;

    public SandwichDecorator(Sandwich customSandwitch) {
        this.customSandwich = customSandwitch;
    }


}
