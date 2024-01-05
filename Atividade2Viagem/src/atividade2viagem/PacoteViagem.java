
package atividade2viagem;

public class PacoteViagem {
    
    private Transporte transporte;
    private Hospedagem hospedagem;
    private String destinoViagem;
    private int quantidadeDias;
    
   
    public PacoteViagem(Transporte transporte,Hospedagem hospedagem , String destinoViagem ,int quantidadeDias){
        this.transporte = transporte;
        this.hospedagem = hospedagem;
        this.destinoViagem = destinoViagem;
        this.quantidadeDias = quantidadeDias;
    }

    
    public String getDestinoViagem(){
        return destinoViagem;
    }
    
    public int getQuantidadeDias(){
        return quantidadeDias;
    }
 
    
    public double totalPacote (double margemLucro,double adicionais){
        double totalTransporte = transporte.getValor();
        double totalHospedagem = hospedagem.totalHospedagem();
        double totalAdicionais = totalTransporte + totalHospedagem + adicionais();
        double lucro = (totalAdicionais * margemLucro) / 100;
        return totalAdicionais + lucro;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }

    public void setHospedagem(Hospedagem hospedagem) {
        this.hospedagem = hospedagem;
    }

    public void setDestinoViagem(String destinoViagem) {
        this.destinoViagem = destinoViagem;
    }

    public void setQuantidadeDias(int quantidadeDias) {
        this.quantidadeDias = quantidadeDias;
    }
 private double adicionais() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    double totalPacote() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getdestinoViagem() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getquantidadeDias() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
