package iSoccer;

public class Funcionarios
{
    protected String nome;
    protected String email;
    protected String cpf;
    protected double salario;
    protected String telefone;

    public Funcionarios(String nome, String email, String cpf, double salario, String telefone)
    {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.salario = salario;
        this.telefone = telefone;
    }

    public  String getNome() { return nome; }

    public String getEmail() { return email; }

    public String getCpf() { return cpf; }

    public double getSalario() { return salario; }

    public String getTelefone() { return telefone; }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() { return "Nome: " + nome + "\nEmail: " + email + "\nCPF: " + cpf + "\nSalário: " + salario + "\nTelefone: " + telefone; }
}



