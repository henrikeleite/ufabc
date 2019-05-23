package ep2;

import java.util.Scanner;

/**
 *
 * @author henrique.leite
 */
public class EP2_3 {
        static double base, altura, area;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite a base: ");
        base = in.nextDouble();
        System.out.print("Digite a altura: ");
        altura = in.nextDouble();
        area = calcula_area(base,altura);
        System.out.println("area=" + area);
        System.out.println("base=" + base);
        System.out.println("altura=" + altura);
    }
    static double calcula_base(Double area, Double altura){
        return area/altura;
    }
    static double calcula_altura(Double base, Double area){
        return area/base;
    }
    static double calcula_area(Double base, Double altura){
        return base*altura;
    }
}
