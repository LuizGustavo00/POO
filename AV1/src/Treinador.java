public class Treinador {
    private String nome;
    private int numPokebolas;
    private int numInsignia;
    private int dinheiro;
    Pokemon[] time;
    Pokemon pokemon;

    public Treinador(String nome, int numPokebolas, int numInsignia, int dinheiro) {
        time = new Pokemon[5];
        this.nome = nome;
        this.numPokebolas = numPokebolas;
        this.numInsignia = numInsignia;
        this.dinheiro = dinheiro;
    }

    public void compraPokebola(int quantidade){
        float total;
        total = quantidade * 100;
        if(total < dinheiro){
            dinheiro -= (int) total;
            numPokebolas += quantidade;
            System.out.println("Treinador "+ this.nome + " agora tem " + this.numPokebolas + " pokebolas e "+ this.dinheiro +" de dinheiro");
            System.out.println();
        }else {
            System.out.println("O custo de "+ quantidade +" Pokebolas é de: R$ " + total);
            System.out.println("Treinador " + this.nome + " não possui dinheiro suficiente!!");
            System.out.println();
        }

    }
    public void lutar (Treinador oponente, int posTimeTreinador, int posTimeOponente){
        time[posTimeTreinador].atacar();
        oponente.time[posTimeOponente].atacar();

        if(oponente instanceof LiderGinasio){
            this.numInsignia ++;
        }

        System.out.println("A luta acabou! ");
        System.out.println();
    }
    public void capturarPokemon(Pokemon pokemon){
        for(int i = 0; i < time.length; i++){
            if(time[i] == null){
                time[i] = pokemon;
                break;
            }
        }
    }
    public void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Num Pokebolas: " + numPokebolas);
        System.out.println("Num Insignia: " + numInsignia);
        System.out.println("Dinheiro: R$: " + dinheiro);
        System.out.println("Time de Pokemons: ");
        for(int i = 0; i < time.length; i++){
            if(time[i] != null){
                System.out.println("- "+time[i].getNome());
            }
        }

        System.out.println();
    }
}
