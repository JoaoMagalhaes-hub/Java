import java.util.Scanner;
public class Aula_2_2 {
    public static void main(String[] args){

        String r;
        Scanner sc = new Scanner (System.in);
        do {
            System.out.println("Caso escolha 1: Compra blusa, Caso  valor de compra");
            int x = sc.nextInt();
                System.out.println("Caso escolha...");
                switch (x) {
                    case 1:
                        System.out.println("Ótima escolha!");
                        break;
                    case 2:
                        System.out.println("O valor da blusa é 2,00");
                        break;
                    default:
                        System.out.println("Sua escolha é errada!");
                }
                System.out.print("Para ver novamente, digite S. Se não, digite N!");
                r = sc.next();
                if (r.equalsIgnoreCase("N")){
                    break;
                }
            }   while (true);
        }
    }