package listas01ate11atv.lista07.exerc02.dominio;

public class veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;
    public veiculo(String marca, String modelo, int ano) {
        this.marca=marca;
        this.modelo=modelo;
        this.ano=ano;
    }

    public void exibirDados(){
        System.out.println("marca: "+marca);
        System.out.println("modelo: "+modelo);
        System.out.println("ano: "+ano);
    }
}
