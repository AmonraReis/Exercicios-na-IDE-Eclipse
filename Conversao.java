package Fundamentos;

import java.util.Scanner;

 	
public class Conversao {
	
	 public static void main(String[] args) {
		 @SuppressWarnings("unused")
		Scanner entrada2 = new Scanner (System.in);
		@SuppressWarnings("unused")
		String nome;
		@SuppressWarnings("unused")
		int idade;
		@SuppressWarnings("unused")
		String cpf;
	
		
		System.out.println("Digite seu nome:");
		nome = entrada2.next();
		
		System.out.println("Digite sua idade: ");
		idade = entrada2.nextInt();
		
		System.out.println("Digite o seu CPF:");
		cpf = entrada2.next();
				
		

		System.out.println("=================Calculadora de Descontos INSS===========");
		Scanner entrada = new Scanner (System.in);
		
		
		
		
		
		System.out.print("Informe o seu salario bruto de ate R$ 1.100,00: ");		
		
	    String valorMilCem = entrada.next().replace(",", ".");
	    
	    double mil = Double.parseDouble(valorMilCem);
	    
	    double descontoMil = mil* 7.5 /100.0;
	      
	   
	    System.out.println("O salario liquido do funcionario é igual a : " + (mil - descontoMil));
	    

	    
	    
	    
	    
    
	    System.out.println("=================1.100,01 até 2.203,48=================");
	    
	    
	    
	
	
		System.out.print("Informe o seu salario bruto de R$ 1.100,01 até 2.203,48: ");
		
	         
	    String valor1 = entrada.next().replace(",", ".");
		 
  
		double salario1 = Double.parseDouble(valor1);	
	
        double desconto1 = salario1* 9.0 / 100.0;

       System.out.println("O salario liquido do funcionario é igual a : " + (desconto1 - salario1));
       
       
       
       
       
   
       System.out.println("===================== 2.203,49 até 3.305,22======================");
       
       
       
       
       
	
       System.out.print("Informe o seu salario bruto de de 2.203,49 até 3.305,22: ");
       
       String Aliqota12 = entrada.next().replace(",", ".");
       
       double salarioAliqota12 = Double.parseDouble(Aliqota12);
       
       double descontoAliqota12 = salarioAliqota12* 12.0 / 100.0;
       
       System.out.println("O salario liquido do funcionario é igual a : " + (descontoAliqota12 - salarioAliqota12));
       
       
       
       
       
       
       
       System.out.println("===============de 3.305,23 até 6.433,57	14%=====================");
       
       
       
       
          
       System.out.print("Informe o seu salario bruto de R$3.305,23 até R$6.433,57: ");
	    
       String Aliqota14 = entrada.next().replace(",", ".");
       
       double salarioAliqota14 = Double.parseDouble(Aliqota14);
       
       double descontoAliqota14 = salarioAliqota14* 14.0 /100.0;
       
       System.out.println("O salario liquido do funcionario é igual a : " + (descontoAliqota14 - salarioAliqota14));
       
       
       
       
       
	    

       
       
       
		entrada.close();
		
	}

}