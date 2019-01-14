package iSoccer;

public abstract class Socio
{
    private static int adp = 0;
    private static int ina = 0;

    private String nome;
    private String email;
    private String cpf;
    private String telefone;
    private String endereco;
    private double valor;
    private boolean situacao;

    public Socio(String nome, String email, String cpf, String telefone, String endereco, double valor, boolean situacao)
    {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
        this.valor = valor;
        this.situacao = situacao;
    }

    public String getNome() { return nome; }

    public String getEmail() { return email; }

    public String getCpf() { return cpf; }

    public String getTelefone() { return telefone; }

    public String getEndereco() { return endereco; }

    public double getValor() { return valor; }

    public boolean isSituacao() { return situacao; }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public static int getAdp() { return adp; }
    public static void setAdp(int adp) { Socio.adp = adp; }

    public static int getIna() { return ina; }
    public static void setIna(int ina) { Socio.ina = ina; }

    @Override
    public String toString()
    {
        String str;
        if(situacao) str = "Adimplente";
        else str = "Inadimplente";
        return "Nome: " + nome + "\nEmail: " + email + "\nCPF: " + cpf + "\nTelefone: " + telefone + "\nEndereço: " + endereco + "\nValor: " + valor + "\nSituação: " + str ;
    }
}
