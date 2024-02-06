public class Mainq3 {
    public static void main(String[] args) {

        double nota1 = 70;
        double nota2 = 10;
        double nota3 = 10;
        double media;

        media = (nota1 + nota2 + nota3) / 3;

        if (media >= 70) {
            System.out.println("Parabéns, você passou!");
        } else if ((media > 40) && (media < 70 )) {
            System.out.println(" Você está na final, estude!");
        } else {
            System.out.println(" Você está reprovado!");
        }








    }
}