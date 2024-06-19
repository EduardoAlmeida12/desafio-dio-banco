package BancoProjetoDio.test;

import BancoProjetoDio.dominio.Cliente;
import BancoProjetoDio.dominio.Conta;
import BancoProjetoDio.dominio.ContaCorrente;
import BancoProjetoDio.dominio.ContaPoupanca;

public class TestBanco01 {
    public static void main(String[] args) {
        Cliente cliente1=new Cliente("Eduardo","12345678910");
;
        Cliente cliente2=new Cliente("Matheus","12345678911");
        Conta conta1=new ContaCorrente(cliente1);
        Conta conta2=new ContaPoupanca(cliente2);

        conta1.depositar(100);
        conta1.imprimirExtrato();


        conta2.depositar(200);
        conta2.imprimirExtrato();

        conta2.rendimento();

    }

}
