package Aula_1.src;

public class Mainq4 {
    public static void main(String[] args){

        int salario = 3000;

        if (salario <= 900){
            System.out.println("Vc foi isento de IR!");
        } else if ((salario > 901) && (salario <= 1500)) {
            System.out.println("Vc terá um desconto de 5% de IR!");
        } else if ((salario > 1501) && (salario <= 2500)) {
            System.out.println("Vc terá um desconto de 10% de IR!");
        } else {
            System.out.println("Vc terá um desconto de 20% de IR!");
        
        
        } if (salario <= 900){
            System.out.println("Vc foi isento de IR!");
        } else if ((salario > 901) && (salario <= 1500)) {
            int desconto5;
            desconto5 = (salario*100)/5;
            System.out.println("Vc terá um desconto de: "+desconto5);
        } else if ((salario > 1501) && (salario <= 2500)) {
            int desconto5;
            desconto5 = (salario*100)/10;
            System.out.println("Vc terá um desconto de: "+desconto5);
        } else {
            int desconto5;
            desconto5 = (salario*100)/20;
            System.out.println("Vc terá um desconto de: "+desconto5);
        }


    }
}
