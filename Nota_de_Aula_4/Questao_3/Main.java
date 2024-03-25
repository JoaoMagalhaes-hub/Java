package Nota_de_Aula_4.Questao_3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Carro c = new Carro ("Chevrolet", "Ônix", 2022); //
        Carro c1 = new Carro ("Chevrolet", "Cobalt", 2011); // Isso foi um exemplo, mas não deve se fazer um vazio por enquanto
        Carro c2 = new Carro("Fiat", "Uno", 2002);
        Carro c3 = new Carro("Gurgel", "X12", 1976);
        
        System.out.println(c.getMarca()); //Método get para tirar da classe Carro e levar para a Classe principal
        System.out.println(c.getModelo());
        System.out.println(c.getAno());

        System.out.println(c1.getMarca()); //Método get para tirar da classe Carro e levar para a Classe principal
        System.out.println(c1.getModelo());
        System.out.println(c1.getAno());

        System.out.println(c2.getMarca()); //Método get para tirar da classe Carro e levar para a Classe principal
        System.out.println(c2.getModelo());
        System.out.println(c2.getAno());

        System.out.println(c3.getMarca()); //Método get para tirar da classe Carro e levar para a Classe principal
        System.out.println(c3.getModelo());
        System.out.println(c3.getAno());
    }
}

