package optional;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class OpationalComPrimitivos {
    public static void main(String[] args) {

        System.out.println("\nOptional com int");
        OptionalInt.of(12).ifPresent(System.out::println);

        System.out.println("\nOptional com decimal");
        OptionalDouble.of(55.2).ifPresent((System.out::println));

        System.out.println("\nOptional com long");
        OptionalLong.of(23L).ifPresent(System.out::println);
    }
}
