public class Pokemon {
    private int numTotalPokemon;
    private int idPokemon;
    private String nome;
    private String[] tipos = new String[2];
    Ataque ataque;

    public Pokemon(String nome, String[] tipos) {
        numTotalPokemon++;
        ataque = new Ataque();
        for (int i = 0; i < tipos.length; i++) {
            this.tipos[i] = tipos[i];
        }
        this.nome = nome;
        this.idPokemon = numTotalPokemon;

    }

    public void atacar(){
        System.out.println("Pokemon "+ this.nome + " esta atacando");
    }
    public void mostraInfo(){
        System.out.println("Pokemon: "+ this.nome);
        System.out.println("Id: "+ this.idPokemon);
        System.out.println("Tipos: ");
        for(int i = 0; i < tipos.length; i++){
            if(tipos[i] != null){
                System.out.println("- " + this.tipos[i]);
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
