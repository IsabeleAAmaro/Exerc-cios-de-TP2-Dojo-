package classes;

public class Retangulo {

    private Ponto p1;
    private Ponto p2;
    private Ponto p3;
    private Ponto p4;

    private int altura;
    private int largura;

    //como seria sem metodo construtor?
    // só chama na main o construtor dos pontos 4 vezes? ??????

    public Retangulo (Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    public int getAltura() {
        if(p1.getY() ==p2.getY()) {
            altura = p1.getY() - p2.getY();
        } else if(p1.getY() == p3.getY()) {
            altura = p1.getY() - p4.getY();
        }
        else if(p1.getY() == p4.getY()) {
            altura = p1.getY() - p2.getY();
        } else {
            altura = 0;
        }

        if(altura < 0) {
            altura *= -1;
        }
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura(){
        if(p1.getY() == p2.getY()) {
            largura = p1.getX() - p2.getX();
        }else if(p1.getY() == p3.getY()) {
            largura = p1.getX() - p3.getX();
        } else if(p1.getY() == p4.getX()) {
            largura = p1.getX() - p4.getX();
        } else {
            altura = 0;
        }

        if(altura < 0) {
            largura *= -1;
        }
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int calcularPerimentro () {
        return (largura * 2) + (altura * 2);
    }

    public int calcularArea() {
        return altura * largura;
    }
}
