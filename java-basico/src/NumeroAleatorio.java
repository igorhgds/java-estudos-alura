import java.util.Random;
import java.util.Scanner;

public class NumeroAleatorio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(50);
        int tentativa = 0;
        int contador = 1;

        for (int i = 0; i < 5; i++) {
            System.out.println("Tente adivinhar o número de 0 a 50");
            tentativa = scan.nextInt();
            if (numeroAleatorio == tentativa) {
                System.out.println("Parabéns Você Acertou com " + contador + " tentativas");
                break;
            } else if (numeroAleatorio < tentativa) {
                System.out.println("Errado, o número é menor que " + tentativa);
            } else {
                System.out.println("Errado, o número é maior que " + tentativa);
            }
            contador++;

            if (i == 4) {
                System.out.println("Que pena, suas chances acabaram, VOCÊ PERDEU!, \n O número era: " + numeroAleatorio);
            }
        }
    }
}
