package EP8;
import java.util.Scanner;

/**
 * @author Henrique
 */
/*
codeEx6.4 - livro texto
Criar uma matriz de inteiros para armazenar L linhas e C colunas. Calcular a soma dos elementos acima da diagonal da matriz.
Entradas: 2 3 
6 9 6
7 8 9
Saída: 
24
*/
public class EP8_2 {
    static int[][] lerMatriz(){
        Scanner in = new Scanner(System.in);
        int[][] notas;
        int l, c;
        l = in.nextInt();
        c = in.nextInt();
        notas = new int[l][c+1];
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                notas[i][j] = in.nextInt();
            }
        }
        return notas;
    }
    static int somaPrincipalSuperior(int[][] matriz){
        int soma=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = i+1; j < matriz[0].length; j++) {
                soma += matriz[i][j];
            }
        }
        return soma;
    }
    public static void main(String[] args) {
        int[][] matriz = lerMatriz();
        int soma = somaPrincipalSuperior(matriz);
        System.out.println(soma);
    }
}