public class Main {

    public static void main(String[] args) {

        // Instancia os objetos 
            Cachorro c = new Cachorro("Billy", 14, TipoAnimal.MAMIFERO);
            Gato g = new Gato("Mila", 8,  TipoAnimal.MAMIFERO);
            Passarinho p = new Passarinho("Adamastor", 10, TipoAnimal.AVE);
            Sapo s = new Sapo("Crazy frog", 97, TipoAnimal.ANFIBIO);
            Peixe pe = new Peixe("Pexe", 200, TipoAnimal.PEIXE);

        // Imprime as informações

            System.out.println("Imprimindo as informações: ");
            System.out.println();
            System.out.print("Animal: Cachorro, Nome: " + c.nome + " , Idade: " + c.idade + " , Status: ");
            c.Correr();
            System.out.print("Animal: Gato, Nome: " + g.nome + " , Idade: " + g.idade + " , Status: ");
            g.Correr();
            System.out.print("Animal: Pássaro, Nome: " + p.nome + " , Idade: " + p.idade + " , Status: ");
            p.Voou();
            System.out.print("Animal: Sapo, Nome: " + s.nome + " , Idade: " + s.idade + " , Status: ");
            s.Correr();
            System.out.print("Animal: Peixe Nome: " + pe.nome + " , Idade: " + pe.idade + " , Status: ");    
            pe.Nadou();

            Animal a1 = new Cachorro("Billy", 13 , TipoAnimal.MAMIFERO);
            a1.emitirSom();
            a1.emitirComer();
            ((Cachorro)a1).Correr();

            Animal a2 = new Gato("Mila", 8,  TipoAnimal.MAMIFERO);
            a2.emitirSom();
            a2.emitirComer();
            ((Gato)a2).Correr();

            Animal a3 = new Passarinho("Adamastor", 10, TipoAnimal.AVE);
            a3.emitirSom();
            a3.emitirComer();
            ((Passarinho)a3).Voou();

            Animal a4 = new Sapo("Crazy frog", 97, TipoAnimal.ANFIBIO);
            a4.emitirSom();
            a4.emitirComer();
            ((Sapo)a4).Correr();

            Animal a5 = new Peixe("Pexe", 200, TipoAnimal.PEIXE);
            a5.emitirSom();
            a5.emitirComer();
            ((Peixe)a5).Nadou();

    }

}