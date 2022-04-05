package Bridge;

public class Square extends Shape{
    public Square(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.println("kwadrat wypelniony kolorem");
        color.setColor();
    }
}
