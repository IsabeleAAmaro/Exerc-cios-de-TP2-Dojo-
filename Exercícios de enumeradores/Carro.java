package classes;

public class Carro {

    private boolean farolLigado;
    private Fabricante fabricante;

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void ligarFarol() {
        /*
        if(!estaDeDia()) {
        farolLigado = true

        }
        */

    }

    public Carro(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public static String tracaoCarro() {
        return "Dianteira";
    }
}
