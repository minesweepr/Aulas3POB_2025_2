package listas01ate11atv.lista04;
import java.text.DecimalFormat;
import java.util.Scanner;

public class exerc02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        DecimalFormat decimal=new DecimalFormat("#.0");
        
        double[] notas=new double[4];
        double media=0;

        for(int i=0;i<notas.length;i++){
            System.out.print("\nAV"+(i+1)+": ");
            notas[i]=scanner.nextDouble();
            media+=notas[i]/4;
        }

        System.out.print("\nmedia: "+decimal.format(media));

        scanner.close();
    }
}
