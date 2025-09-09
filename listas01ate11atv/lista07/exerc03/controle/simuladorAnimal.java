package listas01ate11atv.lista07.exerc03.controle;

import listas01ate11atv.lista07.exerc03.dominio.tipoAnimal.Cachorro;
import listas01ate11atv.lista07.exerc03.dominio.tipoAnimal.Gato;

public class simuladorAnimal {
    public static void main(String[] args) {
        Gato gato = new Gato("Minnie", 11);
        Cachorro cachorro = new Cachorro("Jolie", 10);

        System.out.println("GATO");
        gato.exibirInfo();
        gato.emitirSom();

        System.out.println("\nCACHORRO");
        cachorro.exibirInfo();
        cachorro.emitirSom();
    }
}
