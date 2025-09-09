package listas01ate11atv.lista07.exerc02.controle;

import listas01ate11atv.lista07.exerc02.dominio.tipoVeiculo.Carro;
import listas01ate11atv.lista07.exerc02.dominio.tipoVeiculo.Moto;

public class simuladorVeiculos {
    public static void main(String[] args) {
        Carro carro = new Carro("Ford","Ford",2000, 4);
        Moto moto = new Moto("Suzuki", "Suzuki", 2000, 1100);

        System.out.println("CARRO");
        carro.exibirCarro();
        System.out.println("\nMOTO");
        moto.exibirMoto();
    }
}
