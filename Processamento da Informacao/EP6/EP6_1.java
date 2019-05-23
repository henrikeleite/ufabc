package ep6;

import java.util.Scanner;

/**
 *
 * @author henrique.leite
 */
public class EP6_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tamanhoArray = in.nextInt();
        int maior=0;
        int[] array = new int[tamanhoArray];
        for (int i = 0; i < tamanhoArray; i++) {
            array[i] = in.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if (maior < array[i]) {
                maior = array[i];
            }
        }
        System.out.println("maior="+maior);
    }
}
