package optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        Optional<String> optionalValue = Optional.of("Valor presente");

        System.out.println("Valor optional presente");
        optionalValue.ifPresentOrElse(System.out::println, () -> System.out.println("não esta presente"));

        Optional<String> optinalNull = Optional.ofNullable(null);

        System.out.println("Valor optional nao presente");
        optionalValue.ifPresentOrElse(System.out::println, () -> System.out.println("null = não esta presente"));

        Optional<String> emptyOptional = Optional.empty();

        System.out.println("Valor optional nao presente");
        optionalValue.ifPresentOrElse(System.out::println, () -> System.out.println("empty = não esta presente"));

        Optional<String> nullWithError = Optional.of(null);

        System.out.println("Valor optional nao presente lançando exceção");
        optionalValue.ifPresentOrElse(System.out::println, () -> System.out.println("erro = não esta presente"));
    }
}
