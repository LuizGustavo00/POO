package Funcionalidade.Redes;

import Exceções.QuantidadeInsuficiente;
import Exceções.SenhaInvalida;

public abstract class RedeSocial{

    protected String senha;
    protected int numAmigos;

    public RedeSocial(String senha, int numAmigos) throws QuantidadeInsuficiente {
        if (senha.length() < 8) {
            throw new SenhaInvalida("A senha deve conter 8 ou mais dígitos.");
        }
        this.senha = senha;
        if(numAmigos < 0){
            throw new QuantidadeInsuficiente("A quantidade de amigos deve ser maior que zero");
        }
        this.numAmigos = numAmigos;

    }

    public abstract void postarFoto();

    public abstract void postarVideo();

    public abstract void postarComentario();

    public void curtirPublicação(){
        System.out.println("Curtiu uma publicação!");
    }

}
