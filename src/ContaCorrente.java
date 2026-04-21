public abstract class ContaCorrente extends Conta implements ITributavel{
    public ContaCorrente(int numero, String cliente) {
        super(numero, cliente);
    }

    @Override
    public double calcularTributos() {
        return 0;
    }

    @Override
    public boolean sacar (double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido. Tente novamente.");
            return false;
        }

        double taxa = valor * 0.05;
        double valorFinal = valor + taxa;

        if (saldo >= valorFinal) {
            saldo = saldo - valorFinal;
            System.out.println("Saque realizado.");
            return true;
        } else {
            System.out.println("Não foi possível realizar o saque. Saldo Insuficiente.");
            return false;
        }

    }

    @Override
    public boolean transferir(Conta alvo, double valor) {
        return false;
    }
}
