package Aula_5;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Aluno al = new Aluno();
        Professor pr = new Professor();  

        int perg_login;

        System.out.println("Você é Aluno ou professor? (1 para aluno e 2 para professor)");
        perg_login = sc.nextInt();

        switch (perg_login) {
            case 1:
                System.out.println("Digite sua primeira nota");
                al.setNota_1(sc.nextInt());
                System.out.println("Digite sua segunda nota");
                al.setNota_2(sc.nextInt());  
                al.valorMedia();
                              
                break;
            case 2:
                System.out.println("Digite sua quantidade de horas");
                pr.setQtdeHoras(sc.nextInt());
                System.out.println("Digite o valor da hora");
                pr.setValorHora(sc.nextInt());
                pr.calc_salario();
            default:
                break;
        }
    }
}

