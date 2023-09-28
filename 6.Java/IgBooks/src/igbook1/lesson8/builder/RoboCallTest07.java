package igbook1.lesson8.builder;

import java.util.List;
import java.util.function.Predicate;

public class RoboCallTest07 {

    public static void main(String[] args) {
        List<Person> p1 = Person.createShortList();

        RoboCall05 robo = new RoboCall05();

        System.out.println("=== Calling all Lambda Drivers ===");
        p1.stream()
                .filter(p -> p.getAge() >= 23 && p.getAge() <= 65 )
                .forEach(p -> robo.roboCall(p) );

        // Predicates
        Predicate<Person> allPilots =
                p -> p.getAge() >= 23 && p.getAge() <= 65;

        System.out.println("\n=== Calling all Drivers Variable ===");
        p1.stream().filter(allPilots)
                .forEach(p -> robo.roboCall(p));

// ============== Method References ============
        // Normal code
//        list.forEach(s -> System.out.println(s));
        // Short-hand
//        list.forEach(System.out::println);

        /*
            You can use a method reference in the following situations:
            -- Reference to a static method ContainingClass::staticMethodName
            -- Reference to an instance method
            -- Reference to an instance method of an arbitrary object of a particular type e.g. String::compareToIgnoreCase
            -- Reference to a constructor className::new
            // In many situations, a method reference can be substituted for a lambda expression.
            If a lambda expression merely calls a method on that object, a Method reference can be substituted.


         */

        /*
            Example: We want the CA Transactions for ACME
            tList.stream()
                .filter(t -> t.getState().equals("CA") &&
                    t.getBuyer().getName().equals("Acme Electronics"))
                .forEach(SalesTxn::printSummary);

            OR you can say:

            tList.stream()
                .filter(t -> t.getState().equals("CA"))
                .filter(t -> t.getBuyer().getName()
                    .equals("Acme Electronics"))
                .forEach(SalesTxn::printSummary);
         */


    }

}
