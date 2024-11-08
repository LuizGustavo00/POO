public class Alimento extends Item{
    private String validade;

    public Alimento(String nome, double preco, int estoque, String validade) {
        super(nome, preco, estoque);
        this.validade = validade;
    }

    @Override
    void mostraInfo() {
        super.mostraInfo();
        System.out.println("Validade: " + validade);
    }

    @Override
    public boolean verficarEstoque(int quantidade) {
        return super.verficarEstoque(quantidade);
    }
}
