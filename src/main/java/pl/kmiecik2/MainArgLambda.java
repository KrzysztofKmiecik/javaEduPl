package pl.kmiecik2;

class MainArgLambda {

    public static String strMetoda(JakasLambda lbd, String str) {
        return lbd.wartosc(str);
    }

    public static void main(String[] args) {

        String strUpperCase = strMetoda(s -> s.toUpperCase(), "test");
        System.out.println(strUpperCase);
        /////
        String strOdwrocony = strMetoda(s -> {
            StringBuilder odTylu = new StringBuilder();

            for (int i = s.length() - 1; i >= 0; i--) {
                odTylu.append(s.charAt(i));
            }
            return odTylu.toString();
        }, "123456789");
        System.out.println("String odwrocony 123456789 to " + strOdwrocony);
        ////

        JakasLambda jakasLambda = (s -> {
            StringBuilder odTylu = new StringBuilder();

            for (int i = s.length() - 1; i >= 0; i--) {
                odTylu.append(s.charAt(i));
            }
            return odTylu.toString();
        });
        System.out.println("String odwrocony 123456789 to "+ strMetoda(jakasLambda, "123456789"));
    }

}
