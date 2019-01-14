package iSoccer;

public class Onibus
{
    private int capacidade;

    public Onibus(int capacidade)
    {
        this.capacidade = capacidade;
    }

    public int getCapacidade() { return capacidade; }

    @Override
    public String toString() { return "Capacidade: " + capacidade + "\n"; }
}
