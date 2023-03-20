package classes;

public class Ponto {

    //as coordenadas seriam int né? ou double?

    /*
    implemente uma classe Ponto que representa um ponto de coordenadas x
    e y. Para esta classe, implemente os métodos que permitem alterar e recuperar as
    coordenadas do ponto (métodos get e set). A classe também deve ser capaz de calcular a
    distância entre dois pontos. Implemente uma classe principal que crie três objetos do
    tipo ponto, modifique os dados dos objetos criados e mostre seus dados.
     */

    /*
    crie uma classe Retangulo que utilize a classe Ponto do exercício anterior.
    A partir dos quatro pontos, a classe Retangulo deve ser capaz de retornar a sua altura e
    largura, além de calcular área e perímetro.
     */

    private int x;
    private int y;

    public Ponto (int coordX, int coordY) {
        this.x = coordX;
        this.y = coordY;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void calcularDistancia() {
        //int distancia = x - y;
    }

    public void imprimirPontos() {
        System.out.println("Coordenada X: " + x);
        System.out.println("Coordenada Y: " + y);
        System.out.println("\n");
    }
}
