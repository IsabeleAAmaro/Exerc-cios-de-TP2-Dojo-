package classes;

public class Ponto {

    //as coordenadas seriam int né? ou double?

    /*
         - a distancia na questao 2 eh entre um ponto (q tem x e y) para o outro (q tem x e y)
         - metodo para formula da hipotenusa do triangulo
         - n eh pra ser estatico  // ?????? SERÁ QUE ESTOU MALUCA eu nao teria anotado se o professor
            nao tivesse falado
         - na terceira questao, tem um metodo pra checar se os pontos formam um angulo reto,
         por eh retangulo deitado q eh formado por 4 coordenadas q juntas formam esses angulos
    */

    /*
    implemente uma classe Ponto que representa um ponto de coordenadas x
    e y. Para esta classe, implemente os métodos que permitem alterar e recuperar as
    coordenadas do ponto (métodos get e set). A classe também deve ser capaz de calcular a
    distância entre dois pontos. Implemente uma classe principal que crie três objetos do
    tipo ponto, modifique os dados dos objetos criados e mostre seus dados.
     */

    private int x;
    private int y;

    public Ponto (int x, int y) {
        this.x = x;
        this.y = y;
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

    public static double calcularDistancia(Ponto p, Ponto q) {

        return Math.sqrt((q.getX() - p.getX()) * (q.getX() - p.getX()) + (q.getY() - p.getY()) * (q.getY() - p.getY()));
    }

    public void imprimirPontos() {
        System.out.println("Coordenada X: " + x);
        System.out.println("Coordenada Y: " + y);
        System.out.println("\n");
    }
}
