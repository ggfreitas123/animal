public class Cachorro extends Animal{
    public Cachorro(String nome, String Sexo, String raca) {
        super(nome, Sexo, raca);
    }

    public void dormir(){
        System.out.println("O cachorro esta dormindo");
    }
    public void caminhar(){
        System.out.println("O cachorro esta caminhando");
    }
    public void correr(){
        System.out.println("O cachorro esta correndo");
    }

    public void emitirSom(){
        System.out.println("O cachorro late");
    }
}
