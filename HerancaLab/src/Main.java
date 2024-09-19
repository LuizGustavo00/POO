public class Main {
    public static void main(String[] args) {

        Produto[] produtos = new Produto[10];

        produtos [0] = new Notebook("Notebook",1500,1000,"3050","I5");
        produtos [1] = new Camiseta("Camisa", 10,"Verde", "G");
        produtos [2] = new Produto("Geladeira", 5000);

        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] != null) {
                System.out.println(produtos[i].etiquetaPreco());
            }
        }
    }
}