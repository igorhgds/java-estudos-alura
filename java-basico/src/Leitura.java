import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String filme = scan.nextLine();

        System.out.println("Qual o ano de lançamento: ");
        int ano = scan.nextInt();

        System.out.println("Qual a sua avaliação por filme de 0 a 10: ");
        double avaliacao = scan.nextDouble();

        System.out.println("Seu filme é: " + filme);
        System.out.println(ano);
        System.out.println(avaliacao);
    }
}
