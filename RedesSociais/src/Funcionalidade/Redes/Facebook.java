package Funcionalidade.Redes;

import Exceções.QuantidadeInsuficiente;
import Interfaces.Compartilhamento;
import Interfaces.VideoConferencia;

public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento {


    public Facebook(String senha, int numAmigos) throws QuantidadeInsuficiente {
        super(senha, numAmigos);
    }

    @Override
    public void fazStreaming() {
        System.out.println("Fez uma Live no Facebook");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou no facebook");
    }

    @Override
    public void curtirPublicação() {
        System.out.println("Curtiu uma publicação no Facebook");
    }

    @Override
    public void postarComentario() {
        System.out.println("postou um comentario no Facebook");
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Facebook");
    }

    @Override
    public void postarVideo() {
        System.out.println("postou um video no Facebook");
    }
}
