public abstract class ContaPoupanca extends Conta{

    public ContaPoupanca(int numero, String cliente) {
        super(numero, cliente);
    }

    @Override
    public boolean sacar(double valor) {
        return false;
    }

    @Override
    public boolean transferir(Conta alvo, double valor) {
        return false;
    }
}
