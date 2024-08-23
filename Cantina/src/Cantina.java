public class Cantina {
    String nome;
    Salgado salgado[] = new Salgado[3];


    void addSalgado(Salgado novoSalgado) {
        for(int i = 0; i < salgado.length; i++){
            if(salgado[i] == null){
                salgado[i] = novoSalgado;
                break;
            }
        }

    }
    void mostraInfo(){
        for(int i = 0; i < salgado.length; i++){
            if(salgado[i] != null){
                System.out.println(salgado[i].nome);
            }
        }
    }
}
