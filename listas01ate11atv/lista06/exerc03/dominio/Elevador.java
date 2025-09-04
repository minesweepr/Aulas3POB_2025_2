package listas01ate11atv.lista06.exerc03.dominio;

public class Elevador {
    private int andarAtual;
    private int andarTotal;

    public Elevador(int andarTotal){
        this.andarAtual=0;
        this.andarTotal=andarTotal;
    }

    public void subir(){
        if(andarAtual<=andarTotal){
            andarAtual++;
            System.out.println("subindo");
        } else{
            System.out.println("voce esta no ultimo andar");
        }
    }

    public void descer(){
        if(andarAtual>0){
            andarAtual--;
            System.out.println("descendo");
        } else{
            System.out.println("voce esta no terreo");
        }
    }

    public void exibirAndar(){
        System.out.println("voce esta no andar "+andarAtual);
    }
}
