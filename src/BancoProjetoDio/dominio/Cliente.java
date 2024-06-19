package BancoProjetoDio.dominio;


public class Cliente {

    private String nome;
    private String  cpf;

    public Cliente(String nome,String cpf) {
        this.nome = nome;
        if (cpf == null || !cpf.matches("\\d{11}")) {
            throw new IllegalArgumentException("O CPF deve conter exatamente 11 dígitos numéricos .");
        }
        this.cpf = formatarCPF(cpf);
    }

    private String formatarCPF(String cpf) {
        return cpf.substring(0, 3) + "." +
                cpf.substring(3, 6) + "." +
                cpf.substring(6, 9) + "-" +
                cpf.substring(9, 11);
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}