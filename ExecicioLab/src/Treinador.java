import Pokemon.*;

public class Treinador {
    private String nome;
    Pokemon[] pokemons = new Pokemon[3];

    public void monstraInfo(){
        System.out.println("Nome do treinador: "+this.nome);
        System.out.println("Pokemons cadastrados na pokedex: ");
        for (int i = 0; i < pokemons.length; i++) {
            if (pokemons[i] instanceof Pikachu){
                pokemons[i].mostraInfo();
            }
            else if (pokemons[i] instanceof Bulbassaur) {
                pokemons[i].mostraInfo();
            }
            else if (pokemons[i] instanceof Squirtle) {
                pokemons[i].mostraInfo();
            }
        }


    }
    void addPokemon(Pokemon pokemon){
        for (int i = 0; i < pokemons.length; i++) {
            if(pokemons[i] == null){
                pokemons[i] = pokemon;
                break;
            }
        }

    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }
}
