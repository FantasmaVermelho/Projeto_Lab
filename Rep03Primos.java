import java.util.Scanner;
/* 
Escrever um algoritmo que receba vários números inteiros e imprima a quantidade de números primos dentre os números que foram digitados. O algoritmo acaba quando se digita um número menor ou igual a 0.
*/
public class Rep03Primos {
        @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int Primo, ContadorPrimo = 0;

        System.out.println("Digite o valor que seja positivo:");
        Primo = leia.nextInt();

        while (Primo > 0) {
            for (int i = 1; i <= Primo; i++) {
                if (Primo%i==0) {
                    ContadorPrimo++;
                }
            }
            System.out.println("O número " + Primo + " tem " + ContadorPrimo + " números primos");
            System.out.println("\n");
            System.out.println("Deseja conferir quantos números primos existem em um outro número positivo? ");
            Primo = leia.nextInt();
        }
    }
}