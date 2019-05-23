package EP3;
import java.util.Scanner;
class EP3_2 {
  public static void main(String[] args) {
  	double imc, altura, peso;
  	Scanner in = new Scanner(System.in);
  	altura = in.nextInt();
  	peso = in.nextInt();
  	altura = altura/100;
  	imc = peso/(altura*altura);
  	System.out.println(imc);
  	if (imc<=18.5) {
  		System.out.println("Magro");
  	}else if (imc<=25) {
  		System.out.println("Saudavel");
  	}else if (imc<=30) {
  		System.out.println("Acima do peso");
  	}else if (imc<=35) {
  		System.out.println("Obeso");
  	}else if (imc>35) {
  		System.out.println("Morbidez");
  	}
  }
}