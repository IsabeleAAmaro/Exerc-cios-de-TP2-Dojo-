package testinho;
/*
import testinho.Animal;
import testinho.Cachorro;
import testinho.Chihuahua;
import testinho.Gato;

//metodo final nao pode ser sobrescrito
// filhas herdam implements
// interface enfraquece relações entre classes e permite o polimorfismo
*/ //só é necessário qnd n ta no msm pacote
// a subclasse tem coisas q a generica nao tem, entao eu n posso chamar um metodo particular de uma subclasse pela mae dela
public class Teste {

    // sobrescrita é só entre relação entre filhos, sobreescrita é a implementação do conceito de polifo
    //polimorfo eh dinamico, sob é estático. eu preciso sobrescrever p/ q ele seja poliformo na execução
    //

    public static void main(String[] args) {
        Animal a2 = new Cachorro();
        Animal a3 = new Gato();
        Cachorro c1 = new Chihuahua();
    }
}
