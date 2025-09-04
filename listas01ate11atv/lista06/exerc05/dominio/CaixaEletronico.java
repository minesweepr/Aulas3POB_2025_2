package listas01ate11atv.lista06.exerc05.dominio;

import java.text.DecimalFormat;

public class CaixaEletronico {
    private double saldo;

    public CaixaEletronico(double saldo) {
        this.saldo=saldo;
    }

    public void sacar(double valor){
        if(valor<=saldo && valor%10==0){
            saldo-=valor;
            System.out.println("sacado com sucesso");
        } else{
            System.out.println("valor invalido");
        }
    }

    public void exibirSaldo(){
        DecimalFormat df=new DecimalFormat("#.00");
        System.out.println("saldo: R$"+df.format(saldo));
    }
}
