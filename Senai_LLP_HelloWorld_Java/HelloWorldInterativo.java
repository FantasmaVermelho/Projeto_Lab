package Senai_LLP_HelloWorld_Java;

import java.util.Scanner;
// Hello World Avançada com interação (HelloWorldInterativo), que pergunta ao usuário seu nome, ler e imprime "Hello World [nome informado]".
public class HelloWorldInterativo {
    @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String Name;

        System.out.println("Digite o seu nome: ");
        Name = leia.nextLine();

        System.out.println("Hello " + Name);
    }
}