import java.util.ArrayList;

public class Jogador {
    private String nome;
    private int numeroDeCartelas;
    private ArrayList<Cartela> cartelas;

    public Jogador(String nome, int numeroCartelas) {
        this.nome = nome;
        this.numeroDeCartelas = numeroCartelas;
        this.cartelas = new ArrayList<>();


        for (int i = 0; i < numeroCartelas; i++) {
            this.cartelas.add(new Cartela());
        }
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroDeCartelas() {
        return numeroDeCartelas;
    }

    public ArrayList<Cartela> getCartelas() {
        return cartelas;
    }

    public void checaCartela(Integer numero) {
        for (Cartela c : cartelas) {
            if (c.estaPresente(numero)) {
                c.marcarNumero(numero);
                System.out.println("Jogador " + this.nome + "marcou nesta cartela: ");
                c.mostrar();
                //posso colocar alguma coisa aqui q imprime em qual cartela foi marcado???
            }
        }
    }

    public void linhasCompletas() {
        //boolean resultado = false;
        for (Cartela cartela : cartelas) {
            cartela.verificarLinha();
            if (cartela.verificarLinha()) {
                System.out.println("Jogador " + this.nome + "completou uma linha na cartela");
                //resultado = true;
            }
        }
        //return resultado;
    }

    public void colunasCompleta() {
        //boolean resultado = false;
        for (Cartela cartela : cartelas) {
            cartela.verificarColuna();
            if (cartela.verificarColuna()) {
                System.out.println("Jogador " + this.nome + "completou uma coluna na cartela");
                //resultado = true;
            }
        }
        //return resultado;
    }

    public boolean cartelaCompleta() {
        boolean r = false;
        for (Cartela cartela : cartelas) {
            cartela.verificarColuna();
            if (cartela.verificarCartela()) {
                r = true;
            }
        }
        return r;
    }

    public void mostrarCartela() {
        System.out.println("Cartela(s) do jogador: " + this.nome);
        for(int i = 0; i < numeroDeCartelas; i++) {
            this.getCartelas().get(i).mostrar();
        }
    }
}
