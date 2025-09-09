package listas01ate11atv.lista07.exerc03.dominio.tipoAnimal;

import listas01ate11atv.lista07.exerc03.dominio.animal;

public class Gato extends animal {
    public Gato(String nome, int idade){
        super(nome, idade);
    }
    public void emitirSom(){
        System.out.println("Miando...");
    }
}
