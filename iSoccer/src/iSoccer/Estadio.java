package iSoccer;

public class Estadio
{
    private String nome;
    private int capacidade;
    private int banheiros;
    private int lanchonetes;

    public Estadio(String nome, int capacidade, int banheiros, int lanchonetes)
    {
        this.nome = nome;
        this.capacidade = capacidade;
        this.banheiros = banheiros;
        this.lanchonetes = lanchonetes;
    }

    public String getNome() { return nome; }

    public int getCapacidade() { return capacidade; }

    public int getBanheiros() { return banheiros; }

    public int getLanchonetes() { return lanchonetes; }

    @Override
    public String toString() {
        return "Estádio - " + nome + ", Capacidade: " + capacidade + ", Banheiros: " + banheiros + ", Lanchonetes: " + lanchonetes + "\n";
    }
}
