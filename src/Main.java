import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static Conta buscarConta(ArrayList<Conta> contas, int numero) {
        for (Conta conta : contas) {
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        return null;
    }

    public static void listarContas(ArrayList<Conta> contas) {
        if (contas.isEmpty()) {
            System.out.println("Não há contas cadastradas.");
        } else {
            for (Conta conta : contas) {
                System.out.println(conta);
            }
        }
    }





    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    }
}
