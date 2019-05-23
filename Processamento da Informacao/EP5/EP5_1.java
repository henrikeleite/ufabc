package EP5;

import java.util.Scanner;

/**
 *
 * @author Henrique
 */
public class EP5_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a, b, c, i, d = 0;
        a = teclado.nextInt();
        b = teclado.nextInt();
        while (a > 0) {
            System.out.println("a = " + a);
            a = a - 2;
            c = a % 3;
            if (c != 0) {
                a = a - 1;
            } else {
                a = a + 1;
            }
            for (i = 0; i < a; i = i + 2) {
                System.out.println("i = " + i);
                d = i * 2;
                System.out.println(d);
                a = d - 2;
            }
        }
        System.out.println(a);
        c = b - 2;
        System.out.println(c);
    }
}
