package classes;

import java.awt.event.ContainerAdapter;

public class Main {
    public static void main(String[] args) {
        /*
   Implemente uma classe Contato que tenha os seguintes dados: nome e
    telefone (String) e os respectivos métodos get e set. Os dois atributos são alteráveis.
    Implemente uma aplicação (uma outra classe que possua um método main) que crie três
    contatos, modifique e exiba os dados dos contatos criados.
    */
        Contato c1, c2, c3;

        c1 = new Contato("Henrique", "55555");
        c2 = new Contato("José", "778887");
        c3 = new Contato("Zé Rick", "372647");

        c1.setNome("Vauhalla");
        c1.imprimirContatos();

        c2.setTelefone("999999");
        c2.imprimirContatos();

        c3.setTelefone("673552");
        c3.imprimirContatos();

        // -----------------------------------

        Ponto p1, p2, p3;

        p1 = new Ponto(6, 6);
        // a, b
        p2 = new Ponto(4, 3);
        // c, d
        p3 = new Ponto(7, 8);
        // e, f

    }
}
