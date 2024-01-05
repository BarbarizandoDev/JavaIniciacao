
package atividade4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atividade4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome da empresa:");
        String nomeEmpresa = scanner.nextLine();

        Pagamentos pagamentos = new Pagamentos(nomeEmpresa);

        System.out.println("Cadastro de Impostos:");
        while (true) {
            System.out.println("Informe o tipo de imposto (PIS ou IPI) ou 'pare' para encerrar:");
            String tipoImposto = scanner.nextLine();

            if (tipoImposto.equalsIgnoreCase("pare")) {
                break;
            }
            
            if (tipoImposto.equalsIgnoreCase("PIS")) {
                System.out.println("Informe o valor total de débito:");
                double debito = scanner.nextDouble();
                System.out.println("Informe o valor total de crédito:");
                double credito = scanner.nextDouble();
                scanner.nextLine(); // Limpar o buffer

                Imposto pis = new PIS(debito, credito);
                pagamentos.adicionarImposto(pis);
            } else if (tipoImposto.equalsIgnoreCase("IPI")) {
                System.out.println("Informe o valor do produto:");
                double valor = scanner.nextDouble();
                System.out.println("Informe o valor do frete:");
                double frete = scanner.nextDouble();
                System.out.println("Informe o valor do seguro:");
                double seguro = scanner.nextDouble();
                System.out.println("Informe o valordo outras despesas:");
                double outrasDespesas = scanner.nextDouble();
                System.out.println("Informe a alíquota:");
                double aliquota = scanner.nextDouble();
                scanner.nextLine(); // Limpar o buffer
                
                 Imposto ipi = new IPI(valor, frete, seguro, outrasDespesas, aliquota);
                pagamentos.adicionarImposto(ipi);
            } else {
                System.out.println("Tipo de imposto inválido. Tente novamente.");
            }
        }

        System.out.println("\nResumo dos Pagamentos:");
        System.out.println("Empresa: " + pagamentos.getNomeEmpresa());

        for (Imposto imposto : pagamentos.getImpostos()) {
            double valorImposto = imposto.calcularImposto();
            String descricaoImposto = imposto.getDescricao();
            System.out.println("Imposto: " + descricaoImposto + ", Valor: " + valorImposto);
        }

        double totalImpostos = pagamentos.calcularTotalImpostos();
        System.out.println("Total de impostos a serem pagos: " + totalImpostos);
    }
}
