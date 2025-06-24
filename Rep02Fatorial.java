import java.util.Scanner;
/* Criar um algoritmo que leia vários números inteiros e apresente o fatorial de cada número.
O algoritmo se encerra quando se digita um número menor do que 1. */
public class Rep02Fatorial {
        @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int Num;
        
        System.out.println("Calculadora de Fatorial \n");
        System.out.println("Digite um numero inteiro\n(ou digite um número negativo para encerrar a calculadora): ");
        Num = leia.nextInt();   

        while (Num >= 1) {
            int Fat = 1; // Reinicia o Fat para cada número novo
            
            // Calcula o fatorial (de 1 até Num)
            for (int i = 1; i <= Num; i++) {
                Fat *= i;
            }
            System.out.println("O fatorial de " + Num + "! é: " + Fat);
            System.out.println("\nDigite outro numero\n(ou digite um número negativo para encerrar a calculadora):");
            Num = leia.nextInt();
        }
        System.out.println("Calculadora encerrada.");
    }
}