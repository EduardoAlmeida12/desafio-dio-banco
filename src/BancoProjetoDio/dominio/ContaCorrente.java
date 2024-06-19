package BancoProjetoDio.dominio;


public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }

    @Override
    public void rendimento() {
        System.out.println("CONTA SEM RENDIMENTO TIPO DE CONTA: CORRENTE.");
    }

    @Override
    public void juros() {
        System.out.println("---Valor dos juros esse ano: 4.55% Mes: 0,33 ----");
    }

}