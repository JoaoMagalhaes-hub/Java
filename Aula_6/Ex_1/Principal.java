package Aula_6.Ex_1;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){

        Carro c = new Carro ("Chevrolet", "Ônix", 2022); //
        Carro c1 = new Carro();
        Carro c2 = new Carro("Fiat", "Uno", 2002);
        
        Scanner sc = new Scanner(System.in); //Scanner
        
        System.out.println(" Imprimindo o primeiro modelo de carro!");

        System.out.println(c.getMarca()); //Método get para tirar da classe Carro e levar para a Classe principal
        System.out.println(c.getModelo());
        System.out.println(c.getAno());
    }
}