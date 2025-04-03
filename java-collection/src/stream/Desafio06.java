package stream;

import java.util.Arrays;
import java.util.List;

//Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.

public class Desafio06 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, -3, 4, 5, 6, -7, 8, -9, 10, 5, -4, 3, 12);

        numeros.stream()
                .filter(n -> n > 10)
                .forEach(System.out::println);

    }
}
