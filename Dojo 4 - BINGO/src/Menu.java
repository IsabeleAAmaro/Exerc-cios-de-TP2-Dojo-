import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private final Scanner teclado;
    private final CasaDeBingo casinha;

    public Menu(){
        this.teclado = new Scanner(System.in);
        this.casinha = new CasaDeBingo();
    }

    public void exibirMenu() {
        int opcao = 0;
        while(opcao < 3) {
            System.out.println("1 - Inserir Jogadores");
            System.out.println("2 - Jogar bingo");
            System.out.println("3 - Mostrar últimos números sorteados");
            System.out.println("4 - Mostrar cartela de jogador x");

            opcao = teclado.nextInt();

            switch (opcao) {
                case 1 -> menuInserirJogadores();
                case 2 -> menuJogarBingo();
            }
        }
    }

    public void menuInserirJogadores() {
        this.casinha.registraJogadores();
    }

    public void menuJogarBingo() {
        this.casinha.jogarBingo();
    }
}
