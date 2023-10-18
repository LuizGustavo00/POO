package RedesSociais;

import Interfaces.Compartilhamento;
import Interfaces.VideoConferencia;

public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento {

    public GooglePlus(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void fazStreaming() {
        System.out.println("Fazendo live no GooglePlus");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhando no GooglePlus");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu uma publicação no GooglePlus");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentario no GooglePlus");
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no GooglePlus");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um video no GooglePlus");
    }
}
