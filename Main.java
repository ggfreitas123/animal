public class Main {
    public static void main(String[] args) {
        Lobo Lobo = new Lobo("Claudio","nao identificado","Da floresta");
        Lobo.dormir();
        Lobo.caminhar();
        Lobo.correr();
        Lobo.emitirSom();

        System.out.println("-------------------------------------");
        Leao Leao = new Leao("Igor","masculino","Savana");
        Leao.dormir();
        Leao.caminhar();
        Leao.correr();
        Leao.emitirSom();

        System.out.println("-------------------------------------");
        Cachorro dog = new Cachorro("pinaple", "Femea", "caramelo");
        dog.dormir();
        dog.caminhar();
        dog.correr();
        dog.emitirSom();

        System.out.println("-------------------------------------");

        Tigre tigre = new Tigre ("tiger","masculino", "Branco");
        tigre.dormir();
        tigre.caminhar();
        tigre.correr();
        tigre.emitirSom();

        System.out.println("-------------------------------------");
        Gato gato = new Gato ("Francis", "macho","Persa");
        gato.dormir();
        gato.caminhar();
        gato.correr();
        gato.emitirSom();





    
    }

}
