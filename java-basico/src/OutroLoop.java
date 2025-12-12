import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1){
            System.out.println("Qual a sua avaliação pro filme de 0 a 10: (ou -1 para encerrar)");
            nota = scan.nextDouble();

            if(nota != -1){
                mediaAvaliacao += nota;
                totalDeNotas++;
            }

        }
        if(totalDeNotas == 0){
            System.out.println("Você não digitou nenhuma nota.");
        } else {
            System.out.println("Média de avaliações: " + String.format("%.2f",mediaAvaliacao/totalDeNotas));
        }
    }
}
