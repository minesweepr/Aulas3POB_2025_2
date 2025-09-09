package listas01ate11atv.lista07.exerc03.dominio.tipoAnimal;

import listas01ate11atv.lista07.exerc03.dominio.animal;

public class Cachorro extends animal {
    public Cachorro(String nome, int idade){
        super(nome, idade);
    }
    public void emitirSom(){
        System.out.println("Latindo...");
    }
}
