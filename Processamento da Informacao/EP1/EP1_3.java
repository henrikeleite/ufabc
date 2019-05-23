package EP1;

import java.util.Scanner;

/**
 *
 * @author henrique.leite
 */
public class EP1_3 {
    public static void main(String[] args) {
        int a, b;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor de A: ");
        a = teclado.nextInt();
        System.out.print("Digite o valor de B: ");
        b = teclado.nextInt();
        a+=b;
        b=a-b;
        a=a-b;
        System.out.println("A=" + a + " e B=" + b);
    }
}
