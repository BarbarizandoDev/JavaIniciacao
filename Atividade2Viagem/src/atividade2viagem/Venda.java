
package atividade2viagem;


public class Venda {
    private String clienteNome;
    private String formaPagamento;
    private PacoteViagem pacoteViagem;
    
    public Venda(String clienteNome, String formaPagamento,PacoteViagem pacoteViagem){
        this.clienteNome = clienteNome;
        this.formaPagamento = formaPagamento;
        this.pacoteViagem = pacoteViagem;
    }

    public void setClienteNome(String clienteNome) {
        this.clienteNome = clienteNome;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public void setPacoteViagem(PacoteViagem pacoteViagem) {
        this.pacoteViagem = pacoteViagem;
    }
    
    public double converterParaReal(double valorDolar, double cotacao){
        return valorDolar*cotacao;
    }

   public void conteudoVenda(double cotacaoDolar){
                double totalDolar = pacoteViagem.totalPacote();
                double totalReal = converterParaReal(totalDolar,cotacaoDolar);
         
         //informaçãoes da venda para o usuario :       
        System.out.println("------------------------------------------------------------------\n");
        System.out.println("------------INFORMAÇÕES DA VENDA-----------\n");
        System.out.println("Cliente:" + clienteNome);
        System.out.println("Forma de Pagamento:" + formaPagamento);
        System.out.println("Pacote de Viagem :" + pacoteViagem);
        System.out.println("Total em Dólar:" + totalDolar );
        System.out.println("Total em Reais:"  + totalReal);
        
        }
    
}
