package EP3;
import java.util.Scanner;
class EP3_3 {
  public static void main(String[] args) {
  	Scanner in = new Scanner(System.in);
  	double salario;
  	int tempoServico;
  	//System.out.print("Digite o salário atual: ");
  	salario = in.nextDouble();
  	//System.out.print("Tempo de Serviço: ");
  	tempoServico = in.nextInt();
  	if (salario<500) {
  		System.out.println("valor do salario final = " + (salario + (salario*0.25)));
  	}else if (salario<1000) {
  		System.out.println("valor do salario final = " + (salario + (salario*0.20)));
  	}else if (salario<1500) {
  		System.out.println("valor do salario final = " + (salario + (salario*0.15)));
  	}else if (salario<2000) {
  		System.out.println("valor do salario final = " + (salario + (salario*0.10)));
  	}else{
  		System.out.println("valor do salario final = " + salario);
  	}
  	if (tempoServico<1) {
  		System.out.println("bonus = 0.0");
  	}else if (tempoServico<=3) {
  		System.out.println("bonus = 100.0");
  	}else if (tempoServico<=6) {
  		System.out.println("bonus = 200.0");
  	}else if (tempoServico<=10) {
  		System.out.println("bonus = 300.0");
  	}else if (tempoServico>10) {
  		System.out.println("bonus = 500.0");
  	}
  }
}