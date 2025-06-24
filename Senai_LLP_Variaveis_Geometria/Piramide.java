package Senai_LLP_Variaveis_Geometria;

import java.util.Scanner;

public class Piramide {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Calculadora de Área de Pirâmide");
        System.out.println("1 - Pirâmide Quadrada");
        System.out.println("2 - Pirâmide Triangular");
        System.out.println("3 - Pirâmide Pentagonal");
        System.out.print("Escolha o tipo de pirâmide (1-3): ");
        int tipo = leia.nextInt();
        
        double areaBase = 0;
        double areaLateral = 0;
        
        switch(tipo) {
            case 1: // Pirâmide Quadrada
                System.out.print("Digite o lado da base: ");
                double lado = leia.nextDouble();
                System.out.print("Digite o apótema da pirâmide: ");
                double apotema = leia.nextDouble();
                
                areaBase = lado * lado;
                areaLateral = 4 * (lado * apotema / 2);
                break;
                
            case 2: // Pirâmide Triangular
                System.out.print("Digite o lado da base: ");
                lado = leia.nextDouble();
                System.out.print("Digite o apótema da pirâmide: ");
                apotema = leia.nextDouble();
                
                areaBase = (Math.sqrt(3)/4) * lado * lado;
                areaLateral = 3 * (lado * apotema / 2);
                break;
                
            case 3: // Pirâmide Pentagonal
                System.out.print("Digite o lado da base: ");
                lado = leia.nextDouble();
                System.out.print("Digite o apótema da base: ");
                double apotemaBase = leia.nextDouble();
                System.out.print("Digite o apótema da pirâmide: ");
                apotema = leia.nextDouble();
                
                areaBase = (5 * lado * apotemaBase) / 2;
                areaLateral = 5 * (lado * apotema / 2);
                break;
                
            default:
                System.out.println("Opção inválida!");
                return;
        }
        
        double areaTotal = areaBase + areaLateral;
        System.out.printf("Área da base: %.2f\n", areaBase);
        System.out.printf("Área lateral: %.2f\n", areaLateral);
        System.out.printf("Área total da pirâmide: %.2f\n", areaTotal);
    }
}