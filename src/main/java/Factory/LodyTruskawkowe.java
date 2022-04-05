package Factory;

public class LodyTruskawkowe implements Lody {
    String nazwa;
    double price;
    int kalorie;

    public LodyTruskawkowe(double price, int kalorie) {
        this.nazwa="Truskawkowe";
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
        return "LodyTruskawkowe{" +
                "nazwa='" + nazwa + '\'' +
                ", price=" + price +
                ", kalorie=" + kalorie +
                '}';
    }
}
