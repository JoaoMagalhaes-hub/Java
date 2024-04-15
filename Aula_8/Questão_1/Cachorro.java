public class Cachorro extends Animal implements Corrida {

    public Cachorro (String nome, int idade, TipoAnimal tipo) { //! Cria o construtor de "Cachorro"

        super(nome, idade, tipo);

    }

    //? Ajuda no interpretador a usar o método da classe herdada e não criar um método novo
    @Override 

    public void emitirSom() { //* Define a função 'emitirSom'

        System.out.println("Au au");

    }

    public void Correr() { //* Define a função 'Correr'

        System.out.println("Estou correndo lento");

    }

}