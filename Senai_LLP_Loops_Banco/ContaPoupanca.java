package Senai_LLP_Loops_Banco;

public class ContaPoupanca extends ContaBancaria {
    private double taxaRendimento;
    
    public ContaPoupanca(String numeroConta, String titular, double taxaRendimento) {
        super(numeroConta, titular);
        this.taxaRendimento = taxaRendimento;
    }
    
    public void aplicarRendimento() {
        double rendimento = getSaldo() * taxaRendimento;
        setSaldo(getSaldo() + rendimento);
        System.out.println("Rendimento de R$" + rendimento + " aplicado na conta.");
    }
    
    @Override
    public String toString() {
        return super.toString() + " | Tipo: Conta Poupança | Taxa de Rendimento: " + (taxaRendimento * 100) + "%";
    }
}