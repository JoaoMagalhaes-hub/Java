public class Gato extends Animal implements Corrida {

    public Gato (String nome, int idade, TipoAnimal tipo) { //! Cria o construtor de "Gato"

        super(nome, idade, tipo);

    }

    //? Ajuda no interpretador a usar o método da classe herdada e não criar um método novo
    @Override 

    public void emitirSom() { //* Define a função 'emitirSom'

        System.out.println("Miau");

    }

    public void Correr () { //* Define a função 'Correr'

        System.out.println("Estou correndo rápido");

    }

}