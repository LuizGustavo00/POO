public class LiderGinasio extends Treinador{
    private String cidadeGinasio;
    private String tipoGinasio;

    public LiderGinasio(String nome, int numPokebolas, int numInsignia, int dinheiro, String cidadeGinasio, String tipoGinasio) {
        super(nome, numPokebolas, numInsignia, dinheiro);
        this.cidadeGinasio = cidadeGinasio;
        this.tipoGinasio = tipoGinasio;
    }

    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Cidade: " + cidadeGinasio + "\nTipo do Ginasio: " + tipoGinasio);
        System.out.println();
    }

}
