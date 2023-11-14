package VetoresEMatrizes;
import java.util.Scanner;

public class MatrizCalculaMedias {
    public static void main(String[] args) {
        // Declaração de variáveis
        double[][] matriz = new double[10][4];
        double[] medias = new double[10];

        // Entrada de dados
        Scanner scanner = new Scanner(System.in);
        for (int participante = 0; participante < 10; participante++) {
            for (int bimestre = 0; bimestre < 4; bimestre++) {
                System.out.print("Digite a nota do participante " + (participante + 1) +
                                 " no bimestre " + (bimestre + 1) + ": ");
                matriz[participante][bimestre] = scanner.nextDouble();
            }
        }

        // Processamento
        for (int participante = 0; participante < 10; participante++) {
            medias[participante] = 0;
            for (int bimestre = 0; bimestre < 4; bimestre++) {
                medias[participante] += matriz[participante][bimestre];
            }
            medias[participante] /= 4.0;
        }

        // Saída de dados
        System.out.println("\nMédias dos participantes:");
        for (double media : medias) {
            System.out.print(media + " ");
        }
    }
}
