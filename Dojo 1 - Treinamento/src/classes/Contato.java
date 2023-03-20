package classes;
public class Contato {

    //1° cria um package antes de escrever código, aí vc cria as duas classes e vai escrevendo

    /*
   Implemente uma classe Contato que tenha os seguintes dados: nome e
    telefone (String) e os respectivos métodos get e set. Os dois atributos são alteráveis.
    Implemente uma aplicação (uma outra classe que possua um método main) que crie três
    contatos, modifique e exiba os dados dos contatos criados.
    */

    public String nome;
    public String telefone;

    public Contato (String n, String t) {
        this.nome = n;
        this.telefone = t;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome(String nome) {
        return nome;
    }

    public String getTelefone(String telefone) {
        return telefone;
    }

    public void imprimirContatos() {
        System.out.println("-*-*-*-*-* Contato -*-*-*-*-*");
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("\n");
    }
}
