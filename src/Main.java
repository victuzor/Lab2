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
        public static void calcularTributos(ArrayList <Conta> listaDeContas) {
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

        ArrayList<Conta> listaDeContas = new ArrayList<>();

        int codigoConta = 1001;
        int resposta;

        do {
            System.out.println("-=--=-=-= Interface -=-=-=-=-=");
            System.out.println("1 - Criar Conta");
            System.out.println("2 - Listar Contas");
            System.out.println("3 - Sacar");
            System.out.println("4 - Depositar");
            System.out.println("5 - Transferir");
            System.out.println("6 - Calcular Tributos");
            System.out.println("7 - Finalizar chamado");
            System.out.println("Digite o número correspondente: ");

            resposta = scanner.nextInt();

            switch(resposta) {

                case 1:
                    scanner.nextLine();
                    System.out.println("Nome: ");
                    String nome = scanner.nextLine();

                    System.out.println("Tipo de Conta: 1 - Corrente / 2 - Poupança");
                    int tipoConta = scanner.nextInt();

                    if (tipoConta == 1) {
                        listaDeContas.add(new ContaCorrente(codigoConta, nome));
                        System.out.println("Conta Corrente" + codigoConta + "criada com sucesso ");
                    } else if (tipoConta == 2) {
                        listaDeContas.add(new ContaPoupanca(codigoConta, nome));
                        System.out.println("Conta Poupança" + codigoConta + "criada com sucesso ");
                    } else {
                        System.out.println("Valor Inválido.");
                        break;
                    }
                    codigoConta++;
                    break;

                case 2:
                    listarContas(listaDeContas);
                    break;

                case 3:
                    // implementar saque

                case 4:
                    // implementar deposito

                case 5:
                    // implementar transferencia

                case 6:
                    calcularTributos(listaDeContas);
                    break;

                case 7:
                    System.out.println("Finalizando Chamado...");
                    break;

                default:
                    System.out.println("Valor Inválido.");
            }

        } while (resposta != 7);

        scanner.close();
    }
}
