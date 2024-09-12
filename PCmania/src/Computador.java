public class Computador {
    public String marca;
    public float preco;
    MemoriaUSB memUSB;
    SistemaOperacional sisOp;
    HardwareBasico[] harBas;

    public Computador() {
        sisOp = new SistemaOperacional();
        memUSB = new MemoriaUSB();
        harBas = new HardwareBasico[3];

        for (int i = 0; i < harBas.length; i++) {
            harBas[i] = new HardwareBasico();
        }
    }

    public void mostraPCConfig(){
        System.out.println("Marca: " + marca);
        System.out.printf("Preco: R$ %.2f%n", preco);
        System.out.println("Processador: " + harBas[0].nome + "("+harBas[0].capacidade+" Mhz)");
        System.out.println("Memoria RAM: " + harBas[1].capacidade + " Gb");
        System.out.print("Memoria: "+ harBas[2].capacidade);
        if(harBas[2].capacidade == 500){
            System.out.println(" Gb");
        }else
            System.out.println(" Tb");
        System.out.println("Sistema Operacional: " + sisOp.nome + " ("+sisOp.tipo+" bits)");
        System.out.print("Acompanha " + memUSB.nome + " de "+ memUSB.capacidade);
        if(memUSB.capacidade == 1){
            System.out.println(" Tb");
        }else
            System.out.println(" Gb");
    }

    public void addMemoriaUSB(MemoriaUSB musb){
        this.memUSB = musb;
    }
}
