package iSoccer;

public class Cozinheiro extends Funcionarios
{
    public Cozinheiro(String nome, String email, String cpf, double salario, String telefone) { super(nome, email, cpf, salario, telefone); }

    @Override
    public String toString() { return "----------------------------------------------------\nCozinheiro\n" +  super.toString(); }
}
