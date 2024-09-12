public class Main {
    public static void main(String[] args) {

        Banda banda = new Banda("Matue",5);

        Musica m1 = new Musica("4tal","333");
        banda.addMusica(m1);
        Musica m2 = new Musica("Gorila Roxo","Maquina do tempo");
        banda.addMusica(m2);

        banda.tocarMusica(0);
        banda.tocarShow();
        banda.deletarMusica("4tal");
        banda.tocarShow();

    }
}