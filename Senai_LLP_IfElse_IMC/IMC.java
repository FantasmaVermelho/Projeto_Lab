package Senai_LLP_IfElse_IMC;

import java.util.Scanner;
/* 
Implemente uma aplicação que calcula o Índice de Massa Corporal (IMC)

    Recebe a altura
    Recebe o peso
    Retorna o índice e a interpretação

Interpretação

    Abaixo do peso: IMC menor que 18,5.
    Peso normal: IMC entre 18,5 e 24,9.
    Sobrepeso: IMC entre 25 e 29,9.
    Obesidade: IMC igual ou superior a 30.

Ficar feliz!
*/
public class IMC {
        @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double altura, peso, imc;
        System.out.println("Digite sua altura");
        altura = leia.nextDouble();
        System.out.println("Digite seu peso");
        peso = leia.nextDouble();
        imc = peso / Math.pow(altura, 2);
        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        }
        else if (imc<=24.9) {
            System.out.println("Peso normal");
        }
        else if (imc <= 29.9){
            System.out.println("Sobrepeso");
        }
        else{
            System.out.println("Obesidade");
        }
    }
}