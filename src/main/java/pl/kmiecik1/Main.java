package pl.kmiecik1;

import pl.kmiecik1.*;

public class Main {
    public static void main(String[] args) {
////////////////
        Liczba pi;
        // pi=()->3.14f;
        pi = () -> (float) (Math.random() * 100);
        System.out.println(pi.getValue());

//////////////
        Liczba2arg liczba2Arg = (a, b) -> a + b;
        System.out.println(liczba2Arg.getValue(3, 4));


//////////////////
        LiczbaWarunek liczbaWarunek = (int a, int b) -> a > b;

        if (liczbaWarunek.test(5, 4)) {
            System.out.println("a jest wieksze od b");
        } else {
            System.out.println("b jest wieksze od a");
        }
////////////////////

        JakasLambda<Integer> silnia  = n -> {

            int r = 1;
            for (int i = 1; i <= n; i++) {
                r = r * i;
            }
            return r;
        };

        System.out.println("Silnia z liczby 5 rowna sie "+ silnia .getValue(5));


///////////////////////

        JakasLambda<String> rewers= s->{
            StringBuilder odTylu= new StringBuilder();
            for (int i = s.length()-1; i >=0 ; i--) {
                odTylu.append(s.charAt(i));
            }
            return odTylu.toString();
        };

        System.out.println("REwers dla 123456789 to "+rewers.getValue("123456789"));
        int myInt = Integer.parseInt(rewers.getValue("12")) + 1;
        System.out.println(myInt);
//////////////////////////////

    }
}
