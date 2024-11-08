public class Main {
    public static void main(String[] args) throws EstoqueInsuficienteException, CarrinhoVazioException {
        Item item1 = new Item("a",500,15);
        Item item2 = new Item("b",100,20);

        Carrinho carrinho = new Carrinho();

        try {
            carrinho.adicionarItem(item1,1);
        } catch (EstoqueInsuficienteException e) {
            e.printStackTrace();
        }
        try {
            carrinho.exibirItens();
        } catch (CarrinhoVazioException e) {
             e.printStackTrace();
        }
        try {
            System.out.println(carrinho.calculaTotal());
        } catch (CarrinhoVazioException e) {
            e.printStackTrace();
        }
        try {
            carrinho.adicionarItem(item2,100);
        }catch (EstoqueInsuficienteException e){}

        try {
            carrinho.calculaTotal();
        }catch (CarrinhoVazioException e){}
    }
}