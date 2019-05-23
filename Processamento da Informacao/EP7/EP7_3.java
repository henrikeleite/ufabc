package EP7;
import java.util.Scanner;

/**
 *
 * @author Henrique
 */
public class EP7_3 {
    static int[] ordenarVetor(int[] vetor){
        int aux;
        for (int i = 0; i < vetor.length; i++) {
            for (int j = i+1; j < vetor.length; j++) {
                if(vetor[i]>vetor[j]){
                    aux = vetor[j];
                    vetor[j]=vetor[i];
                    vetor[i]=aux;
                }
            }
        }
        return vetor;
    }
    static void imprimirVetor(int[] vetor){
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] vetor = new int[n];
        
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = in.nextInt();
        }
        imprimirVetor(vetor);
    }
}