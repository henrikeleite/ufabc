package EP4;

import java.util.Scanner;

/**
 *
 * @author Henrique
 */
public class EP4_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double investimentoInicial, taxaJuros, meses, investimentoObitido;
        String[] cabecalho = {"Mes", "Juros no Mes (%)", "Juros Total (%)", "Investimento"};
        System.out.print("Digite o investimento inicial: ");
        investimentoInicial = in.nextDouble();
        System.out.print("Digite a taxa de juros: ");
        taxaJuros = in.nextDouble();
        System.out.print("Digite o numero de meses: ");
        meses = in.nextDouble();
        System.out.printf("%s\t%s\t%s\t%s\n",cabecalho[0], cabecalho[1], cabecalho[2], cabecalho[3]);
        for (int i = 0; i < meses; i++) {
            investimentoObitido = investimentoInicial * Math.pow((1+ taxaJuros/100),(double) i);
            System.out.printf("%d\t%.2f\t%20.2f\t%14.2f\n", i, taxaJuros, taxaJuros*i, investimentoObitido);
        }        
    }
}
