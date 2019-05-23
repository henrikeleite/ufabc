package EP4;
import java.util.Scanner;

/**
 *
 * @author henrique.leite
 */
 public class EP4_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean primo=true;
        for (int i = 2; i < n; i++) {
            if (n%i==0) {
                primo=false;
            }
        }
        if (primo) {
            System.out.println("numero primo!");
        }else{
            System.out.println("nao e primo!");
        }
    }
}