package Senai_LLP_Loops_Banco;

public class ContaCorrente extends ContaBancaria {
    private double taxaManutencao;
    
    public ContaCorrente(String numeroConta, String titular, double taxaManutencao) {
        super(numeroConta, titular);
        this.taxaManutencao = taxaManutencao;
    }
    
    @Override
    public void sacar(double valor) {
        double valorComTaxa = valor + taxaManutencao;
        if (valor > 0 && getSaldo() >= valorComTaxa) {
            setSaldo(getSaldo() - valorComTaxa);
            System.out.println("Saque de R$" + valor + " realizado com sucesso. Taxa de manutenção: R$" + taxaManutencao);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque. Lembre-se da taxa de manutenção!");
        }
    }
    
    @Override
    public String toString() {
        return super.toString() + " | Tipo: Conta Corrente | Taxa de Manutenção: R$" + taxaManutencao;
    }
}