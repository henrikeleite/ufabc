package EP6;

import java.util.Scanner;

/**
 *
 * @author Henrique
 */
public class EP6_2 {
    public static void main(String[] args) {
        Scanner inTexto = new Scanner(System.in);
        Scanner inInt = new Scanner(System.in);
        System.out.print("Quantidade de alunos: ");
        double media=0;
        int nAlunos = inInt.nextInt();
        String[] nome = new String[nAlunos];
        int[] nota = new int[nAlunos];
        for (int i = 0; i < nAlunos; i++) {
            System.out.print("Digite a nota: ");
            nota[i] = inInt.nextInt();
            media += nota[i];
        }
        for (int i = 0; i < nAlunos; i++) {
            System.out.print("Digite o nome: ");
            nome[i] = inTexto.nextLine();
        }
        media = media/nAlunos;
        System.out.println(media);
        for (int i = 0; i < nAlunos; i++) {
            if (nota[i]>media) {
                System.out.println(nome[i]);
            }
  
        }
    }
}

