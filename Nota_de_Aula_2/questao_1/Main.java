package questao_1;



import java.util.Scanner; // Importa a biblioteca 

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        Compra c = new Compra(); 

        System.out.print("Digite o número de maçãs que serão compradas: "); 
        c.setQuant_maca(sc.nextInt());
        c.calc_maca(); 

        // Exibindo o resultado
        System.out.println("Você comprou "+c.getQuant_maca()+" Maçãs. O total da compra é de: R$" + c.getTotal());
        
    }

}