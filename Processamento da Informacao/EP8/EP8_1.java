package EP8;
import java.util.Scanner;
/**
 *
 * @author Henrique
 */
public class EP8_1 {
    static int[][] lerMatriz(){
        Scanner in = new Scanner(System.in);
        int[][] notas;
        int l, c;
        System.out.print("Digite o número de alunos: ");
        l = in.nextInt();
        System.out.print("Digite o número de notas: ");
        c = in.nextInt();
        notas = new int[l][c+1];
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                notas[i][j] = in.nextInt();
            }
        }
        return notas;
    }
    static int[][] calculaMedia(int[][] vetor){
        for (int i = 0; i < vetor.length; i++) {
            int j;
            for (j = 0; j < vetor[0].length-1; j++) {
                vetor[i][vetor[0].length-1] += vetor[i][j];
            }
            vetor[i][j] = vetor[i][j]/(vetor[0].length-1);
        }
        return vetor;
    }
    static void exibirVetor(int[][] vetor){
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor[0].length; j++) {
                System.out.print(vetor[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        int[][] notas = lerMatriz();
        notas = calculaMedia(notas);
        exibirVetor(notas);
    }
}