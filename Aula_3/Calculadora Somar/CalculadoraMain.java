import java.util.Scanner;

public class CalculadoraMain {
    public static void main (String[] args){

        Calculadora c = new Calculadora();
        Scanner sc = new Scanner (System.in);

        System.out.print("Número 1: ");
        c.n1 = sc.nextInt();
        System.out.print("Número 2: ");
        c.n2 = sc.nextInt();
        c.somar();
        System.out.print(c.total);

    }    
}
