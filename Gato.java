public class Gato extends Animal {

    public Gato(String nome, String Sexo, String raca) {
        super(nome, Sexo, raca);
    }

    public void dormir(){
        System.out.println("O gato esta dormindo");
    }
    public void caminhar(){
        System.out.println("O gato esta caminhando");
    }
    public void correr(){
        System.out.println("O gato esta correndo");
    }

    public void emitirSom(){
        System.out.println("O gato mia");
    }
}
