package org;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Predicate<String> c=(String s1)->{
            return s1.length() > 10;
        };

        System.out.println(c.test("Asbdhdvfbvfgnbgbtgb"));


        List<Integer> l= List.of(1,2,3,4,5);
        l1= l.stream();
        //System.

    }
}