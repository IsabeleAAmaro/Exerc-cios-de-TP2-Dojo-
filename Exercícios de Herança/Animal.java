package testinho;

public abstract class Animal {
    // a vantagem é não ter que implementar métodos inúteis na classe que seria abstrata, só pra poder sobrescrever
    //é melhor para arquivos compartilhados (?), boas práticas and such
    //
    protected String nome;
    public abstract void emiteSom();
}
