package iSoccer;

public class Medico extends Funcionarios
{
    private String crm;

    public Medico(String nome, String email, String cpf, double salario, String telefone, String crm)
    {
        super(nome, email, cpf, salario, telefone);
        this.crm = crm;
    }

    public String getCrm() { return crm; }

    @Override
    public String toString() { return "----------------------------------------------------\nMédico\n" +  super.toString() + "\nCRM: " + crm; }
}
