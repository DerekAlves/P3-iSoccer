package iSoccer;

import java.util.ArrayList;

public interface Utilidades
{
    void printmenu();
    void printaddf();
    Funcionarios criarfunc();
    Presidente criarpres();
    Medico criarmed();
    Tecnico criartec();
    Preparador criarprep();
    Motorista criarmot();
    Cozinheiro criarcoz();
    Advogado criaradv();
    Jogador criarjog();
    void criartxj(Clube clube);
    void criartxs(Clube clube);
    void criartxe(Clube clube);
    void criartaxas(Clube clube);
    void criarsocio(Clube clube);
    void addonibus(ArrayList<Onibus> onibus);
    void addestadio(ArrayList<Estadio> estadios);
    void addct(ArrayList<CT> cts);
    void relfunc(ArrayList<Funcionarios> func);
    void relrec(Clube clube);
    void relsoc(ArrayList<Socio> socios);
    void reltime(ArrayList<Funcionarios> func);
    void relserv(ArrayList<Funcionarios> func);
    void reltrans(ArrayList<Onibus> onibus);
    void relct(ArrayList<CT> ct);
    void relest(ArrayList<Estadio> est);
    void printsocio(ArrayList<Socio> soc);
    void printalljog(ArrayList<Funcionarios> func);
    int findfunc(ArrayList<Funcionarios> func, String cpf);
    int findsoc(ArrayList<Socio> soc, String cpf);
}
