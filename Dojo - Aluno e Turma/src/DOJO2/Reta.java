package DOJO2;

public class Reta {

    private Ponto p1;
    private Ponto p2;
    private double tamanho;

    public Reta(Ponto p1, Ponto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Ponto getP1() {
        return p1;
    }

    public void setP1(Ponto p1) {
        this.p1 = p1;
    }

    public Ponto getP2() {
        return p2;
    }

    public void setP2(Ponto p2) {
        this.p2 = p2;
    }

    public double calcularTamanhoReta(Ponto p2) {
        return tamanho = Math.sqrt((this.p1.getX() - p2.getX()) * (this.p1.getX() - p2.getX()) + (this.p1.getY() - p2.getY()) * (this.p1.getY() - p2.getY()));
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getTamanho() {
        return tamanho;
    }
}
