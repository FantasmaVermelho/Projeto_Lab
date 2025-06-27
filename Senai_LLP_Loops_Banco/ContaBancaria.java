package Senai_LLP_Loops_Banco;

public class ContaBancaria {
    private String numeroConta;
    private double saldo;
    private String titular;
    
    public ContaBancaria(String numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.0;
    }
    
    // Getters e Setters
    public String getNumeroConta() {
        return numeroConta;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public String getTitular() {
        return titular;
    }
    
    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    // Métodos da conta
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }
    
    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque.");
        }
    }
    
    @Override
    public String toString() {
        return "Conta: " + numeroConta + " | Titular: " + titular + " | Saldo: R$" + saldo;
    }
}   