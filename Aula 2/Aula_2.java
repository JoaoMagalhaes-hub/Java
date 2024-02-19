package Aula_2.src;
public class Aula_2 {
    public static void main(String[] args){

        int x= 1;
        int repetir = 0;
        do{
            System.out.println("Caso escolha...");
        switch(x) {
            case 0:
                System.out.println("Opção 0 escolhida!");
                break;
            case 1:
                System.out.println("Opção 1 escolhida!");
                break;
            case 2:
                System.out.println("Opção 2 escolhida!");
                break;
            default:
                System.out.println("Opção inválida!");
            }
        }while(repetir==0);
    }
}

