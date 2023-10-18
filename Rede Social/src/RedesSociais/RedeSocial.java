package RedesSociais;


public abstract class RedeSocial {
    protected String senha;
    protected int numAmigos;

    public RedeSocial(String senha, int numAmigos){
        this.senha = senha;
        this.numAmigos = numAmigos;
    }

    public void postarFoto(){

    }
    public void postarVideo(){

    }
    public void postarComentario(){

    }
    public void curtirPublicacao(){

    }

}
