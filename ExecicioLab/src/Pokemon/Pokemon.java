package Pokemon;

public abstract class Pokemon {
    public static int qtdPokemon = 1;
    private String nome;
    private String tipo;
    public String heldItem;

    public Pokemon(){
        qtdPokemon++;
    }

    public void mostraInfo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("HeldItem equipado: " + this.heldItem);
        System.out.println();
    }

    public void atacar() {

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setHeldItem(String heldItem) {
        this.heldItem = heldItem;
    }

    public String getHeldItem() {
        return heldItem;
    }
}
