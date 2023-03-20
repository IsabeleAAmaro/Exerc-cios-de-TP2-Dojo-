package testinho;

public class Retangulo {

    private int base;
    private int altura;

    public Retangulo(int base, int altura) {
        this.setBase(base);
        //
        this.altura = altura;
    }

    public Retangulo(int lado) {
        this(lado, lado);
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
