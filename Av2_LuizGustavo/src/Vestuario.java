public class Vestuario extends Item{

    private int tamanho;

    public Vestuario(String nome, double preco, int estoque, int tamanho) {
        super(nome, preco, estoque);
        this.tamanho = tamanho;
    }

    @Override
    void mostraInfo() {
        super.mostraInfo();
        System.out.println("Tamanho: " + tamanho);
    }

    @Override
    public boolean verficarEstoque(int quantidade) {
        return super.verficarEstoque(quantidade);
    }
}
