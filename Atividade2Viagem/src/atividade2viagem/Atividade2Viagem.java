
package atividade2viagem;

import java.util.Scanner;

public class Atividade2Viagem {

    
    public static void main(String[] args) {

    /* forneça a implementação do código em java para o neatbeans para as classes mencionadas, seguindo as especificações fornecidas:  projeto  tipo console com os seguintes itens:
Classe para transporte, com o tipo (aéreo, rodoviário, marítimo etc) e valor;
Classe para hospedagem, com descrição e valor de diária;
Classe para pacote de viagem, com transporte, hospedagem, destino (texto), quantidade de dias. Essa classe ainda deve ser capaz de:
Calcular o total de hospedagem a partir do número de dias e o valor da diária.
Calcular valor de lucro a partir de uma margem informada (porcentagem) e valor informado. O resultado retornado deve ser o valor + margem aplicada ao valor.
Calcular e retornar o total do pacote, somando o transporte, o total da hospedagem e valores adicionais informados – margem de lucro (porcentagem) e taxas adicionais (valor monetário).
Observação: Os valores nesta classe serão considerados em dólar.
Classe para venda, que possui o nome do cliente, forma de pagamento e pacote de viagem. A classe deve ser capaz de:
Converter um valor em reais a partir de um valor informado em dólar e da cotação da moeda, também informada.
Mostrar na tela o total do pacote de viagem em dólar e em reais.
Na classe principal, elabore código para interação com o usuário em que seja possível “cadastrar” uma venda:
Obtenha todos os valores necessários para criar um pacote de viagem e crie esse objeto.
Mostre na tela as informações do pacote criado, incluindo o valor total. O usuário ainda precisará informar margem de lucro (uma porcentagem).
Obtenha do usuário também as informações para a criação de uma venda.
Mostre na tela todas as informações da venda, incluindo valor total em dólar e valor em reais (o usuário terá que informar a cotação do dólar no dia).
Recomenda-se o uso de construtores nas classes.*/

        //Pacote de Viagem criado abaixo :
        try ( // TODO code application logic here
                Scanner scanner = new Scanner(System.in)) {
            //Pacote de Viagem criado abaixo :
            System.out.println("Bem vindo ao cadastro de pacotes de viagem\n");
            System.out.println("Digite qual o tipo de transporte deseja\n");
            String transporteTipo = scanner.nextLine();
            System.out.println("Digite valor de custo do transporte(informar em dólar):\n");
            double transporteValor = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Descreva os detalhes da hospedagem :\n");
            String hospedagemDescricao = scanner.nextLine();
            System.out.println("Digite valor da diaria da hospedagem:\n");
            double hospedagemDiaria = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Digite o destino:\n");
            String destinoViagem = scanner.nextLine();
            System.out.println("Digite quantos dias de viagem deseja:\n");
            int quantidadeDias = scanner.nextInt();
            
            Transporte transporte = new Transporte(transporteTipo,transporteValor);
            Hospedagem hospedagem = new Hospedagem(hospedagemDescricao,hospedagemDiaria);
            PacoteViagem pacoteViagem = new PacoteViagem(transporte,hospedagem,destinoViagem,quantidadeDias);
            
            
            
            //Abaixo mostrará todas as informações da viagem que foram respondidas em cima pelo usuario:
            System.out.println("---------------------------------------------\n");
            System.out.println("Detalhes da sua viagem :\n");
            System.out.println("Tipo de transporte escolhido:" + transporte.gettransporteTipo());
            System.out.println("valor do trasporte em dólar:" + transporte.gettransporteValor());
            System.out.println("Descrição:" + hospedagem.gethospedagemDescricao());
            System.out.println("valor da diaria da hospedagem em dólar:" + hospedagem.gethospedagemDiaria());
            System.out.println("Desttino de viagem:" + pacoteViagem.getdestinoViagem());
            System.out.println("Quantidade de dias:" + pacoteViagem.getquantidadeDias());
            System.out.println("Valor total da hospedagem em dolar :" + hospedagem.gettotalHospedagem());
            
            
            //CLASSE VENDA
            System.out.println("------------------------------------------------------------------n");
            System.out.println("----------------CADASTRO DA VENDA-------------------:\n");
            scanner.nextLine();
            System.out.println("Digite Nome do cliente:");
            String clienteNome = scanner.nextLine();
            System.out.println("Forma de pagamento:\n");
            String formaPagamento = scanner.nextLine();
            System.out.println("Digite cotação atual do Dólar:\n");
            double valorDolar;
            valorDolar = scanner.nextDouble();
            String totalDolar;
            String totalReal;
            
            
            Venda venda = new Venda(clienteNome,formaPagamento,pacoteViagem);
            double cotacaoDolar = 0;
            

        venda.conteudoVenda(cotacaoDolar);
        }
        
        
   }  
}
    
