public class Leao extends Animal{
    public Leao(String nome, String Sexo, String raca) {
        super(nome, Sexo, raca);
    }

    public void dormir(){
        System.out.println("O Leao esta dormindo");
    }
    public void caminhar(){
        System.out.println("O Leao esta caminhando");
    }
    public void correr(){
        System.out.println("O Leao esta correndo");
    }

    public void emitirSom(){
        System.out.println("O Leao rugi");
    }
}
