package classes;
import java.util.Scanner;
public class Contato {

    //1° cria um package antes de escrever código, aí vc cria as duas classes e vai escrevendo

    /*
   Implemente uma classe Contato que tenha os seguintes dados: nome e
    telefone (String) e os respectivos métodos get e set. Os dois atributos são alteráveis.
    // tem que criar coisa na main pra alterar(?????) perguntar no grupo dos mlks amanhã cedo
    Implemente uma aplicação (uma outra classe que possua um método main) que crie três
    contatos, modifique e exiba os dados dos contatos criados.
    */

    private String nome;
    private String telefone;

    public Contato (String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
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
