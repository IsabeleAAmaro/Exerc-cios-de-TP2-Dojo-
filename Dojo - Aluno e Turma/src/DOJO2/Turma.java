package DOJO2;

public class Turma {
    private Aluno[] alunos;


    public Turma(int max_alunos) {
        max_alunos = max_alunos;
        alunos = new Aluno[max_alunos];
    }
    public void listarAlunos() {
        //nosso get alunos [emoji com oculos escuro]
        System.out.println("Listando alunos:");
        for(int i = 0; i < alunos.length; i++) {
            if(alunos[i].getMatricula() != null){
                System.out.println("Detalhes do Aluno n°" + i+1 + "\nNome: " + alunos[i].getNome()
                        + "\nMatricula: " + alunos[i].getMatricula()
                        + "\nIdade: " + alunos[i].getIdade() + "\n");
            }
        }
    }

    public void listarAprovadosEReprovados() {
        for(int j = 0; j < alunos.length; j++) {
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
    }
}
