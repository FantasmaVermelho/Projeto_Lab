package Atividades;

import java.util.Scanner;
/* 
Implemente uma aplicação que retorne a quantidade de dias que há no mês
    Recebe o nome do mês (janeiro, fevereiro, etc) ou o número do mês (1 = janeiro, 2 = fevereiro, etc)
    Retorna a quantidade de dias deste mês
Obs: *Considerar para fevereiro informar o ano e calcular se é bissexto!
*/
public class DiasDoMes {
        @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int Mes, Ano;

        System.out.println("Digite o mês: ");
        System.out.println("1 = Jan, 2 = Fev, 3 = ");
        Mes = leia.nextInt();
        System.out.println("Digite o ano atual: ");
        Ano = leia.nextInt();

        switch (Mes) {
            case 1:
                System.out.println("Você escolheu janeiro, que possui 31 dias no mes");
                break;
            case 2:
                // (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)
                if ((Ano % 4 == 0 && Ano % 100 != 0) || (Ano % 400 == 0)) {
                    System.out.println("Você escolheu fevereiro em ano bissexto, que possui 29 dias no mes");
                }
                else {
                System.out.println("Você escolheu fevereiro, que possui 28 dias no mes");
                
                }
                break;
            case 3:
                System.out.println("Você escolheu março, que possui 31 dias no mes");
                break;
            case 4:
                System.out.println("Você escolheu abril, que possui 30 dias no mes");
                break;
            case 5:
                System.out.println("Você escolheu maio, que possui 31 dias no mes");
                break;
            case 6:
                System.out.println("Você escolheu junho, que possui 30 dias no mes");
                break;
            case 7:
                System.out.println("Você escolheu julho, que possui 31 dias no mes");
                break;
            case 8:
                System.out.println("Você escolheu agosto, que possui 31 dias no mes");
                break;
            case 9:
                System.out.println("Você escolheu setembro, que possui 30 dias no mes");
                break;
            case 10:
                System.out.println("Você escolheu outubro, que possui 31 dias no mes");
                break;
            case 11:
                System.out.println("Você escolheu novembro, que possui 30 dias no mes");
                break;
            case 12:
                System.out.println("Você escolheu dezembro, que possui 31 dias no mes");
                break;
                
            default:
                System.out.println("pane no sistema você me desconfigurou");
                break;
        }
    }
}