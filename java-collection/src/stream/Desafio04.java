package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Utilize a Stream API para remover os valores ímpares da lista e imprima a lista resultante no console.

public class Desafio04 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, -3, 4, 5, 6, -7, 8, -9, 10, 5, -4, 3);

        List<Integer> numerosPares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(numerosPares);

//        numeros = new ArrayList(numeros);
//        numeros.removeIf((n) -> n % 2 != 0);
//        System.out.println(numeros);
    }
}

