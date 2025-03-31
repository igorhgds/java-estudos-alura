import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota = 0.0;

        for (int i = 0; i < 3; i++){
            System.out.println("Digite a avaliação para o filme de 0 a 10: ");
            nota = scan.nextDouble();
            mediaAvaliacao += nota;
        }
        System.out.println("Média Avaliacao: " + mediaAvaliacao / 3);
    }
}
