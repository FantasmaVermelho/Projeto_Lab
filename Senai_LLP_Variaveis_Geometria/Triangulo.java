package Senai_LLP_Variaveis_Geometria;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Calculadora de Área de Triângulos");
        System.out.println("1 - Triângulo Qualquer (base e altura)");
        System.out.println("2 - Triângulo Equilátero (todos lados iguais)");
        System.out.println("3 - Triângulo Isósceles (dois lados iguais)");
        System.out.println("4 - Triângulo Escaleno (todos lados diferentes)");
        System.out.print("Escolha o tipo de triângulo (1-4): ");
        int tipo = leia.nextInt();
        
        double area = 0;
        
        switch(tipo) {
            case 1: // Triângulo qualquer (base e altura)
                System.out.print("Digite o valor da base: ");
                double base = leia.nextDouble();
                System.out.print("Digite o valor da altura: ");
                double altura = leia.nextDouble();
                area = (base * altura) / 2;
                break;
                
            case 2: // Triângulo equilátero
                System.out.print("Digite o valor do lado: ");
                double lado = leia.nextDouble();
                area = (Math.sqrt(3) / 4) * lado * lado;
                break;
                
            case 3: // Triângulo isósceles
                System.out.print("Digite o valor da base: ");
                base = leia.nextDouble();
                System.out.print("Digite o valor dos lados iguais: ");
                double ladoIgual = leia.nextDouble();
                // Calcula a altura usando teorema de Pitágoras
                altura = Math.sqrt(ladoIgual * ladoIgual - (base * base) / 4);
                area = (base * altura) / 2;
                break;
                
            case 4: // Triângulo escaleno (fórmula de Heron)
                System.out.print("Digite o primeiro lado: ");
                double a = leia.nextDouble();
                System.out.print("Digite o segundo lado: ");
                double b = leia.nextDouble();
                System.out.print("Digite o terceiro lado: ");
                double c = leia.nextDouble();
                // Fórmula de Heron
                double p = (a + b + c) / 2; // semiperímetro
                area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                break;
                
            default:
                System.out.println("Opção inválida!");
                return;
        }
        System.out.printf("Área do triângulo: %.2f\n", area);
    }
}