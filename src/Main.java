import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static Conta buscarConta(ArrayList<Conta> listaDeContas, int numero) {
        for (Conta conta : listaDeContas) {
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        return null;
    }

    public static void listarContas(ArrayList<Conta> listaDeContas) {
        if (listaDeContas.isEmpty()) {
            System.out.println("Não há contas cadastradas.");
        } else {
            for (Conta conta : listaDeContas) {
                conta.exibir();
            }
        }
    }
        public static void calcularTributos(ArrayList < Conta > listaDeContas) {
            double total = 0;

            for (Conta conta : listaDeContas) {
                if (conta instanceof ITributavel) {
                    ITributavel contaTributavel = (ITributavel) conta;

                    total += contaTributavel.calculaTributos();
                }
            }
            System.out.println("\n========================================");
            System.out.println("Total de tributos a recolher: R$ " + total);
            System.out.println("========================================");
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    }
}
