package ep2;

import java.util.Scanner;

/**
 *
 * @author henrique.leite
 */
public class EP2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x1, y1, x2, y2, d;
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o valor de x1:");
        x1 = in.nextInt();
        System.out.print("Digite o valor de y1:");
        y1 = in.nextInt();
        System.out.print("Digite o valor de x2:");
        x2 = in.nextInt();
        System.out.print("Digite o valor de y2:");
        y2 = in.nextInt();
        d = Math.sqrt((Math.pow((x2-x1), 2.0)+Math.pow((y2-y1), 2.0)));
        System.out.printf("distancia entre os pontos=%.3f", d);
    }

}
