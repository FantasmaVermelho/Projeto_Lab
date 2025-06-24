package Senai_LLP_HelloWorld_Notacao_Polonesa;

import java.util.Scanner;
/* 
Calculadora com parâmetros que implemente a Notação Polonesa Reversa (CalculadoraPolonesa.java) que implementes as operações básicas aritméticas (soma, subtração, multiplicação e divisão). 

Exemplo de execução e resultado:

    java 

        CalculadoraPolonesa 4 5 + :: deve retornar o resultado de 4 + 5 = 9
        java CalculadoraPolonesa 7 5 * :: deve retornar o resultado de 7 * 5 = 35
        java CalculadoraPolonesa 3 5 - :: deve retornar o resultado de 3 - 5 = -2
        java CalculadoraPolonesa 10 5 / :: deve retornar o resultado de 10 / 5 = 2

    3. Faça o commit e envie para o Github
    4. Cole o link do repositório do Github na resposta
*/
public class CalculadoraPolonesa {
        @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        double Num1, Num2, Resposta = 0;
        String Operador;

        System.out.println("Digite o valor do primeiro número:");
        Num1 = leia.nextDouble();
        System.out.println("Digite o valor do Segundo número:");
        Num2 = leia.nextDouble();
        System.out.println("Escolha o operador aritmetico (+, -, * ou /):");
        Operador = leia.next();

        switch (Operador) {
            case ("+"):
                Resposta = Num1 + Num2;
                break;
            case ("-"):
                Resposta = Num1 - Num2;
                break;
            case ("*"):
                Resposta = Num1 * Num2;
                break;
            case ("/"):
                Resposta = Num1 / Num2;
                break;
        
            default:
                System.out.println("Operador invalido. Use + - * /");
                break;
        }
        System.out.println(Resposta);

    }
}