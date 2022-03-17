package pl.refleksja;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Class klasa = Class.forName("pl.refleksja.Bar");
        Method metoda = klasa.getMethod("mojaMetoda");
        metoda.invoke(klasa.newInstance());
//
        Method[] metody= klasa.getMethods();
        for(Method m:metody){

            System.out.print("Klasa " + klasa + " ma metode '" + m.getName() + "'");
            System.out.println(" ktora zwraca wartosc typu " + m.getReturnType());
        }
    }
}
