package iSoccer;

import java.util.ArrayList;

public class Clube
{
    private String nome = "nulo";
    private double socioju = 0;
    private double sociose = 0;
    private double socioel = 0;
    private ArrayList<Funcionarios> funcionarios = new ArrayList<Funcionarios>();
    private ArrayList<Socio> socios = new ArrayList<Socio>();
    private ArrayList<Estadio> estadios = new ArrayList<Estadio>();
    private ArrayList<Onibus> onibus = new ArrayList<Onibus>();
    private ArrayList<CT> cts = new ArrayList<CT>();

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getSocioju() { return socioju; }
    public void setSocioju(double socioju) { this.socioju = socioju; }

    public double getSociose() { return sociose; }
    public void setSociose(double sociose) { this.sociose = sociose; }

    public double getSocioel() { return socioel; }
    public void setSocioel(double socioel) { this.socioel = socioel; }

    public ArrayList<Funcionarios> getFuncionarios() { return funcionarios; }
    public void setFuncionarios(ArrayList<Funcionarios> funcionarios) { this.funcionarios = funcionarios; }

    public ArrayList<Socio> getSocios() { return socios; }
    public void setSocios(ArrayList<Socio> socios) { this.socios = socios; }

    public ArrayList<Estadio> getEstadios() { return estadios; }
    public void setEstadios(ArrayList<Estadio> estadios) { this.estadios = estadios; }

    public ArrayList<Onibus> getOnibus() { return onibus; }
    public void setOnibus(ArrayList<Onibus> onibus) { this.onibus = onibus; }

    public ArrayList<CT> getCts() { return cts; }
    public void setCts(ArrayList<CT> cts) { this.cts = cts; }

}
