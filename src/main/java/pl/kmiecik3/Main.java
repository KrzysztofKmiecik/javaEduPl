package pl.kmiecik3;

public class Main {
    public static void main(String[] args) {

        TablicaLiczb tablicaLiczb = ((n) -> {
            if (n.length <= 0) {
                throw new IllegalArgumentException("array is empty");
            }
            double sum = 0;
            for (int i = 0; i < n.length; i++) {
                sum += n[i];
            }
            return sum;
        });
        System.out.println(tablicaLiczb.wartosc(new double[]{1, 2, 3, 4}));

        double[] db={1,2,3,4};
        System.out.println(tablicaLiczb.wartosc(db));
    }

}
