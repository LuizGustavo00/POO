package RedesSociais;

import Interfaces.Compartilhamento;

public class Twitter extends RedeSocial implements Compartilhamento {
    public Twitter(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhando no Twitter");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu uma publicação no Twitter");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentario no Twitter");
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Twitter");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um video no Twitter");
    }
}
