
package atividade2viagem;

public class Hospedagem {
    private String descricao;
    private double diaria;
    
    public Hospedagem(String descricao, double diaria){
        this.descricao = descricao;
        this.diaria = diaria;            
    }

  
    public String getDescricao(){
        return descricao;
    }
    
    public double getDiaria(){
        return diaria;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDiaria(double diaria) {
        this.diaria = diaria;
    }
    
    public double totalDaHospedagem(int quantidadeDias){
        return diaria * quantidadeDias;
    } 

    double totalHospedagem() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String gethospedagemDescricao() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String gethospedagemDiaria() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String gettotalHospedagem() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
