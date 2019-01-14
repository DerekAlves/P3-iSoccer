package iSoccer;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class iSoccerU implements Utilidades
{
    private Exception exc = new iSoccerE();
    private Scanner in = new Scanner(System.in);
    public void printmenu()
    {
        System.out.print("----------------------------------------------------\n");
        System.out.print("[0] - Para deslogar;\n");
        System.out.print("[1] - Mudar login e senha de administrador;\n");
        System.out.print("[2] - Gerenciar Funcionários;\n");
        System.out.print("[3] - Gerenciar Sócio torcedor;\n");
        System.out.print("[4] - Gerenciar Recursos;\n");
        System.out.print("[5] - Relatórios;\n");
    }

    public void printaddf()
    {
        System.out.print("----------------------------------------------------\n");
        System.out.print("[1] - Para Presidente;\n");
        System.out.print("[2] - Para Médico;\n");
        System.out.print("[3] - Para Técnico;\n");
        System.out.print("[4] - Para Preparador Físico;\n");
        System.out.print("[5] - Para Motorista;\n");
        System.out.print("[6] - Para Cozinheiro;\n");
        System.out.print("[7] - Para Advogado;\n");
        System.out.print("[8] - Para Jogador;\n");
    }

    public Funcionarios criarfunc()
    {
        System.out.print("----------------------------------------------------\n");
        String nome, email, cpf, telefone;
        double salario;
        System.out.print("Digite o nome: ");
        nome = in.nextLine();
        System.out.print("Digite o email: ");
        email = in.nextLine();
        System.out.print("Digite o cpf: ");
        cpf = in.nextLine();
        System.out.print("Digite o Salário:\n");
        salario = exc.loaddouble();
        System.out.print("Digite o telefone: ");
        telefone = in.nextLine();

        return new Funcionarios(nome, email, cpf, salario, telefone);
    }

    public Presidente criarpres()
    {
        System.out.print("----------------------------------------------------\n");
        System.out.print("Criando Presidente...\n");
        Funcionarios func = criarfunc();
        return new Presidente(func.getNome(), func.getEmail(), func.getCpf(), func.getSalario(), func.getTelefone());
    }

    public Medico criarmed()
    {
        System.out.print("----------------------------------------------------\n");
        System.out.print("Criando Médico...\n");
        Funcionarios func = criarfunc();
        System.out.print("Digite o CRM: ");
        return new Medico(func.getNome(), func.getEmail(), func.getCpf(), func.getSalario(), func.getTelefone(), in.nextLine());
    }

    public Tecnico criartec()
    {
        System.out.print("----------------------------------------------------\n");
        System.out.print("Criando Técnico...\n");
        Funcionarios func = criarfunc();
        return new Tecnico(func.getNome(), func.getEmail(), func.getCpf(), func.getSalario(), func.getTelefone());
    }

    public Preparador criarprep()
    {
        System.out.print("----------------------------------------------------\n");
        System.out.print("Criando Preparador...\n");
        Funcionarios func = criarfunc();
        return new Preparador(func.getNome(), func.getEmail(), func.getCpf(), func.getSalario(), func.getTelefone());
    }

    public Motorista criarmot()
    {
        System.out.print("----------------------------------------------------\n");
        System.out.print("Criando Motorista...\n");
        Funcionarios func = criarfunc();
        System.out.print("Digite a Habilitação: ");
        return new Motorista(func.getNome(), func.getEmail(), func.getCpf(), func.getSalario(), func.getTelefone(), in.nextLine());
    }

    public Cozinheiro criarcoz()
    {
        System.out.print("----------------------------------------------------\n");
        System.out.print("Criando Cozinheiro...\n");
        Funcionarios func = criarfunc();
        return new Cozinheiro(func.getNome(), func.getEmail(), func.getCpf(), func.getSalario(), func.getTelefone());
    }

    public Advogado criaradv()
    {
        System.out.print("----------------------------------------------------\n");
        System.out.print("Criando Advogado...\n");
        Funcionarios func = criarfunc();
        return new Advogado(func.getNome(), func.getEmail(), func.getCpf(), func.getSalario(), func.getTelefone());
    }

    public Jogador criarjog()
    {
        System.out.print("----------------------------------------------------\n");
        System.out.print("Criando Jogador...\n");
        Funcionarios func = criarfunc();
        System.out.print("Qual o tipo do jogador?\n[1] Volante;\n[2] Zagueiro;\n[3] Meia;\n[4] Goleiro;\n[5] Atacante;\n[6] Lateral esquerdo;\n[7] Lateral direito.\n");
        int option = exc.loadintmargin(1, 7);
        String tipo = "nula";
        if(option == 1) tipo = "Volante";
        else if(option == 2) tipo = "Zagueiro";
        else if(option == 3) tipo = "Meia";
        else if(option == 4) tipo = "Goleiro";
        else if(option == 5) tipo = "Atacante";
        else if(option == 6) tipo = "Lateral esquerdo";
        else if(option == 7) tipo = "Lateral direito";

        System.out.print("O jogador está apto para jogar?\n[1] Sim;\n[2] Não.\n");
        option = exc.loadintmargin(1, 2);
        boolean boo = false;
        if(option == 1) boo = true;

        return new Jogador(func.getNome(), func.getEmail(), func.getCpf(), func.getSalario(), func.getTelefone(), tipo, boo);
    }

    public void criartxj(Clube clube)
    {
        System.out.print("----------------------------------------------------\n");
        System.out.print("Alterando taxa Júnior.\n");
        System.out.printf("O valor atual é: %f\n", clube.getSocioju());
        System.out.print("Novo valor...\n");
        clube.setSocioju(exc.loaddouble());
    }

    public void criartxs(Clube clube)
    {
        System.out.print("----------------------------------------------------\n");
        System.out.print("Alterando taxa Sênior.\n");
        System.out.printf("O valor atual é: %f\n", clube.getSociose());
        System.out.print("Novo valor...\n");
        clube.setSociose(exc.loaddouble());
    }

    public void criartxe(Clube clube)
    {
        System.out.print("----------------------------------------------------\n");
        System.out.print("Alterando taxa Elite.\n");
        System.out.printf("O valor atual é: %f\n", clube.getSocioel());
        System.out.print("Novo valor...\n");
        clube.setSocioel(exc.loaddouble());
    }

    public void criartaxas(Clube clube)
    {
        System.out.print("----------------------------------------------------\n");
        System.out.print("[1] Alterar taxa de Associação Júnior;\n");
        System.out.print("[2] Alterar taxa de Associação Sênior;\n");
        System.out.print("[3] Alterar taxa de Associação Elite;\n");
        System.out.print("[4] Alterar todas as taxas de Associação;\n");

        int option = exc.loadintmargin(1, 4);

        if(option == 1) criartxj(clube);
        else if(option == 2) criartxs(clube);
        else if(option == 3) criartxe(clube);
        else if(option == 4)
        {
            criartxj(clube);
            criartxs(clube);
            criartxe(clube);
        }

        System.out.print("Deseja Atualizar os valores de todos os Sócios?\n[1] Sim;\n[2] Não;\n");
        option = exc.loadintmargin(1, 2);
        if(option == 1)
        {
            for(Socio soc: clube.getSocios())
            {
                if(soc instanceof Elite) soc.setValor(clube.getSocioel());
                else if(soc instanceof Senior) soc.setValor(clube.getSociose());
                else if(soc instanceof Junior) soc.setValor(clube.getSocioju());
            }
        }
    }

    public void criarsocio(Clube clube)
    {
        String nome, email, cpf, telefone, endereco;
        //double valor;
        System.out.print("Digite o nome: ");
        nome = in.nextLine();
        System.out.print("Email: ");
        email = in.nextLine();
        System.out.print("CPF: ");
        cpf = in.nextLine();
        System.out.print("Telefone: ");
        telefone = in.nextLine();
        System.out.print("Endereço: ");
        endereco = in.nextLine();

        System.out.print("[1] Associação Júnior;\n");
        System.out.print("[2] Associação Sênior;\n");
        System.out.print("[3] Associação Elite;\n");

        int option = exc.loadintmargin(1, 3);

        if(option == 1)
        {
            System.out.printf("Associação Júnior, R$ %.2f.\n", clube.getSocioju());
            Junior novo = new Junior(nome, email, cpf, telefone, endereco, clube.getSocioju(), true);
            clube.getSocios().add(novo);
        }
        else if(option == 2)
        {
            System.out.printf("Associação Sênior, R$ %.2f.\n", clube.getSociose());
            Senior novo = new Senior(nome, email, cpf, telefone, endereco, clube.getSociose(), true);
            clube.getSocios().add(novo);
        }
        else if(option == 3)
        {
            System.out.printf("Associação Elite, R$ %.2f.\n", clube.getSocioel());
            Elite novo = new Elite(nome, email, cpf, telefone, endereco, clube.getSocioel(), true);
            clube.getSocios().add(novo);
        }
        Socio.setAdp(Socio.getAdp() + 1);
    }

    public void addonibus(ArrayList<Onibus> onibus)
    {
        System.out.print("Adicionando Ônibus...\n");
        System.out.print("Digite a capacidade do ônibus: ");
        Onibus novo = new Onibus(exc.loadint());
        onibus.add(novo);
        System.out.print("Adicionado com Sucesso!\n");
    }

    public void addestadio(ArrayList<Estadio> estadios)
    {
        String nome;
        int capacidade, banheiros, lanchonetes;
        System.out.print("Adicionando Estádio...\n");
        System.out.print("Digite o nome do estádio: ");
        nome = in.nextLine();
        System.out.print("Digite a capacidade do estádio: ");
        capacidade = exc.loadint();
        System.out.print("Digite a quantidade de banheiros: ");
        banheiros = exc.loadint();
        System.out.print("Digite a quantidade de lanchonetes: ");
        lanchonetes = exc.loadint();

        Estadio novo = new Estadio(nome, capacidade, banheiros, lanchonetes);
        estadios.add(novo);
        System.out.print("Adicionado com Sucesso!\n");
    }

    public void addct(ArrayList<CT> cts)
    {
        String nome;
        int dormitorios;
        System.out.print("Adicionando CT...\n");
        System.out.print("Digite o nome do CT: ");
        nome = in.nextLine();
        System.out.print("Digite a quantidade de dormitórios: ");
        dormitorios = exc.loadint();

        CT novo = new CT(nome, dormitorios);
        cts.add(novo);
        System.out.print("Adicionado com Sucesso!\n");
    }

    public void relfunc(ArrayList<Funcionarios> func)
    {
        System.out.print("----------------------------------------------------\n");
        System.out.print("Relatório de Funcionários.\n");
        System.out.print("[1] para Relatório do Time;");
        System.out.print("[2] para Relatório de Serviços Gerais;");

        int option = exc.loadintmargin(1, 2);
        if(option == 1) reltime(func);
        else if(option == 2) relserv(func);
    }

    public void relrec(Clube clube)
    {
        System.out.print("----------------------------------------------------\n");
        System.out.print("Relatório de Recursos.\n");
        System.out.print("[1] para Relatório de Transporte;");
        System.out.print("[2] para Relatório de CT;");
        System.out.print("[3] para Relatório de Estádio;");

        int option = exc.loadintmargin(1, 3);
        if(option == 1) reltrans(clube.getOnibus());
        else if(option == 2) relct(clube.getCts());
        else if(option == 3) relest(clube.getEstadios());

    }

    public void relsoc(ArrayList<Socio> soc)
    {
        System.out.print("----------------------------------------------------\n");
        System.out.print("Relatório de Sócios.\n");
        System.out.print("[1] Quantidade;\n");
        System.out.print("[2] Adimplente;\n");
        System.out.print("[3] Inadimplente;\n");
        System.out.print("[4] Lista com dados individudais;\n");

        int option = exc.loadintmargin(1, 4);
        if(option == 1) System.out.printf("Quantidade de Sócios Torcedores: %d\n", soc.size());
        else if(option == 2) System.out.printf("Quantidade de Sócios Adimplentes: %d\n", Socio.getAdp());
        else if(option == 3) System.out.printf("Quantidade de Sócios Inadimplentes: %d\n", Socio.getIna());
        else if(option == 4) printsocio(soc);
    }

    public void reltime(ArrayList<Funcionarios> func)
    {
        System.out.print("----------------------------------------------------\n");
        System.out.print("Relatório de Time.\n");
        System.out.print("[1] Completo;");
        System.out.print("[2] Apto;");
        System.out.print("[3] Inapto;");
        
        int option = exc.loadintmargin(1, 3);
        int i;
        
        if(option == 1) 
        {
            System.out.print("----------------------------------------------------\n");
            System.out.print("Completo!\n");
            for(i = 0; i < func.size(); i++)
            { if( (func.get(i) instanceof Tecnico) || (func.get(i) instanceof Jogador)) System.out.println( (i + 1) + ": " + func.get(i).toString()); }
        }
        else if(option == 2)
        {
            System.out.print("----------------------------------------------------\n");
            System.out.print("Aptos!\n");
            for(i = 0; i < func.size(); i++)
            {
                if((func.get(i) instanceof Jogador ))
                {
                    Jogador print = (Jogador)func.get(i);
                    if(print.isApto()) System.out.println( (i + 1) + ": " + func.get(i).toString());
                }
            }

        }
        else if(option == 3)
        {
            System.out.print("----------------------------------------------------\n");
            System.out.print("Inaptos!\n");
            for(i = 0; i < func.size(); i++)
            {
                if((func.get(i) instanceof Jogador ))
                {
                    Jogador print = (Jogador)func.get(i);
                    if(!print.isApto()) System.out.println( (i + 1) + ": " + func.get(i).toString());
                }
            }
        }
    }

    public void relserv(ArrayList<Funcionarios> func)
    {
        System.out.print("----------------------------------------------------\n");
        System.out.print("Relatório de Serviços Gerais.\n");
        int i;
        for ( i = 0; i < func.size(); i++)
        { if( !(func.get(i) instanceof Tecnico) && !(func.get(i) instanceof Jogador)) System.out.println( (i + 1) + ": " + func.get(i).toString()); }
    }

    public void reltrans(ArrayList<Onibus> onibus)
    {
        System.out.print("----------------------------------------------------\n");
        System.out.print("Relatório de Transporte.\n");
        int i;
        for(i = 0; i < onibus.size(); i++)
        { System.out.println( "Ônibus: " + (i + 1) + " " + onibus.get(i).toString());}

    }

    public void relct(ArrayList<CT> cts)
    {
        System.out.print("----------------------------------------------------\n");
        System.out.print("Relatório de CT's.\n");
        int i;
        for(i = 0; i < cts.size(); i++)
        { System.out.println( (i + 1) + cts.get(i).toString());}

    }

    public void relest(ArrayList<Estadio> est)
    {
        System.out.print("----------------------------------------------------\n");
        System.out.print("Relatório de Estádios.\n");
        int i;
        for(i = 0; i < est.size(); i++)
        { System.out.println( (i + 1) + est.get(i).toString());}

    }

    public void printsocio(ArrayList<Socio> socios)
    {
        System.out.print("----------------------------------------------------\n");
        System.out.print("Listando Sócios...\n");
        int i;
        for(i = 0; i < socios.size(); i++)
        { System.out.println( (i + 1) + ": " + socios.get(i).toString());}
    }

    public void printalljog(ArrayList<Funcionarios> func)
    {
        System.out.print("Listando Jogadores...\n");
        int i;
        for ( i = 0; i < func.size(); i++)
        { if(func.get(i) instanceof Jogador) System.out.println( (i + 1) + ": " + func.get(i).toString()); }
    }

    public int findfunc(ArrayList<Funcionarios> func, String cpf)
    {
        int i;

        for ( i = 0; i < func.size(); i++)
        { if(func.get(i).getCpf().equals(cpf)) return i; }
        return -1;
    }

    public int findsoc(ArrayList<Socio> soc, String cpf)
    {
        int i;

        for ( i = 0; i < soc.size(); i++)
        { if(soc.get(i).getCpf().equals(cpf)) return i; }
        return -1;
    }
}
