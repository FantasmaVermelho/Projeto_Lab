package Senai_LLP_Loops_Banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<ContaBancaria> contas;
    
    public Banco() {
        contas = new ArrayList<>();
    }
    
    public void abrirConta(ContaBancaria novaConta) {
        contas.add(novaConta);
        System.out.println("Conta " + novaConta.getNumeroConta() + " aberta com sucesso!");
    }
    
    public ContaBancaria buscarConta(String numero) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumeroConta().equals(numero)) {
                return conta;
            }
        }
        return null;
    }
    
    public void realizarOperacao(String numeroConta, String tipoOperacao, double valor) {
        ContaBancaria conta = buscarConta(numeroConta);
        if (conta == null) {
            System.out.println("Conta não encontrada!");
            return;
        }
        
        switch (tipoOperacao.toLowerCase()) {
            case "depositar":
                conta.depositar(valor);
                break;
            case "sacar":
                conta.sacar(valor);
                break;
            default:
                System.out.println("Operação inválida!");
        }
    }
    
    public void listarContas() {
        System.out.println("\n=== LISTA DE CONTAS ===");
        for (ContaBancaria conta : contas) {
            System.out.println(conta);
        }
        System.out.println("======================");
    }
}