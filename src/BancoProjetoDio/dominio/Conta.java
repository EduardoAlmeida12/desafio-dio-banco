package BancoProjetoDio.dominio;


public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }
    @Override
    public void sacar(double valor) throws RuntimeException {
        if(this.saldo<valor){
         throw new RuntimeException("Saldo insuficiente para saque");
        }else{
        this.saldo -= valor;
        }
    }


    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, IConta contaDestino) throws RuntimeException{
        if (this.saldo==0 || this.saldo<valor){
            throw new RuntimeException("Saldo insuficiente para transferencia");
        }else{
        this.sacar(valor);
        contaDestino.depositar(valor);
        }
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        if(this.cliente.getCpf() !=null){
            System.out.println(String.format("CPF: %s", this.cliente.getCpf()));
        }
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}