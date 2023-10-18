import RedesSociais.*;

public class Main {

    public static void main(String[] args) {

        RedeSocial[] RS = new RedeSocial[4];
        RedeSocial rede1 = new Twitter("TTSenha",10);
        RedeSocial rede2 = new Facebook("FbSenha",5);
        RedeSocial rede3 = new Instagram("InSenha",9);
        RedeSocial rede4 = new GooglePlus("GPSenha",20);


        RS[0] = rede1;
        RS[1] = rede2;
        RS[2] = rede3;
        RS[3] = rede4;


        Usuario user1 = new Usuario("Luiz","luizg@gec.inatel.br",RS);

        user1.mostraRedes();


    }
}