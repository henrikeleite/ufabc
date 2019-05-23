package EP8;
import java.util.Scanner;

/**
 *
 * @author Henrique
 */
public class EP8_3 {

    static int[][] lerMatriz() {
        Scanner in = new Scanner(System.in);
        int[][] matriz;
        int l, c;
        l = in.nextInt();
        c = in.nextInt();
        matriz = new int[l][c];
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                matriz[i][j] = in.nextInt();
            }
        }
        return matriz;
    }

    static void exibirVetor(int[][] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor[0].length; j++) {
                System.out.print(vetor[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    static int[][] ordenarVetor(int[][] vetor) {
        int aux;
        for (int k = 0; k < vetor.length; k++) {
            for (int i = 0; i < vetor[0].length; i++) {
                for (int j = i + 1; j < vetor[0].length; j++) {
                    if (vetor[k][i] > vetor[k][j]) {
                        aux = vetor[k][j];
                        vetor[k][j] = vetor[k][i];
                        vetor[k][i] = aux;
                    }
                }
            }
        }
        return vetor;
    }

    public static void main(String[] args) {
        int[][] matriz = lerMatriz();
        exibirVetor(matriz);
        matriz = ordenarVetor(matriz);
        exibirVetor(matriz);
    }
}
