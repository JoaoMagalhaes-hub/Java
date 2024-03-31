package z;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        produto produto1 = new produto("Calça", 49.99, "Calça polo azul");
        produto produto2 = new produto("Camisa", 99.99, "Camisa Social Preta");


        System.out.println("Escolha o produto: ");
        System.out.println("1 - Calça polo / 2 - Camisa Social / e nada pra retornar a loja");
        int x = sc.nextInt();
        switch (x) {
            case 1:
                System.out.println("Informações do Produto: ");
                System.out.println("Produto: " + produto1.roupa);
                System.out.println("Preço: " + produto1.preco);
                System.out.println("Modelo:  " + produto1.Cor);
                break;
            case 2:
                System.out.println("Informações do Produto: ");
                System.out.println("Produto: " + produto2.roupa);
                System.out.println("Preço: " + produto2.preco);
                System.out.println("Modelo:  " + produto2.Cor);
                break;
            default:
                System.out.println("Opção inválida. Por favor, escolha novamente.");
                break;
        }
    }
}