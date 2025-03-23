public class Conta {
    private double saldo;
    public Conta (double saldoInicial) {
        if (saldoInicial > 0.0)
            saldo = saldoInicial;
        else
            saldo = 0.0;
    }
    public double getSaldo() {
        return saldo;
    }
    public void creditar (double quantia) {
        saldo += quantia;
    }
    public void debitar (double quantia) {
        if(quantia > saldo) {
            System.out.println("Quantia de debito excedeu o saldo da conta");
        } else {
            saldo -= quantia;
            System.out.println("R$" + quantia + " foram debitados da sua conta");
            System.out.println("Novo saldo: " + getSaldo());
        }
    }
}