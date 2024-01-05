/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atv1problema1;

import java.util.Scanner;

/**
 *
 * @author Utilizador
 */
public class Atv1Problema1 {
    /*Relativo ao atendimento de eventos, o hotel necessita de uma
funcionalidade que indique qual de seus dois auditórios é o mais
adequado para um evento. O auditório Alfa conta com 150 lugares e
espaço para até 70 cadeiras adicionais. O auditório Beta conta com 350
lugares, sem espaço para mais cadeiras. Desenvolva um programa Java
que receba o número de convidados do evento e faça uma verificação
sobre a quantidade: se for maior que 350 ou se for menor que zero, mostre
a mensagem “Número de convidados inválido”. Se o valor informado é
válido, mostre na tela qual dos auditórios é o mais adequado. No caso do
auditório Alfa, calcule ainda quantas cadeiras adicionais serão
necessárias, observando o limite citado acima.*/

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número de convidados do evento: ");
        int numeroConvidados = scanner.nextInt();
        
        if (numeroConvidados > 350 || numeroConvidados < 0) {
            System.out.println("Número de convidados inválido");
        } else {
            if (numeroConvidados <= 150 ) {
                System.out.println("O auditório Alfa é o mais adequado.");
                }
                if (numeroConvidados <= 220) {
                    int cadeirasAdicionais =  ( numeroConvidados - 150);
                    System.out.println("O auditório Alfa é o mais adequado.");
                    System.out.println("Serão necessárias " + cadeirasAdicionais + " cadeiras adicionais no auditório Alfa.");
            } else {
                System.out.println("O auditório Beta é o mais adequado.");
            }
        }
    }
}
  

