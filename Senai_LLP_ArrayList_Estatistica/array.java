package Senai_LLP_ArrayList_Estatistica;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> numeros = new ArrayList<>();
        
        System.out.println("Digite os valores (deixe em branco para calcular as estatísticas):");
        
        while (true) {
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                break;
            }
            
            try {
                double numero = Double.parseDouble(input);
                numeros.add(numero);
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido. Digite um número ou deixe em branco para terminar.");
            }
        }
        
        if (numeros.isEmpty()) {
            System.out.println("Nenhum número foi inserido.");
            return;
        }
        
        // Calcula e exibe as estatísticas
        System.out.println("\nResultados:");
        System.out.printf("Média = %.2f%n", calcularMedia(numeros));
        System.out.printf("Moda = %.2f%n", calcularModa(numeros));
        System.out.printf("Mínimo = %.2f%n", calcularMinimo(numeros));
        System.out.printf("Máximo = %.2f%n", calcularMaximo(numeros));
        System.out.printf("Desvio padrão = %.3f%n", calcularDesvioPadrao(numeros));
    }
    
    public static double calcularMedia(ArrayList<Double> numeros) {
        double soma = 0;
        for (double num : numeros) {
            soma += num;
        }
        return soma / numeros.size();
    }
    
    public static double calcularModa(ArrayList<Double> numeros) {
        HashMap<Double, Integer> frequencias = new HashMap<>();
        
        for (double num : numeros) {
            frequencias.put(num, frequencias.getOrDefault(num, 0) + 1);
        }
        
        double moda = numeros.get(0);
        int maxFrequencia = 1;
        
        for (Map.Entry<Double, Integer> entry : frequencias.entrySet()) {
            if (entry.getValue() > maxFrequencia) {
                moda = entry.getKey();
                maxFrequencia = entry.getValue();
            }
        }
        
        return moda;
    }
    
    public static double calcularMinimo(ArrayList<Double> numeros) {
        return Collections.min(numeros);
    }
    
    public static double calcularMaximo(ArrayList<Double> numeros) {
        return Collections.max(numeros);
    }
    
    public static double calcularDesvioPadrao(ArrayList<Double> numeros) {
        double media = calcularMedia(numeros);
        double somaQuadrados = 0;
        
        for (double num : numeros) {
            somaQuadrados += Math.pow(num - media, 2);
        }
        
        double variancia = somaQuadrados / numeros.size();
        return Math.sqrt(variancia);
    }
}