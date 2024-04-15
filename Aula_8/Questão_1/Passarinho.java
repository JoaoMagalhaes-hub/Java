public class Passarinho extends Animal implements Voar {

    public Passarinho (String nome, int idade, TipoAnimal tipo) { //! Cria o construtor de "Passarinho"

        super(nome, idade, tipo);

    }

    //? Ajuda no interpretador a usar o método da classe herdada e não criar um método novo
    @Override

    public void emitirSom () { //* Define a função 'emitirSom'

        System.out.println("Pru pru");

    }

    public void Voou () { //* Define a função 'Voou'

        System.out.println("Estou voando baixo");

    }

}