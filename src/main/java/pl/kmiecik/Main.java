package pl.kmiecik;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        String str = "5 osób miało po 3 zł o 6 godzinie";
        str.chars().filter(litera -> !Character.isDigit((char) litera) &&
                        !Character.isWhitespace((char) litera))
                .forEach(litera -> System.out.println((char) litera));

        Pattern.compile(" ")
                .splitAsStream(str)
                .forEach(System.out::println);

        try (Stream<String> stream = Files.lines(Paths.get("plikTestowy.txt"))) {
            stream.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

        ///////////
        Stream.of(Arrays.asList(1, 2), Arrays.asList(3, 4))
                .map(List::stream)
                .forEach( n -> System.out.println(n));

        Stream.of(Arrays.asList(1, 2), Arrays.asList(3, 4))
                .flatMap(List::stream)
                .map( n -> n + 2)
                .forEach( n -> System.out.print(n));  // wypisane zostanie: 3456
        ///////////

        System.out.println("imiona");
        System.out.print(Stream.of("Mateusz", "Michal", "Magdalena", "Basia", "Natalia")
                .flatMap(name -> IntStream.range(0, name.length())
                        .mapToObj(name::charAt))
                .filter(ch -> ch == 'a' || ch == 'A')
                .count()
        );  // wypisana zostanie liczba 10
    }
}
