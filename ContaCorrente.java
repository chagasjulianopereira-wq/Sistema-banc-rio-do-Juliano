public class ContaCorrente extends ContaBancaria {

    @Override
    public void sacar(double valor) {
        super.sacar(valor + 1);
    }

}