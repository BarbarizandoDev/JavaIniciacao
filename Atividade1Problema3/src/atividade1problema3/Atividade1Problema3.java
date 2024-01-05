/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade1problema3;

import java.util.Scanner;

/**
 *
 * @author Utilizador
 */
public class Atividade1Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try ( // TODO code application logic here
                Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o valor padrão da diária: ");
            double valorDiaria = scanner.nextDouble();
            scanner.nextLine(); // Limpar o buffer
            
            int gratuidades = 0;
            int meiasHospedagens = 0;
            double valorTotal = 0;
            
            System.out.println("Digite os nomes dos hóspedes e suas idades (digite 'PARE' para finalizar):");
            while (true) {
                System.out.print("Nome do hóspede: ");
                String nome = scanner.nextLine();
                
                if (nome.equalsIgnoreCase("PARE")) {
                    break;
                }
                
                System.out.print("Idade do hóspede: ");
                int idade = scanner.nextInt();
                scanner.nextLine(); // Limpar o buffer
                
                if (idade < 4) {
                    System.out.println(nome + " possui gratuidade");
                    gratuidades++;
                } else if (idade > 80) {
                    System.out.println(nome + " paga meia");
                    meiasHospedagens++;
                    valorTotal += valorDiaria / 2;
                } else {
                    valorTotal += valorDiaria;
                }
            }
            
            System.out.println("\nResumo:");
            System.out.println("Quantidade de gratuidades: " + gratuidades);
            System.out.println("Quantidade de meias hospedagens: " + meiasHospedagens);
            System.out.println("Valor total: " + valorTotal);
        }
    }
}
