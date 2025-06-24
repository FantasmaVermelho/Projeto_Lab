package Senai_LLP_ArrayList_Estatistica;

import java.util.Scanner;
import java.util.Random;
/* 
ATIVIDADE
1. Crie um repositório no Github  e implemente os algoritmos para (Senai_LLP_ArrayList_Estatistica):
    a) Calcular a média de uma lista
    b) Calcular a moda de uma lista
    c) Calcular o mínimo de uma lista
    d) Calcular o máximo de uma lista
    e) Calcular o desvio padrão da lista

* Faça a entrada de uma quantidade indefinidade de valores, solicitando ao usuário que informe o valor, quando o usuário informar em branco (sem valor) faça os calculos acima. 

* Exemplo: 
    Usuário: 
    informa 10, 
    informa 25, 
    informa 25, 
    informa "" (vazio), 

O programa calcula as estatísticas e retorna: 
    média = 20
    moda =  25
    mínimo = 10
    máximo = 25
    desvio padrão = 7,071
*/
public class array {
        @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Random random = new Random();
        int[] N = new int[25];
        int Media, Moda, Desvio, Cont1 = 0, Cont2 = 0, Contador = 0, Soma = 0;
        // definindo a lista
        for (int i = 0; i <= N.length; i++) {
            N[i] = random.nextInt(i);
            System.out.print(N[i] + " ");
        }
        int Maior = N[0], Menor = N[0];
        
        // Definindo o maior e o menor
        for (int i = 0; i < N.length; i++) {
            // econtrando o valor da moda
            for (int j = 0; j < N.length; j++) {
                if (N[i] == N[j]) {
                    Contador++;
                    Moda = N[i];
                    if (N[i] == N[j]) {
                        
                    }
                    Cont1 = N[i];
                    Cont2 = N[j];
                }
            }
            if (N[i] > Maior) {
                Maior = N[i];
            }
            if (N[i] < Menor) {
                Menor = N[i];
            }
            Soma += N[i];
        }
        Media = Soma / N.length;
        
    }
}