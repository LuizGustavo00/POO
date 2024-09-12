public class Cliente {
    public String nome;
    public long cpf;
    Computador[] computadores = new Computador[10];

    public float calculaTotalCompra(){

        float total = 0;

        for(Computador aux : computadores){
            if(aux != null)
                total += aux.preco;
            else break;
        }
        return total;
    }
}
