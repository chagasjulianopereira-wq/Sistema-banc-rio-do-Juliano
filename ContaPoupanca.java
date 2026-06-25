public class ContaPoupanca extends ContaBancaria {

    public void renderJuros() {
        setSaldo(getSaldo() * 1.01);
    }

}