package Senai_LLP_Switch_DiasDoMes;

import java.util.Scanner;
/* Implemente uma aplicação que retorne a quantidade de dias que há no mês
    a. Recebe o nome do mês (janeiro, fevereiro, etc) ou o número do mês (1 = Janeiro, 2 = Fevereiro, etc)
    b. Retorna a quantidade de dias deste mês
    c. Obs *Considerar para Fevereiro informar o ano e calcular se é bissexto
*/
public class Meses {
    @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        // Variaveis
        int Mes, Ano;

        // Leitura de dados
        System.out.println("Digite o ano:");
        Ano = leia.nextInt();
        System.out.println("Digite o mês" + "\n" + "Digite um número negativo para finalizar o programa" + "\n" + "(1 = Jan, 2 = Fev, 3 = Mar, 4 = Abr, 5 = Mai, 6 = Jun, 7 = Jul, 8 = Ago, 9 = Set, 10 = Out, 11 = Nov, 12 = Dez.): ");
        Mes = leia.nextInt();
        while (Mes >= 0) {
            switch (Mes) {
            case 1:
                System.out.println("Janeiro tem 31 dias" + "\n");
                break;
            case 2:
                if ((Ano % 4 == 0 && Ano % 100 != 0) || (Ano % 400 == 0)) {
                    System.out.println("Por "+ Ano + " ser um ano bissexto, então Fevereiro tem 29 dias" + "\n");
                } else {
                    System.out.println("Fevereiro tem 28 dias" + "\n");
                }
                break;
            case 3:
                System.out.println("Março tem 31 dias" + "\n");
                break;
            case 4:
                System.out.println("Abril tem 30 dias" + "\n");
                break;
            case 5:
                System.out.println("Maio tem 31 dias" + "\n");
                break;
            case 6:
                System.out.println("Junho tem 30 dias" + "\n");
                break;
            case 7:
                System.out.println("Julho tem 31 dias" + "\n");
                break;
            case 8:
                System.out.println("Agosto tem 30 dias" + "\n");
                break;
            case 9:
                System.out.println("Setembro tem 30 dias" + "\n");
                break;
            case 10:
                System.out.println("Outubro tem 31 dias" + "\n");
                break;
            case 11:
                System.out.println("Novembro tem 30 dias" + "\n");
                break;
            case 12:
                System.out.println("Dezembro tem 31 dias" + "\n");
                break;
            default:
                break;
            }
            System.out.println("Digite um número negativo para finalizar o programa" + "\n" + "(1 = Jan, 2 = Fev, 3 = Mar, 4 = Abr, 5 = Mai, 6 = Jun, 7 = Jul, 8 = Ago, 9 = Set, 10 = Out, 11 = Nov, 12 = Dez.)" + "\n" +  "Digite o mês: ");
            Mes = leia.nextInt();
        }
        System.out.println("Programa encerrado.");
    }
}