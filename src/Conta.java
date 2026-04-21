public abstract class Conta {
    protected int numero;
    protected String cliente;
    protected double saldo;

    public Conta(int numero, String cliente) {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = 0.0;
    }

    public int getNumero() {
        return numero;
    }

    public String getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
            System.out.println("Depósito realizado.");
        } else {
            System.out.println("Não foi possível realizar o depósito");
        }
    }

    public abstract boolean sacar (double valor);

    public abstract boolean transferir(Conta alvo, double valor);

    public void exibir() {
        System.out.println("Dados da Conta:");
        System.out.println(" - Numero: " + numero);
        System.out.println(" - Cliente: " + cliente);
        System.out.println(" - Saldo: " + saldo);
    }
}
