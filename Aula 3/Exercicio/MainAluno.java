import java.util.Scanner;
public class MainAluno {
    public static void main (String[] args){

        Scanner sc =  new Scanner(System.in);
        Aluno a = new Aluno();

        System.out.println("Digite seu nome");
        a.nome = sc.nextLine();

        System.out.print("Digite a primeira nota!");
        a.nota1 = sc.nextDouble();

        System.out.print("Digite sua segunda nota!");
        a.nota2 = sc.nextDouble();

        System.out.print("Digite sua terceira nota!");
        a.nota3 = sc.nextDouble();
        double media = (a.nota1 + a.nota2 + a.nota3)/3;

        System.out.print("Su nome é  " + a.nome + " Sua média é ." + media);

        if (media >= 7){
            System.out.print(" Parabéns, você passou de ano!");
        } else { 
            System.out.print(" Você é burro, ficou na final");
        } 

    }
}





