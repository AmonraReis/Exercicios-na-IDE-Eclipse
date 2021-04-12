import java.util.Scanner;



public class Desafio {
	
	public static void main(String[] args) {
		
		//base
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite o primeiro numero");
		
		double num1= entrada.nextDouble();
		
		
		
       System.out.print("Digite o segundo numero");
		
		double num2= entrada.nextDouble();
		
		
		System.out.print("Digite qual o operador");
		String operacao = entrada.next();
		
		//logica
		
		double resultado = "+".equals(operacao) ? num1 + num2 : 0;
		
		resultado = "-".equals(operacao) ? num1-num2 : resultado;
		resultado = "*".equals(operacao) ? num1*num2 : resultado;
		resultado = "/".equals(operacao) ? num1/num2 : resultado;
		
		

		
		
		
		
	
		System.out.printf("%.2f %s %.2f = %.2f", num1, operacao, num2, resultado);	
		
		entrada.close();
		
	}

}
