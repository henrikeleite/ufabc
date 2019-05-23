package EP7;
import java.util.Scanner;

/**
 *
 * @author henrique.leite
 */
public class EP7_2 {
    static void imprimirVetor(int[] vetor){
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
    static int[] inverteIndices(int[] vetor, int i, int j){
        if((0<=i && i<vetor.length) && (0<=j && j<vetor.length)){
            int aux = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = aux;
        }
        return vetor;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //System.out.print("Digite o tamanho do vetor: ");
        int n = in.nextInt();
        int i = in.nextInt();
        int j = in.nextInt();
        int[] vetor = new int[n];
        for (int k = 0; k < vetor.length; k++) {
            vetor[k] = in.nextInt();
        }
        vetor = inverteIndices(vetor, i , j);
        imprimirVetor(vetor);
    }
}