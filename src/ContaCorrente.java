public class ContaCorrente extends Conta implements ITributavel {
    public ContaCorrente(int numero, String cliente) {
        super(numero, cliente);
    }

    @Override
    public double calculaTributos() {
        return saldo * 0.01;
    }

    @Override
    public boolean sacar(double valor) {
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
        if (alvo == null) {
            System.out.println("Transferência inválida.");
            return false;
        }

        if (sacar(valor)) {
            alvo.depositar(valor);
            System.out.println("Transferência bem sucedida.");
            return true;
        } else {
            System.out.println("Transferência mal sucedida.");
            return false;
        }
    }
    @Override
    public void exibir() {
        System.out.println("Conta Corrente:");
        System.out.println(" - Numero: " + numero);
        System.out.println(" - Cliente: " + cliente);
        System.out.println(" - Saldo: " + saldo);
    }
}

