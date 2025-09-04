package listas01ate11atv.lista06.exerc01.dominio;
import java.text.DecimalFormat;

public class ContaBancaria {
    DecimalFormat decimal=new DecimalFormat("#.00");
    private String titular;
    private double saldo;
    
    public ContaBancaria(String titular){
        this.titular=titular;
        this.saldo=0;
    }

    public void depositar(double valor){
        saldo+=valor;
        System.out.println("deposito de R$"+decimal.format(valor)+" realizado com sucesso");
    }

    public void sacar(double valor){
        if(valor<=saldo){
            saldo-=valor;
            System.out.println("saque de R$"+decimal.format(valor)+" realizado com sucesso");
        } else{
            System.out.println("saldo insuficiente");
        }
    }

    public void exibirSaldo(){
        System.out.println("seu saldo atual é R$"+decimal.format(saldo));
    }
}
