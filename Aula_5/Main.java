package Aula_5;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in); //Scanner 
        Aluno al = new Aluno(); // Variavel aluno
        Professor pr = new Professor();  // Variavel professor

        int perg_login;

        System.out.println("Você é Aluno ou professor? (1 para aluno e 2 para professor)"); //Porta de entrad do switch e encaminhar
        perg_login = sc.nextInt();

        switch (perg_login) {
            case 1:
                System.out.println("Digite sua primeira nota"); // Nota 1 
                al.setNota_1(sc.nextInt());
                System.out.println("Digite sua segunda nota"); // Nota 2
                al.setNota_2(sc.nextInt());  
                al.valorMedia(); // Imprimir o valor da média
                              
                break;
            case 2:
                System.out.println("Digite sua quantidade de horas"); // Quantidade  de horas
                pr.setQtdeHoras(sc.nextInt());
                System.out.println("Digite o valor da hora"); // Valor da hora
                pr.setValorHora(sc.nextInt());
                pr.calc_salario(); // Imprimir o valor da quantidade e do valor
            default:
                break;
        }
    }
}

