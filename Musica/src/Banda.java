public class Banda {

    private String nome;
    private int numeroIntegrantes;
    private Musica[] musicas;

    public Banda(String nome, int numeroIntegrantes) {
        this.nome = nome;
        this.numeroIntegrantes = numeroIntegrantes;
        this.musicas = new Musica[10];
    }

    public void tocarMusica(int pos){
        System.out.println("Tocando agora: "+musicas[pos].getNome() + " do album "+musicas[pos].getAlbum());
        System.out.println();
    }
    public void tocarShow(){
        System.out.println("O show da banda "+ this.nome +" contará com as seguintes musicas: ");
        for(int i = 0 ; i < musicas.length ; i++){
            if(musicas[i] != null){
                System.out.println(musicas[i].getNome() + " do album " + musicas[i].getAlbum());
            }
        }
        System.out.println();
    }
    public boolean addMusica(Musica musica){
        boolean x = false;
        for(int i = 0; i < musicas.length; i++){
            if(musicas[i] == null){
                musicas[i] = musica;
                x = true;
                break;
            }
        }
        return x;
    }

    public boolean deletarMusica(String nome){
        boolean x = false;
        for (int i = 0; i < musicas.length; i++){
            if(musicas[i].getNome().equals(nome)){
                musicas[i] = null;
                System.out.println("A musica "+ nome + " foi deletada com sucesso!" );
                x = true;
                break;
            }
        }
        return x;
    }

}
