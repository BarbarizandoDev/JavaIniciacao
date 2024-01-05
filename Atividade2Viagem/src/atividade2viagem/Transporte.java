
package atividade2viagem;


public class Transporte {
    private String tipo;
    private double valor;
    
    public Transporte (String tipo, double valor){
        this.tipo = tipo;
        this.valor = valor;
    }

    
    public String getTipo(){
        return tipo;
    }
    
    public double getValor(){
        return valor;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    String gettransporteTipo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String gettransporteValor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
