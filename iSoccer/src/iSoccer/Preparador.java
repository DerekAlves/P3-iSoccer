package iSoccer;

public class Preparador extends Funcionarios
{
    public Preparador(String nome, String email, String cpf, double salario, String telefone) { super(nome, email, cpf, salario, telefone); }

    @Override
    public String toString() { return "----------------------------------------------------\nPreparador\n" + super.toString(); }
}
