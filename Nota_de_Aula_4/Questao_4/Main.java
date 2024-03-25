package Nota_de_Aula_4.Questao_4;

public class Main {
    public static void main (String [] args){
        Leao l = new Leao("Mamifero", "Patas", "Juba");
        Arara ar = new Arara();

        System.out.println("Informações do Leão:");
        System.out.println(l.getClasse());

        System.out.println("Informações da Arara:");
        System.out.println(ar.getClasse());
        System.out.println(ar.getLocomocao());
        System.out.println(ar.getQtdedeOvos());
    }
    
}
