package Aula_8.Questao_2;

public class Main {

    public static void main(String[] args) {

        //! Instancia os objetos
            Livro l1 = new Livro("Meditações", 30);
            Eletronicos e1 = new Eletronicos("Ideapad S145", 3200);
            Roupa r1 = new Roupa("Meias", 10);

        //* Chama as funções dos objetos
            l1.precoFinal();
            e1.precoFinal();
            r1.precoFinal();

    }

}