public class Tigre extends Animal{
    public Tigre(String nome, String Sexo, String raca) {
        super(nome, Sexo, raca);
    }

    public void dormir(){
        System.out.println("O tigre esta dormindo");
    }
    public void caminhar(){
        System.out.println("O tigre esta caminhando");
    }
    public void correr(){
        System.out.println("O tigre esta correndo");
    }

    public void emitirSom(){
        System.out.println("O tigre rugi");
    }
}

