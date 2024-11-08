public class Item implements AplicarDesconto{
    private String nome;
    private double preco;
    private int estoque;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Item(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public boolean verficarEstoque(int quantidade) {
        if(quantidade > estoque) {
            return false;
        }else
            return true;
    }

    void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Preco: " + preco);
        System.out.println("Estoque: " + estoque);
    }

    @Override
    public double aplicarDesconto(double porcentagem) {
        double x = preco * porcentagem;
        preco -= x;
        return preco;
    }
}
