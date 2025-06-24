package Senai_LLP_HashMap_Escolar;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapEscolar {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        // Variáveis
        int qtdAlunos, qtdNotas;
        String nome;
        Map<String, Double[]> alunos = new HashMap<>();

        System.out.println("Digite a quantidade de alunos: ");
        qtdAlunos = leia.nextInt();
        leia.nextLine(); // Consumir a quebra de linha
        
        System.out.println("\nDigite a quantidade de notas por aluno: ");
        qtdNotas = leia.nextInt();
        leia.nextLine(); // Consumir a quebra de linha

        // Cadastro dos alunos e notas
        for (int i = 0; i < qtdAlunos; i++) {
            System.out.print("\nDigite o nome do aluno " + (i + 1) + ": ");
            nome = leia.nextLine();

            Double[] notas = new Double[qtdNotas];
            for (int j = 0; j < qtdNotas; j++) {
                System.out.print("Digite a nota " + (j + 1) + " de " + nome + ": ");
                notas[j] = leia.nextDouble();
                leia.nextLine(); // Consumir a quebra de linha
            }
            
            alunos.put(nome, notas);
        }

        // Processamento e exibição dos resultados
        System.out.println("\n=== Resultados ===");
        for (Map.Entry<String, Double[]> entry : alunos.entrySet()) {
            String aluno = entry.getKey();
            Double[] notas = entry.getValue();
            
            double soma = 0;
            for (double nota : notas) {
                soma += nota;
            }
            double media = soma / notas.length;
            
            String resultado = (media >= 6.0) ? "Aprovado" : "Reprovado";
            
            System.out.printf("%s [%.2f] [%s]\n", aluno, media, resultado);
        }
        
        leia.close();
    }
}