package EP5;

import java.util.Scanner;

/**
 *
 * @author Henrique
 */
public class EP5_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] valores = new int[5];
        int media=0;
        for (int i = 0; i < 5; i++) {
            valores[i] = in.nextInt();
            media += valores[i];
        }
        media = media/5;
        for (int i = 0; i < 5; i++) {
            if(valores[i]>media && valores[i]%2==0){
                System.out.println("par maior que a media: " + valores[i]);
            }
        }
    }  
}
