package DOJO2;
import java.util.Scanner;

public class Menu {

    Scanner input = new Scanner(System.in);
    int tamanho = 40;
    Aluno[] alunos = new Aluno[tamanho];
    Turma turma = new Turma(40);
    int opcao, p = 0, exclusao = 0;

    do {
        System.out.println("Digite a opçao desejada: ");
        System.out.println("1 - Listar Alunos");
        System.out.println("2 - Adicionar um novo aluno");
        System.out.println("3 - Deletar um aluno existente");
        System.out.println("4 - Ler atributos de um aluno");
        System.out.println("5 - Alterar idade de um aluno");
        System.out.println("6 - Listar nota dos alunos");
        System.out.println("7 - Ler nota de aluno?");
        //vou meter essa mesmo
        //case 7: Inserir nota do aluno????? vai depender do numero de avaliações?
        System.out.println("0 - Sair do Sistema");

        opcao = input.nextInt();

        switch (opcao) {
            case 1:
                //t1.listarAlunos();
                System.out.println("Listando alunos:");
                for(int i = 0; i < p; i++) {
                    System.out.println("Detalhes do Aluno: " +
                            "\nNome: " + alunos[i].getNome()
                            + "\nMatricula: " + alunos[i].getMatricula()
                            + "\nIdade: " + alunos[i].getIdade() + "\n");
                }
                break;
            case 2:
                System.out.println("Posiçao de p agora:" + p);
                System.out.println("Adicionando um novo aluno:");
                System.out.println("Insira a matricula do aluno: ");
                String mat = input.next();

                System.out.println("Insira o nome do aluno:");
                String nome = input.next();

                System.out.println("Insira a idade do aluno:");
                int id = input.nextInt();
                alunos[p] = new Aluno(mat, nome, id);
                p++;
                break;
            case 3:
                System.out.println("Informe o número do aluno:");
                exclusao = input.nextInt();
                alunos[exclusao].setNome(null);
                alunos[exclusao].setMatricula(null);
                alunos[exclusao].setIdade(0);
                break;
            case 4:
                int n;
                System.out.println("Informe o número do aluno:");
                n = input.nextInt();
                System.out.println("Insira a matricula do aluno: ");
                alunos[n].setMatricula(input.next());
                System.out.println("Insira o nome do aluno:");
                alunos[n].setNome(input.next());
                System.out.println("Insira a idade do aluno:");
                alunos[n].setIdade(input.nextInt());
                break;
            case 5:
                System.out.println("Informe a posiçao do aluno que deseja alterar a idade: ");
                n = input.nextInt();
                System.out.println("Digite a nova idade do aluno:");
                alunos[n].setIdade(input.nextInt());
                break;
            case 6:
                //t1.listarAlunosEReprovados();
                for(int j = 0; j < tamanho; j++) {
                    if(alunos[j].getAprovadoOuNao() == true) {
                        System.out.println("Detalhes do Aluno n°: " + j+1 +
                                "\nNome: " + alunos[j].getNome()
                                + "\nMatricula: " + alunos[j].getMatricula() +
                                "\n Média final: " + alunos[j].calcularMedia(alunos[j]) +
                                "\nStatus: Aprovado");

                    } else if(alunos[j].getAprovadoOuNao() == false) {
                        System.out.println("Detalhes do Aluno n°: " + j+1 +
                                "\nNome: " + alunos[j].getNome()
                                + "\nMatricula: " + alunos[j].getMatricula() +
                                "\n Média final: " + alunos[j].calcularMedia(alunos[j]) +
                                "\nStatus: Está em prova final");
                    }
                }
                break;
            case 0:
                System.out.println("Encerrando sistema");
                break;
            default:
                System.out.println("Opçao invalida, digite novamente");
                break;
        }
    }while(int opcao != 0);
}
