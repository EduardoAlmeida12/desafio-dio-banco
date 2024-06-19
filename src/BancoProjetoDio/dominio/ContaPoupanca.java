package BancoProjetoDio.dominio;


public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupanca ===");
        super.imprimirInfosComuns();
    }

    @Override
    public void rendimento() {
        double valorRendimento=this.saldo*0.0455;
        double valorRendimentioAomes=valorRendimento/12;
        if(this.saldo==0){
            System.out.println("Por favor faca um deposito para seu dinheiro começar a render");
        }else{
            System.out.println("---Valor dos juros esse ano: 4.55% Mes: 0,33 ----");
            System.out.println(String.format("O valor do rendimento da Conta sera : %.2f ao Mes!",valorRendimentioAomes));
            System.out.println(String.format("O valor do rendimento da Conta sera : %.2f ao Ano!",valorRendimento));
        }
    }

    @Override
    public void juros() {
        System.out.println("---Valor dos juros esse ano: 4.55% Mes: 0,33 ----");
    }
}