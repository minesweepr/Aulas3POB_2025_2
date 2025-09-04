package listas01ate11atv.lista06.exerc02.dominio;

public class Funcionario {
    private String nome;
    private double salarioBase;
    private String categoria;

    public Funcionario(String nome, double salarioBase, String categoria){
        this.nome=nome;
        this.salarioBase=salarioBase;
        this.categoria=categoria.toUpperCase();
    }

    public double calcularSalarioFinal(){
        switch(categoria){
            case "A":
                salarioBase*=1.20;
                break;
            case "B":
                salarioBase*=1.10;
                break;
            case "C":
                break;
            default:
                System.out.println("categoria invalida.");
        }
        return salarioBase;
    }
}
