package EP1;

import java.util.Scanner;

/**
 *
 * @author henrique.leite
 */
public class EP1_2 {
    public static void main(String[] args) {
        double nota1, nota2, nota3;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a nota 1: ");
        nota1  = teclado.nextDouble();
        System.out.print("Digite a nota 2: ");
        nota2 = teclado.nextDouble();
        System.out.print("Digite a nota 3: ");
        nota3  = teclado.nextDouble();
        
        System.out.println("media=" + (nota1+nota2+nota3)/3);
    }
}
