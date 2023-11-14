package VetoresEMatrizes;
import java.util.Scanner;

public class ExercicioVetores {
    public static void main(String[] args) {
        // Declaração de variáveis
        int[] vetor = new int[10];
        int soma = 0;
        double media;

        // Entrada de dados
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        // Processamento e saída de dados
        System.out.print("\nElementos nos índices ímpares:");
        for (int i = 1; i < 10; i += 2) {
            System.out.print(" " + vetor[i]);
        }

        System.out.print("\n\nElementos pares:");
        for (int i = 0; i < 10; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.print(" " + vetor[i]);
            }
        }

        // Soma
        for (int i = 0; i < 10; i++) {
            soma += vetor[i];
        }
        System.out.println("\n\nSoma: " + soma);

        // Média
        media = (double) soma / 10.0;
        System.out.println("\nMédia: " + media);
    }
}
