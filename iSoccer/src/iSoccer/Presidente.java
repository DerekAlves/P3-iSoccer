package iSoccer;

import java.util.Scanner;

public class Presidente extends Funcionarios
{
    private Utilidades utili = new iSoccerU();
    private Scanner in = new Scanner(System.in);

    public Presidente(String nome, String email, String cpf, double salario, String telefone) { super(nome, email, cpf, salario, telefone); }

    @Override
    public String toString() { return "----------------------------------------------------\nPresidente\n" + super.toString(); }
}