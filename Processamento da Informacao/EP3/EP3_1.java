package EP3;
import java.util.Scanner;
class EP3_1 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a, b, c, x, y, z;
    System.out.print("Digite um valor: ");
    a = in.nextInt();
    System.out.print("Digite um valor: ");
    b = in.nextInt();
    System.out.print("Digite um valor: ");
    c = in.nextInt();
    z = Math.max(a, Math.max(b,c));
    x = Math.min(a, Math.min(b,c));
    y = (a+b+c)-(z+x);
    System.out.println(x + ", " + y + ", " + z);
  }
}