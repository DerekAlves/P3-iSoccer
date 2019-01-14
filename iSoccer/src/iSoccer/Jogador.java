package iSoccer;

public class Jogador extends Funcionarios
{
    private String tipo;
    private boolean apto;

    public Jogador(String nome, String email, String cpf, double salario, String telefone, String tipo, boolean apto)
    {
        super(nome, email, cpf, salario, telefone);
        this.tipo = tipo;
        this.apto = apto;
    }

    public String getTipo() { return tipo; }

    public boolean isApto() { return apto; }

    public void setApto(boolean apto) { this.apto = apto; }

    @Override
    public String toString()
    {
        String str;
        if(apto) str = "Apto.";
        else str = "Inapto";
        return "----------------------------------------------------\nJogador\n" +  super.toString() + "\nTipo: " + tipo + "\nSituação: " + str;
    }
}
