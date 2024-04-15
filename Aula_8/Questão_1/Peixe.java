public class Peixe extends Animal implements Nadar {
    public Peixe (String nome, int idade, TipoAnimal tipo) { 

        super(nome, idade, tipo);

    }


    @Override 

    public void emitirSom() { 

        System.out.println("Glub Glub");

    }

    public void Nadou () { 

        System.out.println("Estou nadando rápido rápido");

    }

}

