
package atividade3;


public class FuncionarioAssalariado extends Funcionario {
    private double salario;
    
    public FuncionarioAssalariado(String nome, String cpf , String endereco, String telefone, String setor){
        super(nome,cpf,endereco,telefone,setor);
        this.salario = salario;
    }
    
    public double getSalario(){
        return salario;
    }
    
    
    @Override
    public double calcularPagamento(){
        return salario;
    }
    
    @Override
    public void aplicarAumento(double percentualAumento){
        salario += salario * (percentualAumento / 100);
    }
}
