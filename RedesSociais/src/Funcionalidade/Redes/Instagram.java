package Funcionalidade.Redes;

import Exceções.QuantidadeInsuficiente;

public class Instagram extends RedeSocial {


    public Instagram(String senha, int numAmigos) throws QuantidadeInsuficiente {
        super(senha, numAmigos);
    }

    @Override
    public void curtirPublicação() {
        System.out.println("Curtiu uma publicação no Instagram");
    }

    @Override
    public void postarComentario() {
        System.out.println("postou um comentario no Instagram");
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Instagram");
    }

    @Override
    public void postarVideo() {
        System.out.println("postou um video no Instagram");
    }
}
