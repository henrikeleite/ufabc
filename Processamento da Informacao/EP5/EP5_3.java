package EP5;

import java.util.Scanner;

/**
 *
 * @author Henrique
 */
public class EP5_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int idade, infantil=0, juvenil=0, junior=0, profissional=0, porcentagem=0;
        double peso;
        String nome;
        while(true){
            idade = in.nextInt();
            if (idade==0) {
                break;
            }
            nome = in.next();
            peso = in.nextDouble();
            if (5<=idade && 10>=idade) {
                infantil++;
            }else if (11<=idade && 15>=idade) {
                juvenil++;
            }else if (16<=idade && 20>=idade) {
                junior++;
            }else if (21<=idade) {
                profissional++;
            }
            if(peso>=10.0 && peso<=25.5){
                porcentagem++;
            }
        }
        System.out.println("A quantidade de atletas na categoria infantil: " + infantil);
        System.out.println("A quantidade de atletas na categoria juvenil: " + juvenil);
        System.out.println("A quantidade de atletas na categoria junior: " + junior);
        System.out.println("A quantidade de atletas na categoria profissional: " + profissional);
        System.out.println("A porcentagem de atletas com peso entre 10,0 e 25,5 kg: " + (double) (porcentagem*100)/(infantil+juvenil+junior+profissional));
    }
}
