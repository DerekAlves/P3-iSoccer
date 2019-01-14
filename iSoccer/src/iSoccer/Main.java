package iSoccer;


import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    private static Scanner in =  new Scanner(System.in);
    private static Utilidades utili = new iSoccerU();
    private static Exception exc =  new iSoccerE();

    private static boolean login(Adm admin)
    {
        System.out.print("----------------------------------------------------\n");
        System.out.print("Você não está logado!\n");
        System.out.print("Digite seu login: ");
        String login = in.nextLine();
        System.out.print("Digite sua senha: ");
        String senha = in.nextLine();
        if(login.equals(admin.getLogin())) { return senha.equals(admin.getSenha()); }
        else return false;
    }

    private static void gersoc(Clube clube)
    {
        System.out.print("----------------------------------------------------\n");
        System.out.print("[1] Para editar valores de associação;\n");
        System.out.print("[2] Para criar novo Sócio Torcedor;\n");
        System.out.print("[3] Para alterar dados de Sócio Torcedor;\n");

        int option = exc.loadintmargin(1, 3);
        if(option == 1) utili.criartaxas(clube);
        else if(option == 2) utili.criarsocio(clube);
        else if(option == 3) editsoc(clube.getSocios());

    }

    private static void gerrec(Clube clube)
    {
        System.out.print("----------------------------------------------------\n");
        System.out.print("[1] Para gerenciar Ônibus;\n");
        System.out.print("[2] Para gerenciar Estádio;\n");
        System.out.print("[3] Para gerenciar Centro de Treinamento (CT);\n");

        int option = exc.loadintmargin(1, 3);

        if(option == 1)
        {
            System.out.print("----------------------------------------------------\n");
            System.out.print("Gerenciando Ônibus...\n");
            if(clube.getOnibus().isEmpty()) System.out.print("Não disponível!\n");
            else System.out.printf("Existem %d ônibus disponíveis!\n", clube.getOnibus().size());

            System.out.print("[1] Para adicionar novo ônibus; ");
            option = exc.loadintmargin(0, 1);
            if(option == 1) utili.addonibus(clube.getOnibus());
        }
        else if(option == 2)
        {
            System.out.print("----------------------------------------------------\n");
            System.out.print("Gerenciando Estádio...\n");
            if(clube.getEstadios().isEmpty()) System.out.print("Não Disponível!\n");
            else
            {
                System.out.printf("Existem %d Estádios disponíveis!\n", clube.getEstadios().size());
            }

            System.out.print("[1] Para adicionar novo estádio; ");
            option = exc.loadintmargin(0, 1);
            if(option == 1) utili.addestadio(clube.getEstadios());
        }
        else if(option == 3)
        {
            System.out.print("----------------------------------------------------\n");
            System.out.print("Gerenciando CT...\n");
            if(clube.getCts().isEmpty()) System.out.print("Não Disponível!\n");
            else
            {
                System.out.printf("Existem %d CT's disponíveis!\n", clube.getCts().size());
            }

            System.out.print("[1] Para adicionar novo CT; ");
            option = exc.loadintmargin(0, 1);
            if(option == 1) utili.addct(clube.getCts());
        }
    }

    private static void addfunc(ArrayList<Funcionarios> funcionarios)
    {
        System.out.print("----------------------------------------------------\n");
        utili.printaddf();
        int option = exc.loadintmargin(1, 8);
        if(option == 1)
        {
            Presidente pres = utili.criarpres();
            funcionarios.add(pres);
        }
        else if(option == 2)
        {
            Medico med = utili.criarmed();
            funcionarios.add(med);
        }
        else if(option == 3)
        {
            Tecnico tec = utili.criartec();
            funcionarios.add(tec);
        }
        else if(option == 4)
        {
            Preparador prep = utili.criarprep();
            funcionarios.add(prep);
        }
        else if(option == 5)
        {
            Motorista mot = utili.criarmot();
            funcionarios.add(mot);
        }
        else if(option == 6)
        {
            Cozinheiro coz = utili.criarcoz();
            funcionarios.add(coz);
        }
        else if(option == 7)
        {
            Advogado adv = utili.criaradv();
            funcionarios.add(adv);
        }
        else if(option == 8)
        {
            Jogador jog = utili.criarjog();
            funcionarios.add(jog);
        }
    }

    private static void editjog(ArrayList<Funcionarios> func)
    {
        utili.printalljog(func);
        String busca;
        System.out.print("Digite o cpf do jogador para mudar seu status: ");
        busca = in.nextLine();
        int i = utili.findfunc(func, busca);

        if(i != -1)
        {
            Jogador editar = (Jogador) func.get(i);

            if (func.remove(editar)) {
                System.out.print("Gostaria de mudar a situação do jogador? Apto/Inapto.\n");
                System.out.print("[1] para Apto;\n[2] Para Inapto;\n");
                int option = exc.loadintmargin(1, 2);
                if (option == 1) editar.setApto(true);
                else if (option == 2) editar.setApto(false);

                func.add(editar);
            }
        }
        else System.out.print("Jogador não encontrado!\n");
    }

    private static void editsoc(ArrayList<Socio> soc)
    {
        utili.printsocio(soc);
        System.out.print("Digite o CPF do sócio para editar sua situação: ");
        String busca = in.nextLine();

        int i = utili.findsoc(soc, busca);

        if(i != -1)
        {
            Socio editar = soc.get(i);
            if(soc.remove(editar))
            {
                System.out.print("Gostaria de mudar a situação do Sòcio? Adimplente/Inadimplente\n");
                System.out.print("[1] para Adimplente;\n[2] Para Inadimplente;\n");
                int option = exc.loadintmargin(1, 2);
                if(option == 1) editar.setSituacao(true);
                else if(option == 2) editar.setSituacao(false);

                soc.add(editar);
                System.out.print("Operação Concluída\n");
            }
        }
        else System.out.print("Sócio não encontrado!\n");

        int adp, ina;
        adp = ina = 0;
        for(Socio socio: soc)
        {
            if(socio.isSituacao()) adp++;
            else ina++;
        }

        Socio.setAdp(adp);
        Socio.setIna(ina);
    }

    private static void menu()
    {
        Clube clube = new Clube();
        Adm admin = new Adm("Admin", "0000");
        boolean fi = true;
        boolean exit = false;
        boolean islogged;
        int option;
        while(!exit)
        {
            if(fi)
            {
                fi = false;
                System.out.printf("Primeiro acesso!\nLogin: %s\nSenha: %s\n", admin.getLogin(), admin.getSenha());
                System.out.print("Crie as taxas para Associação de torcedores!\n");
                utili.criartxj(clube);
                utili.criartxs(clube);
                utili.criartxe(clube);
            }
            islogged = login(admin);
            while (islogged)
            {
                System.out.flush();
                utili.printmenu();
                option = exc.loadintmargin(0, 5);
                //in.nextLine();
                if(option == 0) islogged = false;
                else if(option == 1)
                {
                    System.out.print("Digite o novo login: ");
                    admin.setLogin(in.nextLine());
                    System.out.print("Digite a nova senha: ");
                    admin.setSenha(in.nextLine());
                    System.out.print("Operação Concluída\n");
                }
                else if(option == 2)
                {
                    System.out.print("Gerenciar Funcionários!\n");
                    System.out.print("[1] Adicionar novo funcionário;\n");
                    System.out.print("[2] Editar jogador;\n");

                    option = exc.loadintmargin(1, 2);
                    if(option == 1) addfunc(clube.getFuncionarios());
                    else if(option == 2) editjog(clube.getFuncionarios());

                    System.out.print("Operação Concluída\n");
                }
                else if(option == 3)
                {
                    gersoc(clube);
                    System.out.print("Operação Concluída\n");
                }
                else if(option == 4)
                {
                    gerrec(clube);
                    System.out.print("Operação Concluída\n");
                }
                else if(option == 5)
                {
                    System.out.print("----------------------------------------------------\n");
                    System.out.print("Relatórios.\n");
                    System.out.print("[1] Funcionários;\n");
                    System.out.print("[2] Recursos;\n");
                    System.out.print("[3] Sócios;\n");

                    option = exc.loadintmargin(1, 3);
                    if(option == 1) utili.relfunc(clube.getFuncionarios());
                    else if(option == 2) utili.relrec(clube);
                    else if(option == 3) utili.relsoc(clube.getSocios());

                    System.out.print("Operação Concluída\n");

                }
            }
            System.out.print("[0] Sair.\n");
            option = exc.loadintmargin(0, 1);
            if (option == 0) exit = true;
        }
    }


    public static void main(String[] args) { menu(); }
}
