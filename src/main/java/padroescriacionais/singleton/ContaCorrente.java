package padroescriacionais.singleton;

public class ContaCorrente {
    private String numeroConta;
    private static ContaCorrente contaCorrente;

    private ContaCorrente() {
    }

    public static ContaCorrente newInstance() {
        if(contaCorrente == null) {
            contaCorrente = new ContaCorrente();
        }
        return contaCorrente;
    }


    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    @Override
    public String toString() {
        return numeroConta;
    }
}
