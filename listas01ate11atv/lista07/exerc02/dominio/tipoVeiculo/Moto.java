package listas01ate11atv.lista07.exerc02.dominio.tipoVeiculo;

import listas01ate11atv.lista07.exerc02.dominio.veiculo;

public class Moto extends veiculo {
    private int cilindradas;
    public Moto(String marca, String modelo, int ano, int cilindradas){
        super(marca, modelo, ano);
        this.cilindradas=cilindradas;
    }

    public void exibirMoto(){
        super.exibirDados();
        System.out.println("cilindradas: "+cilindradas+"cc");
    }
}
