/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade1problema2;

import java.util.Scanner;


/**
 *
 * @author Utilizador
 */
public class Atividade1Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // TODO code application logic hereimport java.util.Scanner;
       
        Scanner scanner = new Scanner(System.in);

        // Receber o nome e idade do primeiro cliente
        System.out.println("Informe o nome do primeiro cliente:");
        String nomeCliente1 = scanner.nextLine();
        System.out.println("Informe a idade do primeiro cliente:");
        int idadeCliente1 = scanner.nextInt();

        scanner.nextLine(); // Limpar o buffer

        // Receber o nome e idade do segundo cliente
        System.out.println("Informe o nome do segundo cliente:");
        String nomeCliente2 = scanner.nextLine();
        System.out.println("Informe a idade do segundo cliente:");
        int idadeCliente2 = scanner.nextInt();

        // Verificar qual cliente ficará em cada quarto
        double descontoCliente1 = 0;
        double descontoCliente2 = 0;

        if (idadeCliente1 >= 60) {
            descontoCliente1 = 0.4; // Desconto de 40% para clientes idosos
        }

        if (idadeCliente2 >= 60) {
            descontoCliente2 = 0.4; // Desconto de 40% para clientes idosos
        }

        double precoQuartoA = 100; // Preço do quarto A (sem desconto)
        double precoQuartoB = 100; // Preço do quarto B (sem desconto)



        // Exibir informações finais
        System.out.println("------------------------------------");
        System.out.println("Cliente no quarto A: " + nomeCliente1);
        if (descontoCliente1 > 0) {
            System.out.println("Desconto aplicado: " + (descontoCliente1 * 100) + "%");
        }
        System.out.println("------------------------------------");
        System.out.println("Cliente no quarto B: " + nomeCliente2);
        if (descontoCliente2 > 0) {
            System.out.println("Desconto aplicado: " + (descontoCliente2 * 100) + "%");
        }
        System.out.println("------------------------------------");
    }
}

       