package DOJO2;

public class Ponto {

    private double x;
    private double y;

    public Ponto (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double calcularDistancia(Ponto p) {
        return Math.sqrt((this.getX() - p.getX()) * (this.getX() - p.getX()) + (this.getY() - p.getY()) * (this.getY() - p.getY()));
    }

    public void imprimirPontos() {
        System.out.println("Coordenada X: " + x);
        System.out.println("Coordenada Y: " + y);
        System.out.println("\n");
    }
}

