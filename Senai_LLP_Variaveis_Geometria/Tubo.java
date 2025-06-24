package Senai_LLP_Variaveis_Geometria;

import java.util.Scanner;
// Faça um algoritmo que leia um numero n e imprima os n primeiros termos da serie de fibonacci
public class Tubo {
    @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int Forma;
        double N1, N2, Area, Raio;
        System.out.println("Digite o valor do diamtero: ");
        N1 = leia.nextDouble();
        System.out.println("Digite o valor da altura: ");
        N2 = leia.nextDouble();
        Raio = N1 / 2;
        Area = (2 * 3.14) * (Raio * Raio) + N2;
        System.out.println("Area do triângulo é: " + Area);

    }
}