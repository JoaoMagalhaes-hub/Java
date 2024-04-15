public abstract class Animal { //! Cria a classe abstrata Animal 

    // Cria variáveis 
        protected String nome;
        protected int idade;
        protected final TipoAnimal tipo;

    public Animal (String nome, int idade, TipoAnimal tipo) { //* Cria o construtor de 'Animal'

        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;

    }

    // Get e Set

        public String getNome() {
            return this.nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getIdade() {
            return this.idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }
        
        public TipoAnimal getTipo() {
            return this.tipo;
        }

    public abstract void emitirSom(); //* Cria função 'emitirSom'

}