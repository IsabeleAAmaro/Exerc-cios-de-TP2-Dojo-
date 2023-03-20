import java.util.ArrayList;
import java.util.Arrays;

public class Cartela {
    private String[][] numeros = new String[5][5];
    //porque?
    private ArrayList<Integer> marcados = new ArrayList<>();
    //AAAAAAAAAAAAAAA

    public Cartela() {
        int linha = 0, coluna = 0;
        for (int i = 0; i < 25;) {
            int aleatorio = (int) (Math.random() * 75) + 1;
            if (estaPresente(aleatorio)) continue;
            i++;
            numeros[linha][coluna] = String.valueOf(aleatorio);
            coluna++;
            if (coluna == 5) { coluna = 0; linha++; }
        }
    }

    public boolean estaPresente(int n) {
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                if (String.valueOf(n).equals(numeros[i][j]))
                    return true;
        return false;
    }
    //??????????????????????????????????
    public boolean marcarNumero(int numeroIguess) {
        if(estaPresente(numeroIguess)) {
            marcados.add(numeroIguess);
            return true;
        }
        return false;
    }

    public void mostrar() {
        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                System.out.print(this.numeros[linha][coluna] + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
    }

    public boolean verificarLinha() {
            for (int i = 0; i < 5; i++) {
                int Nmarcados = 0;
                for (int j = 0; j < 5; j++) {
                    if (marcados.contains(Integer.parseInt(numeros[i][j]))) {
                        Nmarcados++;
                    }
                }
                if (Nmarcados == 5) {
                    return true;
                }
            }
        return false;
    }

    public boolean verificarColuna() {
            for (int i = 0; i < 5; i++) {
                int Nmarcados = 0;
                for (int j = 0; j < 5; j++) {
                    if (marcados.contains(Integer.parseInt(numeros[i][j]))) {
                        Nmarcados++;
                    }
                }
                if (Nmarcados == 5) {
                    return true;
                    //acho que vai dar ok independente de ser td na msm linha, se eu acertar 5 dá ok do msm jeito
                }
            }
        return false;
    }

    public boolean verificarCartela() {
        int Nmarcados = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (marcados.contains(Integer.parseInt(numeros[i][j]))) {
                    Nmarcados++;
                }
            }
            if (Nmarcados == 25) {
                return true;
            }
        }
        return false;
    }

}
