package entidades.produtos;

public class Usado extends Produto {
    private String data;
    public Usado(String nome, double preco, String data) {
        super(nome, preco);
}
@Override
public String etiquetaPreco(){
    return "Produto Usado: "+ nome + "\nPreço: R$" + String.format("%.2f",preco)
    +"\nData de Fabricação: " + data;}
}