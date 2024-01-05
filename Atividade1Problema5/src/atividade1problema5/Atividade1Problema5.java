/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade1problema5;

import java.util.Scanner;

/*. Monte um programa Java que mostre na tela em formato de tabela os
quartos ocupados e os desocupados. Considere que o hotel tem 4
andares e 3 quartos por andar. Primeiro o usuário registrará os quartos
ocupados, informando para cada ocupação o número do apartamento
(andar de 1 a 4 e número de quarto, de 1 a 3). O programa deverá
questionar “Deseja informar outra ocupação? (S/N)” e o usuário poderá
informar quantos quartos quiser, até que responda “N” a essa pergunta.
Em seguida o programa mostrará uma tabela, em que o primeiro andar é
o inferior e o último o superior, marcando com X o quarto ocupado.*/


/**
 *
 * @author Utilizador
 */
public class Atividade1Problema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        boolean[][] occupancy = new boolean[4][3]; // Matriz para armazenar a ocupação dos quartos
        // Registro dos quartos ocupados
        try (Scanner scanner = new Scanner(System.in)) {
            // Registro dos quartos ocupados
            char continueInput;
            do {
                System.out.print("Informe o número do andar (1-4): ");
                int floor = scanner.nextInt();
                
                System.out.print("Informe o número do quarto (1-3): ");
                int room = scanner.nextInt();
                
                // Verificação de validade dos valores fornecidos
                if (floor >= 1 && floor <= 4 && room >= 1 && room <= 3) {
                    occupancy[floor - 1][room - 1] = true; // Marcando o quarto como ocupado
                } else {
                    System.out.println("Andar ou quarto inválido.");
                }
                
                System.out.print("Deseja informar outra ocupação? (S/N): ");
                continueInput = scanner.next().charAt(0);
            } while (Character.toUpperCase(continueInput) == 'S');
        }
        
        // Exibição da tabela de ocupação
        System.out.println("Quartos Ocupados e Desocupados:");
        System.out.println("-----------------------------");
        for (int floor = 3; floor >= 0; floor--) {
            for (int room = 0; room < 3; room++) {
                if (occupancy[floor][room]) {
                    System.out.print("| X ");
                } else {
                    System.out.print("|   ");
                }
            }
            System.out.println("|");
        }
        System.out.println("-----------------------------");
    }
}

