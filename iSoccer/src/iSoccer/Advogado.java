package iSoccer;

public class Advogado extends Funcionarios
{
    public Advogado(String nome, String email, String cpf, double salario, String telefone) { super(nome, email, cpf, salario, telefone); }

    @Override
    public String toString() { return "----------------------------------------------------\nAdvogado\n" + super.toString(); }
}
