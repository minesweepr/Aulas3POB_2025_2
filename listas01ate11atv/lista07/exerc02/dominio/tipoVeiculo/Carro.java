package listas01ate11atv.lista07.exerc02.dominio.tipoVeiculo;

import listas01ate11atv.lista07.exerc02.dominio.veiculo;

public class Carro extends veiculo {
    private int quantidadePortas;
    public Carro(String marca, String modelo, int ano, int  quantidadePortas) {
        super(marca, modelo, ano);
        this.quantidadePortas=quantidadePortas;
    }

    public void exibirCarro(){
        super.exibirDados();
        System.out.println("quantidade de portas: "+quantidadePortas);
    }
}
