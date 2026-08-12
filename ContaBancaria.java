public class ContaBancaria {

    String titular;
    double saldo;

    public ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    void depositar(double valor){
        if (valor>0) {
            this.saldo = this.saldo + valor;
            System.out.println("Deposito de R$"+String.format("%.2f", valor)+" realizado!");
        }else{
            System.out.println("Deposito invalido!");
        }
    }

    void sacar(double valor){
        if (valor <= saldo && valor > 0) {
            this.saldo = this.saldo - valor;
            System.out.println("Saque de R$"+String.format("%.2f", valor)+" realizado!");
        }else if (saldo < valor) {
            System.out.println("Saldo insuficiente!");
        }else{
            System.out.println("Saque invalido");
        }

    }

    void exibirSaldo(){
        System.out.println(titular+", voce tem R$"+String.format("%.2f", saldo)+" em sua conta.");
    }
}
