public class Main {
    public static void main(String[] args) {
        //Treinador 1
        Pokemon pikachu = new Pokemon("Pikachu", new String[]{"Elétrico", "Nenhum"});
        Pokemon charmander = new Pokemon("Charmander", new String[]{"Fogo", "Nenhum"});
        Pokemon squirtle = new Pokemon("Squirtle", new String[]{"Água", "Nenhum"});

        //Treinador 2
        Pokemon bulbasaur = new Pokemon("Bulbasaur", new String[]{"Grama", "Veneno"});
        Pokemon eevee = new Pokemon("Eevee", new String[]{"Normal", "Nenhum"});
        Pokemon jigglypuff = new Pokemon("Jigglypuff", new String[]{"Fada", "Normal"});

        Treinador treinador1 = new Treinador("Ash",10,2,1000);
        treinador1.capturarPokemon(pikachu);
        treinador1.capturarPokemon(charmander);
        treinador1.capturarPokemon(squirtle);

        LiderGinasio treinador2 = new LiderGinasio("Misty",7,5,2000,"Kanto","Fogo");
        treinador2.capturarPokemon(bulbasaur);
        treinador2.capturarPokemon(eevee);
        treinador2.capturarPokemon(jigglypuff);

        treinador1.mostraInfo();
        treinador2.mostraInfo();

        treinador1.compraPokebola(11);
        treinador2.compraPokebola(11);

        treinador1.lutar(treinador2,1,1);

        treinador1.mostraInfo();
        treinador2.mostraInfo();
    }
}