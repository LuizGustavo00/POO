import RedesSociais.*;


public class Usuario {
    private String nome;
    private String email;
    public RedeSocial[] redeSociais;

    public Usuario(String nome, String email, RedeSocial[] redeSociais) {
        this.nome = nome;
        this.email = email;
        this.redeSociais = redeSociais;
    }

    public void mostraRedes(){
        for (int i = 0; i < redeSociais.length; i++) {
            if(redeSociais[i] instanceof Twitter) {
                ((Twitter) redeSociais[i]).postarFoto();
                ((Twitter) redeSociais[i]).postarVideo();
                ((Twitter) redeSociais[i]).postarComentario();
                ((Twitter) redeSociais[i]).compartilhar();
                System.out.println();
            }
            else if (redeSociais[i] instanceof Facebook) {
                ((Facebook) redeSociais[i]).postarFoto();
                ((Facebook) redeSociais[i]).postarVideo();
                ((Facebook) redeSociais[i]).postarComentario();
                ((Facebook) redeSociais[i]).fazStreaming();
                System.out.println();
            }
            else if (redeSociais[i] instanceof Instagram) {
                ((Instagram) redeSociais[i]).postarFoto();
                ((Instagram) redeSociais[i]).postarVideo();
                ((Instagram) redeSociais[i]).postarComentario();
                System.out.println();
            }
            else if (redeSociais[i] instanceof GooglePlus) {
                ((GooglePlus) redeSociais[i]).postarFoto();
                ((GooglePlus) redeSociais[i]).postarVideo();
                ((GooglePlus) redeSociais[i]).postarComentario();
                ((GooglePlus) redeSociais[i]).fazStreaming();
                ((GooglePlus) redeSociais[i]).compartilhar();
                System.out.println();
            }

        }

    }

}
