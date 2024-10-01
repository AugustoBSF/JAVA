package entidades.produtos;

public class Importado extends Produto{
private  double taxaAlfandega;
public Importado(String nome, double preco, double taxaAlfandega){
    super(nome, preco);
    this    .taxaAlfandega=taxaAlfandega;
}
    @Override
    public String etiquetaPreco() {
        double precoFinal = preco + taxaAlfandega;
        return "Produtos Importados" + nome + "\nPreço: R$ " + String.format("%.2f",precoFinal)+
                "\nTaxa da Alnfândega é: R$ "+ String.format("%.2f",taxaAlfandega);
    }
}
