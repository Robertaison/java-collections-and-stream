package optional;

import java.util.Optional;

public class PlayingWithOptional {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Valor opcional");

        System.out.println(optional.isPresent());
        System.out.println(optional.isEmpty());

        optional.ifPresent(System.out::println);

        optional.ifPresentOrElse(System.out::println, () -> System.out.println("Valor nao presente"));

        if (optional.isPresent()) {
            String valor = optional.get();

            System.out.println(valor);
        }

        optional.map((valor) -> valor.concat("****")).ifPresent((System.out::println));
    }
}
