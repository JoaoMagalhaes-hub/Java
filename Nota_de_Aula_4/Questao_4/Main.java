package Nota_de_Aula_4.Questao_4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Leao leao = new Leao("Mamifero", "Pata","Juba");
    Arara arara = new Arara();

    System.out.println("Informações do leão: ");
    leao.exibirInformacoes();

        System.out.println("Informações da Arara:");
        System.out.println(arara.getClasse());
        System.out.println(arara.getLocomocao());
        System.out.println(arara.getQtdovos());
    }
}