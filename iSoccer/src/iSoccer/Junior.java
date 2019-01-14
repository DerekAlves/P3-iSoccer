package iSoccer;

public class Junior extends Socio
{
    public Junior(String nome, String email, String cpf, String telefone, String endereco, double valor, boolean situacao) { super(nome, email, cpf, telefone, endereco, valor, situacao); }

    @Override
    public String toString() { return "----------------------------------------------------\nSócio Júnior\n" + super.toString(); }
}
