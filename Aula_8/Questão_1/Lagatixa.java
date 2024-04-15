public class Lagatixa extends Animal implements Corrida {
    
    public Lagatixa (String nome, int idade, TipoAnimal tipo) { 

        super(nome, idade, tipo); 

    } 


    @Override 

    public void emitirSom() { 

        System.out.println("Balança a cabeça");

    }

    public void Correr () { 

        System.out.println("Estou correndo rápido rápido rápido");

    }
}

