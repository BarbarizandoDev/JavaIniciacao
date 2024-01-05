
package atividade3;

import java.util.ArrayList;
import java.util.List ;
import java.util.Scanner;


public class projetopagamentos {

    
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      List<Funcionario> funcionarios = new ArrayList<>();
      
      System.out.println("Favor informar dados de até 10 funcionarios:");
      
      for (int i = 1; i<=10; i++) {
          System.out.println("Funcionario:" + i);
          System.out.println("Nome :");
          String nome = scanner.nextLine();
          System.out.println("CPF :");
          String cpf = scanner.nextLine();
          System.out.println("Endereço :");
          String endereco = scanner.nextLine();
          System.out.println("Telefone :");
          String telefone = scanner.nextLine();
          System.out.println("Setor :");
          String setor = scanner.nextLine();
          System.out.println("Tipo (A assalariado H horista) :");
          String tipo = scanner.nextLine();
          
          if (tipo.equalsIgnoreCase("A")) {
              System.out.println("Salario :");
              double salario = scanner.nextDouble();
              scanner.nextLine();
              
              funcionarios.add(new FuncionarioAssalariado(nome,cpf,endereco,telefone,setor,salario));
          }else if(tipo.equalsIgnoreCase("H")){
                  System.out.println("Horas trabalhadas :");
                  double horasTrabalhadas = scanner.nextDouble();
                  System.out.println("Valor da hora :");
                  double valorHora = scanner.nextDouble();
                  scanner.nextLine();
                  
                  funcionarios.add(new FuncionarioHorista(nome,cpf,endereco,telefone,setor,horasTrabalhadas,valorHora));
          }else {
                  System.out.println("Tipo de funcionario invalido.");
                  i--;   
          }
          
          System.out.println();
          
      }
      System.out.println("Informações / Pagamentos dos Funcionarios :");
      
      for (Funcionario funcionario : funcionarios) {
          funcionario.mostrarDados();
          System.out.println("Pagamento:  R$" + funcionario.calcularPagamento());
          System.out.println();    
      }
      
      System.out.println("Percentual de aumento para cada funcionario :");
      double percentualAumento = scanner.nextDouble();
      
      for (Funcionario funcionario : funcionarios){
          funcionario.aplicarAumento(percentualAumento);
      }
      
     System.out.println("Dados dos funcionarios após o aumento :"); 
     
     for (Funcionario funcionario : funcionarios){
         funcionario.mostrarDados();
         System.out.println("Pagamento :  R$" + funcionario.calcularPagamento());
         System.out.println();     
     }  
   }
}
