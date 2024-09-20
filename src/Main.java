import java.util.Scanner;

public class Main {
    private static Pessoa obterDados() {
        Pessoa p = new Pessoa();
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o nome : ");
        p.setNome(s.nextLine());
        System.out.print("Digite o CPF : ");
        p.setCpf(s.nextLine());
        System.out.print("Digite a Idade : ");
        p.setIdade(s.nextInt());
        return p;
    }

    private static Pessoa obterDados(Pessoa p) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nome atual : " + p.getNome() + "\nNovo nome : ");
        p.setNome(s.nextLine());
        System.out.print("CPF atual : " + p.getCpf() + "\nNovo CPF : ");
        p.setCpf(s.nextLine());
        System.out.print("Idade atual : " + p.getIdade() + "\nNova idade : ");
        p.setIdade(s.nextInt());
        return p;
    }

    private static boolean verificaPessoa(Pessoa pessoa, int idPessoa) {
        if (pessoa == null) {
            System.out.println("Pessoa " + idPessoa + " ainda não cadastrada, realize o cadastro");
            return false;
        }
        return true;

    }

    public static void main(String[] args) {
        GerenciadorDePessoas gp = new GerenciadorDePessoas();
        Scanner s = new Scanner(System.in);
        int op = 7;
        while (true) {

            System.out.println("\n\n1 - Cadastrar pessoa 1");
            System.out.println("2 - Cadastrar pessoa 2");
            System.out.println("3 - Alterar pessoa 1");
            System.out.println("4 - Alterar pessoa 2");
            System.out.println("5 - Exibir pessoa 1");
            System.out.println("6 - Exibir pessoa 2");
            System.out.println("0 - Sair");
            System.out.print("- > ");
            op = s.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Cadastrar pessoa 1");
                    if (verificaPessoa(gp.getPessoa1(), 1)) {
                        System.out.println("Pessoa já cadastrada, realize alteração.");
                        break;
                    }
                    gp.cadastrarPessoa1(obterDados());
                    break;
                case 2:
                    System.out.println("Cadastrar pessoa 2");
                    if (verificaPessoa(gp.getPessoa2(), 2)) {
                        System.out.println("Pessoa já cadastrada, realize alteração.");
                        break;
                    }
                    gp.cadastrarPessoa2(obterDados());
                    break;
                case 3:
                    System.out.println("Alterar Pessoa 1");
                    if (!verificaPessoa(gp.getPessoa1(), 1))
                        break;
                    gp.atualizarPessoa1(obterDados(gp.getPessoa1()));
                    break;
                case 4:
                    System.out.println("Alterar Pessoa 2");
                    if (!verificaPessoa(gp.getPessoa2(), 2))
                        break;
                    gp.atualizarPessoa2(obterDados(gp.getPessoa2()));
                    break;
                case 5:
                    System.out.println("Exibir pessoa 1");
                    if (!verificaPessoa(gp.getPessoa1(), 1))
                        break;
                    gp.exibirPessoa1();
                    break;
                case 6:
                    System.out.println("Exibir pessoa 2");
                    if (!verificaPessoa(gp.getPessoa2(), 2))
                        break;
                    gp.exibirPessoa2();
                    break;
                case 0:
                    s.close();
                    return;
                default:
                    System.out.println("Selecione uma opção válida");
            }
        }
    }
}
