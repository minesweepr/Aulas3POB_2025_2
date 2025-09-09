package listas01ate11atv.lista07.exerc01.controle;

import listas01ate11atv.lista07.exerc01.dominio.Funcionario;
import listas01ate11atv.lista07.exerc01.dominio.tipoFuncionario.Estagiario;
import listas01ate11atv.lista07.exerc01.dominio.tipoFuncionario.Gerente;

import java.text.DecimalFormat;

public class sistemaFuncionario {
    public static void main(String[] args) {
        DecimalFormat df=new DecimalFormat("#.00");
        Estagiario estagiario=new Estagiario("Berdly", 50.0);
        Gerente gerente=new Gerente("Alphys", 70.0);
        Funcionario funcionario=new Funcionario("Kris", 60.0);

        System.out.println(estagiario.getNome()+", salario R$"+ df.format(estagiario.calcularSalario()));
        System.out.println(gerente.getNome()+", salario R$"+ df.format(gerente.calcularSalario()));
        System.out.println(funcionario.getNome()+", salario R$"+ df.format(funcionario.calcularSalario()));
    }
}
