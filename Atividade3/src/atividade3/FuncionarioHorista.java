
package atividade3;


public class FuncionarioHorista extends Funcionario {
    private double horasTrabalhadas;
    private double valorHora;
    
    public FuncionarioHorista(String nome, String cpf, String endereco, String telefone, String setor){
        super(nome, cpf , endereco, telefone, setor);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }
    
    public double gethorasTrabalhadas(){
        return horasTrabalhadas;
    }
    
    public double getvalorHora(){
        return valorHora;
    }
    
    
    @Override
    public double calcularPagamento(){
        return horasTrabalhadas * valorHora;
    }
    
    @Override
    public void aplicarAumento(double percentualAumento){
        valorHora += valorHora * (percentualAumento / 100);
    }
}
