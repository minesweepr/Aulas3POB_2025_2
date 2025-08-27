package exercsaula;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SalarioEmpregados{
    public static void main (String[] args){
        Scanner scanner=new Scanner(System.in);
        DecimalFormat formatacao=new DecimalFormat("#.00");
        
        int[] matricula;
        double[] salario;
        
        System.out.print("Digite a quantidade de empregados: ");
        int quant=scanner.nextInt();
        
        matricula=new int[quant];
        salario=new double[quant];
        
        for(int i=0;i<quant;i++){
            System.out.println("-----EMPREGADO "+ (i+1)+"-----");
            System.out.print("Matricula: ");
            matricula[i]=scanner.nextInt();
            System.out.print("Salario: R$");
            salario[i]=scanner.nextDouble();
        }
        
        System.out.println("\nRESULTADOS");
        for(int i=0;i<quant;i++){
            double ajuste=(i%2== 0)?0.95:1.09;
            salario[i]*=ajuste;
             System.out.println("ID: "+i+"; MATRICULA: "+matricula[i]+"; SALARIO MODIFICADO: R$"+formatacao.format(salario[i]));
        }
        
        scanner.close();
    }
}
