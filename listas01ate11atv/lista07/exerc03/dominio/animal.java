package listas01ate11atv.lista07.exerc03.dominio;

public class animal {
    protected String nome;
    protected int idade;
    public animal(String nome, int idade){
        this.nome=nome;
        this.idade=idade;
    }

    public void emitirSom(){
        System.out.println("Som genérico de animal");
    }

    public void exibirInfo(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
    }
}
