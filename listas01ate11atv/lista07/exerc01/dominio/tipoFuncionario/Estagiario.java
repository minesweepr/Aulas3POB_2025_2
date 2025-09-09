package listas01ate11atv.lista07.exerc01.dominio.tipoFuncionario;

import listas01ate11atv.lista07.exerc01.dominio.Funcionario;

public class Estagiario extends Funcionario {
    public Estagiario(String nome, double salarioBase){
        super(nome, salarioBase);
    }
    public double calcularSalario(){
        return salarioBase*=1.05;
    }
}
