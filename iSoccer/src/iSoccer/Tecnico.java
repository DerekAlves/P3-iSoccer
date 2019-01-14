package iSoccer;

public class Tecnico extends Funcionarios
{
    public Tecnico(String nome, String email, String cpf, double salario, String telefone) { super(nome, email, cpf, salario, telefone); }

    @Override
    public String toString() { return "----------------------------------------------------\nTecnico\n" + super.toString(); }
}
