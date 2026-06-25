public class Main {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente();
        cc.setTitular("Juliano");
        cc.depositar(500);

        System.out.println("Titular: " + cc.getTitular());
        System.out.println("Saldo inicial: R$ " + cc.getSaldo());

        cc.sacar(100);

        System.out.println("Saldo após saque: R$ " + cc.getSaldo());

        System.out.println();

        ContaPoupanca cp = new ContaPoupanca();
        cp.setTitular("Pedro");
        cp.depositar(1000);

        System.out.println("Titular: " + cp.getTitular());
        System.out.println("Saldo inicial: R$ " + cp.getSaldo());

        cp.renderJuros();

        System.out.println("Saldo após juros: R$ " + cp.getSaldo());
    }
}
