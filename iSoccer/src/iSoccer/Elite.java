package iSoccer;

public class Elite extends Socio
{
    public Elite(String nome, String email, String cpf, String telefone, String endereco, double valor, boolean situacao) { super(nome, email, cpf, telefone, endereco, valor, situacao); }

    @Override
    public String toString() { return "----------------------------------------------------\nSócio Elite\n" + super.toString(); }
}
