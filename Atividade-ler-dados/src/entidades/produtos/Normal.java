package entidades.produtos;

public  class Normal extends Produto{
    public Normal(String nome, double preco) {
        super(nome, preco);
    }
    @Override
    public String etiquetaPreco(){
        return "\nProduto: " + nome
                + "\nPreço: R$" + String.format("%.2f",preco);
    }
}