package ep2;

import java.util.Scanner;

/**
 *
 * @author henrique.leite
 */
public class EP2_1 {
    public static void main(String[] args) {
        int a, b, c, delta;
        Scanner teclado = new Scanner(System.in);
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        delta = (b*b)-(4*a*c);
        System.out.println("O delta de ax*x + bx + c e " + delta);
    }    
}
