package iSoccer;

public class CT
{
    private String nome;
    private int dormitorios;

    public CT(String nome, int dormitorios)
    {
        this.nome = nome;
        this.dormitorios = dormitorios;
    }

    public String getNome() { return nome; }

    public int getDormitorios() { return dormitorios; }

    @Override
    public String toString() {
        return "CT - " + nome + ", Dormitorios: " + dormitorios;
    }
}
