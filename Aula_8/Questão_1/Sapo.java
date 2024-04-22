public class Sapo extends Animal implements Corrida , Nadar {

    public Sapo (String nome, int idade, TipoAnimal tipo) { 

        super(nome, idade, tipo);

    }


    @Override 

    public void emitirSom() { 

        System.out.println("Uebeti");

    }

    public void Correr() {

        System.out.println("Estou correndo lento");

    }

    public void Nadou() { 

        System.out.println("Estou nadando rápido");

    }

    public void emitirComer(){
        
        System.out.println(" Estou comendo!");
    }
}