package iSoccer;

public class Motorista extends Funcionarios
{
    private String habilitacao;
    public Motorista(String nome, String email, String cpf, double salario, String telefone, String habilitacao)
    {
        super(nome, email, cpf, salario, telefone);
        this.habilitacao = habilitacao;
    }

    public String getHabilitacao() { return habilitacao; }

    @Override
    public String toString() { return "----------------------------------------------------\nMotorista\n" + super.toString() + "\nHabilitação: " + habilitacao; }
}
