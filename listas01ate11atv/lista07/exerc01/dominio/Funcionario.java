package listas01ate11atv.lista07.exerc01.dominio;

public class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase){
        this.nome=nome;
        this.salarioBase=salarioBase;
    }

    public double calcularSalario(){
        return salarioBase;
    }

    public String getNome() {
        return nome;
    }
}
