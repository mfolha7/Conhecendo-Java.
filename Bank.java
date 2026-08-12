import java.util.Scanner;

public class Bank {
    public static void main(String[] args) throws Exception {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o nome do usuario");
    String nome = sc.nextLine();
    System.out.println("Digite o saldo inicial");
    double valorInicial = sc.nextDouble();
    ContaBancaria usuario1 = new ContaBancaria(nome, valorInicial);
    
    int opcao;
    do {
        System.out.println("Bem vindo ao banco Java, oq voce deseja?");
        System.out.println("1.Depositar");
        System.out.println("2.Sacar");
        System.out.println("3.Consultar saldo");
        System.out.println("0.Sair");
        opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Quanto voce deseja depositar?");
                double valorDeposito = sc.nextDouble();
                usuario1.depositar(valorDeposito);
                
                break;
            case 2:
               System.out.println("Quanto voce deseja sacar?");
               double valorSaque = sc.nextDouble();
               usuario1.sacar(valorSaque);

                break;
            case 3:
                usuario1.exibirSaldo();
                break;
            case 0:
               System.out.println("Encerrando programa...");
                break;
            default:
                System.out.println("Opcao invalida! Tente novamente.");
                break;
        }
    } while (opcao != 0);
    sc.close();

    }
}
