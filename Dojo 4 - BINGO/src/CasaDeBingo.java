import java.util.ArrayList;
import java.util.Scanner;

public class CasaDeBingo {
    private Sorteador sorteador;
    private Sacola sacola;
    private ArrayList<Jogador> jogadores;

    public CasaDeBingo() {
        this.sorteador = new Sorteador();
        this.sacola = new Sacola();
        this.jogadores = new ArrayList<>();
    }

    // registra jogadores, joga um bingo (rodada eh automatica n eh controlada pelo sorteador), talvez mostra as cartelas da glr?
    public void registraJogadores() {
        Scanner teclado = new Scanner(System.in);
        int numeroDeJogadores;
        System.out.println("Informe o Numero de jogadores:");
        numeroDeJogadores = teclado.nextInt();
        for (int i = 0; i < numeroDeJogadores; i++) {
            int qtdCartelas;
            String nomeJ;
            System.out.println("Informe o nome:");
            nomeJ = teclado.next();

            System.out.println("Informe o número de cartelas:");
            qtdCartelas = teclado.nextInt();
            if (qtdCartelas > 4) {
                System.out.println("O limite de cartelas para cada j eh 4, tente novamente");

                System.out.println("Informe o número de cartelas:");
                qtdCartelas = teclado.nextInt();
            }

            jogadores.add(new Jogador(nomeJ, qtdCartelas));
            System.out.println("Jogador" + jogadores.get(i).getNome() + "registrado com sucesso");
        }
    }

    public void jogarBingo() {
        boolean JogoEncerrado = false;

        while (!JogoEncerrado) {
            int numSorteado = sorteador.sortear();
            System.out.println("Número sorteado: " + numSorteado);
            for(Jogador j : jogadores) {
                j.checaCartela(numSorteado);
                j.cartelaCompleta();
                j.mostrarCartela();
                /*
                for (Cartela c : j.getCartelas()) {
                    c.mostrar();
                }
                */

                if(j.cartelaCompleta()) {
                    JogoEncerrado = true;
                    System.out.println("Bingo! Jogador" + j.getNome() + "venceu o jogo completando uma cartela");
                    break;
                }
            }
        }
    }
}
