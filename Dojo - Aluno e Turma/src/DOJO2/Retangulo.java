package DOJO2;

public class Retangulo {

    private Reta r1;
    private Reta r2;

    private double altura;
    private double largura;

    public Retangulo (Reta r1, Reta r2) {
        this.r1 = r1;
        this.r2 = r2;
    }
    // nao vamo inicializar o retangulo primeiro
    // primeiro inicializa os 4 pontos, as duas retas com o nome da variavel dos pontos nos argumentos
    // e um retangulo com duas variaveis de Reta no construtor


    public Reta getR1() {
        return r1;
    }

    public void setR1(Reta r1) {
        this.r1 = r1;
    }

    public Reta getR2() {
        return r2;
    }

    public void setR2(Reta r2) {
        this.r2 = r2;
    }

    public double getAltura() {
        if(r1.getTamanho() > r2.getTamanho()) {
            altura = r2.getTamanho();
        }
        else if (r2.getTamanho() > r1.getTamanho()) {
            altura = r1.getTamanho();
        }
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        if(r1.getTamanho() > r2.getTamanho()) {
            largura = r1.getTamanho();
        }
        else if (r2.getTamanho() > r1.getTamanho()) {
            largura = r2.getTamanho();
        }
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double calcularPerimentro () {
        return (largura * 2) + (altura * 2);
    }

    public double calcularArea() {
        return altura * largura;
    }
}
