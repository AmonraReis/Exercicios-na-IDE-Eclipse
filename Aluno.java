

import java.util.Scanner;

public class Aluno
{
     private String nome;
     private String rg;
     private String dataNascimento;
     private String turma;


     public Aluno(String nome, String rg, String dataNascimento, String turma)
     {
        this.nome = nome;  
        this.rg = rg;
        this.dataNascimento= dataNascimento;
        this.turma= turma;
     }

     public void setNome(String nome)
     {
         this.nome = nome;
     }
     public String getNome()
     {
         return nome;
     }
      
     public void setRg(String rg)
     {
         this.rg = rg;
     }
     public String getRg()
     {
         return rg;
     }
     public void  setDataNascimento(String dataNascimento) { 
    	 this.dataNascimento = dataNascimento;
    	 
     }
    public String getdataNascimento() {
		return dataNascimento;
    	
    }
    public void setTurma(String turma) {
    	this.turma= turma;
    }
    public String getTurma() {
    	return turma;
    }

    public void CadastrarAluno()
    {
      
        try (Scanner input = new Scanner(System.in)) {
			String nome = "";
			String rg = "";
			String dataNascimento ="";
			String turma= "";
			
			System.out.println("\n\nDigite Nome Completo do Aluno: \n");
			nome = input.nextLine();
			    
			System.out.println("\n\nDigite Registro Geral (RG): \n");
			rg = input.nextLine();
			
			System.out.println("\nDigite a data de nascimento do aluno: \n");
			dataNascimento = input.next();
			
			System.out.println("\nDigite a turma do aluno: \n");
			
			turma= input.next();
			
			
			var novoAluno = new Aluno(nome, rg,dataNascimento, turma);
			 
			System.out.printf("\n Aluno Cadastrado com Sucesso!");
			System.out.printf("\n Nome: %s - RG: %s - Data Nascimento: %s - Turma: %s," ,novoAluno.nome, novoAluno.rg, novoAluno.dataNascimento, novoAluno.turma);
		}            
        
        

    }
    
    public static void main(String[] args)
    {
        
        Aluno AdicionarAluno = new Aluno("", "", "", "");
        AdicionarAluno.CadastrarAluno();
        
           
       
    }    
    
    
    
    
        
          

}


    
    
 
		
		