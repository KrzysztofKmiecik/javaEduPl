package Factory;

public class LodyCzekoladowe implements Lody {
    String nazwa;
    double price;
    int kalorie;

    public LodyCzekoladowe(double price, int kalorie) {
        this.nazwa="Czekoladowe";
        this.price = price;
        this.kalorie = kalorie;
    }

    @Override
    public String getNazwa() {
        return nazwa;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getKalorie() {
        return kalorie;
    }
}
