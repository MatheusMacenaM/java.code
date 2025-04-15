public class Banco {
    public static void main(String[] args) {
        ContaCorrente minhaConta;
        minhaConta = new ContaCorrente(12345, 236);

        minhaConta.depositar(500);
        minhaConta.sacar(100);
        System.out.println("Saldo atual: " + minhaConta.saldo());
    }
}

class ContaCorrente {
    private int agencia;
    private int numero;
    private float saldo;

    public ContaCorrente(int conta, int agencia) {
        this.numero = conta;
        this.agencia = agencia;
        this.saldo = 0;
    }

    public void sacar(float valor) {
        if ((saldo - valor) >= 0)
            saldo = saldo - valor;
        else
            System.out.println("Saldo insuficiente!");
    }

    public void depositar(float valor) {
        if (valor > 0)
            saldo = saldo + valor;
    }

    public float saldo() {
        return saldo;
    }
}