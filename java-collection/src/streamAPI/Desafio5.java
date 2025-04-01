package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.

public class Desafio5 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, -3, 4, 5, 6, 7, 8, -9, 10, 5, -4, 3);

        List<Integer> numerosMaioresQue5 = numeros.stream()
                .filter(n -> n >= 5)
                .toList();

        System.out.println(numerosMaioresQue5);

        numerosMaioresQue5.stream()
                .mapToInt(Integer::intValue)
                .average()
                .ifPresent(media -> System.out.println("Média dos números maiores que 5: " + String.format("%.2f", media)));


    }
}
