package Senai_LLP_Variaveis_Geometria;

import java.util.Scanner;
// Faça um algoritmo que leia um numero n e imprima os n primeiros termos da serie de fibonacci
public class Circulo {
    @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int Forma;
        double N1, Area, Raio;
        System.out.println("Digite o valor do diametro do círculo: ");
        N1 = leia.nextDouble();
        Raio = N1 / 2;
        Area = 3.14 * (Raio * Raio);
        System.out.println("Area do circulo é: " + Area);

    }
}