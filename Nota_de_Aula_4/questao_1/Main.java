package Nota_de_Aula_4.questao_1;

    import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            Professor pf = new Professor("Fernanda",30, 2340.0);
            Aluno al = new Aluno("Saulo", 19, 2445);

            System.out.println("Digite 1 - Para Aluno/ 2 - Para Professor / 3 - Para Sair");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Informações do Aluno:");
                    System.out.println("Nome: " +al.nome);
                    System.out.println("Idade: "+al.idade);
                    System.out.println("Nmr de matrícula: "+al.matricula);
                    break;
                case 2:
                    System.out.println("Informações do Professor:");
                    System.out.println("Nome: "+pf.nome);
                    System.out.println("Idade: "+pf.idade);
                    System.out.println("Salário: "+pf.salario);
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
            }
        }
    }