package pl.kmiecik4;

public class Main {
    public static void main(String[] args) {

       int liczbaA = 10;

        Liczba lambda = a -> {
            int liczbaB = 10;
            liczbaB = liczbaA + a;

            return liczbaB;

        };
//        liczbaA = 2; zmienna uzyta w lambda staje się final

    }
}
