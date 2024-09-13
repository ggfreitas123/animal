public abstract class Animal {
        private String nome;
        private String Sexo;
        private String raca;

        public Animal(String nome, String Sexo, String raca){
            this.nome = nome;
            this.Sexo = Sexo;
            this.raca = raca;
        }


     
        public abstract void dormir();
        
        public abstract void caminhar();
        
        public abstract void correr();
        
        public abstract void emitirSom();


    
    }
