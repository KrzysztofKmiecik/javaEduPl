package Factory;

public class LodyWaniliowe implements Lody {
    String nazwa;
    double price;
    int kalorie;

    public LodyWaniliowe(double price, int kalorie) {
        this.nazwa="Waniliowe";
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

    @Override
    public String toString() {
        return "LodyWaniliowe{" +
                "nazwa='" + nazwa + '\'' +
                ", price=" + price +
                ", kalorie=" + kalorie +
                '}';
    }
}
