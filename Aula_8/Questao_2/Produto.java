package Aula_8.Questao_2;

public abstract class Produto {  //! Cria a classe abstrata Produto 

    // Cria as variáveis 
        protected String nome;
        protected double preco;

    // Get e set

        public String getNome() {
            return this.nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public double getPreco() {
            return this.preco;
        }

        public void setPreco(double preco) {
            this.preco = preco;
        }

    public Produto (String nome, double preco) {  //* Cria o construtor de 'Produto'

        this.nome = nome;
        this.preco =preco;

    }

    public abstract void precoFinal(); //* Cria função 'emitirSom'

}