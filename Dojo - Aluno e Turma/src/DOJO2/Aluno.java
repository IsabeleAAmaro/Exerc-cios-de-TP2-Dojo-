package DOJO2;

public class Aluno {
        private String matricula;
        private String nome;
        private int idade;
        private Prova[] avaliacoes;
        private Boolean aprovadoOuNao;

        //private int qtdAvaliacoes;
        //nao precisa criar uma variavel pra isso, chama a função do tamanho do array

        /*  Um Aluno deve ter uma lista (vetor) de avaliações do tipo Prova. O Aluno deve ser
        capaz de calcular a sua média e saber se está em prova final.

        "deve ser capaz de calcular sua média" implica que eu informo um aluno especifico
        e retorna a média DELE então


        Seu programa deve interagir com o usuário para informar as notas de todos os
        alunos cadastrados. Considerando quem ficou em prova final ou não.
         */

    //pra puxar a nota do aluno, chama o get do atributo float tipo Prova[x].getNota
    // quem seta a nota? o user input?
    // fazer metodo para calcular média aqui, puxando nota do provas, talvez um for p?
    // pra puxar todas as posições e somar o prova[x].getNota?

    //puxa a nota da prova do aluno, puxando 3 coisas, 3 pontinhos
    // a1.Prova[x].nota???
    // como se calcula uma media: soma as notas e divide pela quantidade de avaliações
    //entao aqui vai ser puxando as notas (a1.avaliacoes[i].float) num somatório e
    // e dps dividindo pela quantidade de avaliações, q é o tamanho do array?
    //deveria ser o tamanho do array, porque o array sao várias PROVAS e cada objeto prova
    // tem 1 nota individual

    public float calcularMedia(Aluno a1) {
        float media;
        float somatorio = 0;
        for(int i = 0; i < avaliacoes.length; i++) {
          somatorio = somatorio + a1.avaliacoes[i].getNota();
        }
        media = somatorio / avaliacoes.length;
        return media;
    }

    //sobre um role de listar notas da turma, e dizer quem está na prova final.
    // faz um if verificando a média (puxando pelo metodo de calcular? q nem a gente fez com
    // o tamanho da reta? pra mim faz sentido pq a principal funcao do metodo é retornar isso
    // será que o metódo de listar as notas não deveria ficar em responsabilidade da turma?
    //como separar os q passaram dos q nao passaram? pra puxar lá no método de listagem?


    public void listarNotas (Aluno a1) {

        //agora pra listarrrr msm eu acho q tinha que se inspirar no for q a gente criou na main
        //q é um for per
        //"Seu programa deve interagir com o usuário para informar as notas de todos os
        //alunos cadastrados. Considerando quem ficou em prova final ou não."
        //^ Pra mim, isso implica que a lista de alunos passados ou nao seria na main
        // just in case, vou fazer nos dois
        // realmente eu acho que preciso criar uma variavel, um boolean, qualquer coisa assim
        // pra diferenciar os reprovados

        if(calcularMedia(a1) < 7.0) {
            a1.setAprovadoOuNao(false);
            //será que não poderia ser um boolean, que nem foi com a verificacao do retangulo?
            //passouOuNao = true if media > 7.0 else false
        } else {
            a1.setAprovadoOuNao(true);
        }

        // pela condição de ter q contabilizar o número de alunos pra listar com um for
        // a listagem real vai ser na main/na classe turma
    }

    public Prova[] getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(Prova[] avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public Aluno (String matricula, String nome, int idade) {
            this.matricula = matricula;
            this.nome = nome;
            this.idade = idade;
        }

        @Override
        public String toString() {
            return "Nome: " + nome + "Matrícula: " + matricula + "Idade: " + idade;
        }

        public String getMatricula() {
            return matricula;
        }

        public void setMatricula(String matricula) {
            this.matricula = matricula;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

        public void exibirDadosAluno (Aluno a1) {
            System.out.println("-*-*-*-*" + "Aluno" + a1.nome + "-*-*-*-*");
            System.out.println("Matrícula: " + a1.matricula);
            System.out.println("Idade: " + a1.idade);
        }

        public void alterarIdadeAluno(Aluno a1, int idade) {
            this.idade = a1.idade;
        }

    public Boolean getAprovadoOuNao() {
        return aprovadoOuNao;
    }

    public void setAprovadoOuNao(Boolean aprovadoOuNao) {
        this.aprovadoOuNao = aprovadoOuNao;
    }
}