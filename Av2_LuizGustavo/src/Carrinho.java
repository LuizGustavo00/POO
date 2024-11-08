import java.util.ArrayList;

public class Carrinho {
    private ArrayList<Item> carrinhoArray;
    public Carrinho() {
        carrinhoArray = new ArrayList<>();
    }

    public void adicionarItem(Item item, int quantidade) throws EstoqueInsuficienteException {

        if(item.verficarEstoque(quantidade)){
                carrinhoArray.add(item);
        }else{
            throw new EstoqueInsuficienteException("Estoque insuficiente");
        }
    }

    public double calculaTotal() throws CarrinhoVazioException{
        if(carrinhoArray.isEmpty()){
            throw new CarrinhoVazioException("Carrinho vazio");
        }else  {
            double total = 0;
            for(Item item: carrinhoArray){
                total += item.getPreco();
            }
            return total;
        }
    }

    void exibirItens() throws CarrinhoVazioException {
        if(carrinhoArray.isEmpty()){
            throw new CarrinhoVazioException("Carrinho vazio");
        } else{
            for(int i = 0; i < carrinhoArray.size(); i++){
                System.out.println(carrinhoArray.get(i).getNome());
            }
        }
    }

}