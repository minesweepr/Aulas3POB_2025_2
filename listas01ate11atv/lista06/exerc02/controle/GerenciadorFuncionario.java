package listas01ate11atv.lista06.exerc02.controle;

import java.text.DecimalFormat;
import java.util.Scanner;
import listas01ate11atv.lista06.exerc02.dominio.Funcionario;

public class GerenciadorFuncionario {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        DecimalFormat decimal=new DecimalFormat("#.00");

        System.out.print("insira o nome: ");
        String nome=scanner.next();

        System.out.print("insira o salario base: R$");
        double salarioBase=scanner.nextDouble();

        System.out.print("insira a categoria: ");
        String categoria=scanner.next();
        Funcionario funcionario=new Funcionario(nome, salarioBase, categoria);
        
        System.out.println("salario final: R$" + decimal.format(funcionario.calcularSalarioFinal()));
        scanner.close();
    }
}
