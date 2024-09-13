public class Lobo extends Animal {
    public Lobo (String nome, String Sexo, String raca) {
        super(nome, Sexo, raca);
    }

    public void dormir(){
        System.out.println("O lobo esta dormindo");
    }
    public void caminhar(){
        System.out.println("O lobo esta caminhando");
    }
    public void correr(){
        System.out.println("O lobo esta correndo");
    }

    public void emitirSom(){
        System.out.println("O lobo uiva");
    }
}
