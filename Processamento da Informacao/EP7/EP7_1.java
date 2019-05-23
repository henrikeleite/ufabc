package EP7;
import java.util.Scanner;

/**
 *
 * @author henrique.leite
 */
public class EP7_1 {
    static int[] ocorrenciasNoVetor(int[] vetor){
        int[] v2 = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            switch(vetor[i]){
                case 0:
                    v2[0]++;
                    break;
                case 1:
                    v2[1]++;
                    break;
                case 2:
                    v2[2]++;
                    break;
                case 3:
                    v2[3]++;
                    break;
                case 4:
                    v2[4]++;
                    break;
                case 5:
                    v2[5]++;
                    break;
                case 6:
                    v2[6]++;
                    break;
                case 7:
                    v2[7]++;
                    break;
                case 8:
                    v2[8]++;
                    break;
                case 9:
                    v2[9]++;
                    break;
            }
        }
        return v2;
    }
    static void imprimirVetor(int[] vetor){
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] v1, v2;
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o tamanho do vetor: ");
        int n = in.nextInt();
        v1 = new int[n];
        for (int i = 0; i < v1.length; i++) {
            v1[i] = in.nextInt();
        }
        v2 = ocorrenciasNoVetor(v1);
        imprimirVetor(v2);
    }    
}
