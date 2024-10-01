package main;

import entidades.produtos.Normal;
import entidades.produtos.Usado;
import entidades.produtos.Importado;
import entidades.produtos.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>();

        System.out.print("Informe a quantidade de produtos: ");
        int N = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < N; i++) {
            System.out.println("Digite o tipo de produto: (normal/importado/usado)");
            String tipo = scanner.nextLine();
            System.out.println("Digite o nome do produto: ");
            String nome = scanner.nextLine();
            System.out.println("Digite o preço do produto: ");
            double preco = scanner.nextDouble();

            switch (tipo.toLowerCase()) {
                case "normal":
                    produtos.add(new Normal(nome, preco));
                    break;
                case "importado":
                    System.out.print("Taxa da Alfândega: ");
                    double taxa = scanner.nextDouble();
                    produtos.add(new Importado(nome, preco, taxa));
                    break;
                case "usado":
                    System.out.println("Data de fabricação:  (dd/mm/aaaa");
                    String data = scanner.nextLine();
                    produtos.add(new Usado(nome, preco, data));
                    break;
                default:
                    System.out.print("Tipo de Produto não cadastrado.");
                    i--;
                    break;
            }
            scanner.nextLine();
        }
        System.out.println("\nEtiqueta de Peço");
        for (Produto produto: produtos){
            System.out.println(produto.etiquetaPreco());
        }
    }
}
