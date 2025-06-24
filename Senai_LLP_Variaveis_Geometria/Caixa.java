package Senai_LLP_Variaveis_Geometria;

import java.util.Scanner;
// Faça um algoritmo que leia um numero n e imprima os n primeiros termos da serie de fibonacci
public class Caixa {
    @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int Forma;
        double N1, N2, N3, N4, N5, N6, Area, Raio;
        System.out.println("Digite o valor do comprimento de um dos lados: ");
        N1 = leia.nextDouble();
        System.out.println("Digite o valor da altura de um dos lados: ");
        N2 = leia.nextDouble();
        System.out.println("Digite o valor da largura de um dos lados: ");
        N3 = leia.nextDouble();
        // Calculando o comprimento pela largura
        N4 = N1 * N3;
        // Calculando o comprimento pela altura
        N5 = N1 * N2;
        // Calculando o largura pela altura
        N6 = N3 * N2;
        // Calculando a area de todos os lados
        Area = 2 * (N4 + N5 + N6);
        System.out.println("Area da caixa é: " + Area);

    }
}