package Aula_8.Questao_2;

public class Roupa extends Produto {

    public Roupa (String nome, double preco) { //! Cria o construtor de "Roupa"

        super(nome, preco);

    }

    @Override

    public void precoFinal (){ //* Define a função 'precoFinal'

        System.out.println("Calculando o preço final do produto");
        System.out.println();
        System.out.println("Nome: " + nome + " | Preço: " + preco);
        double pre_final = preco;
        System.out.println("O preço final é de: R$" + pre_final);
        System.out.println();

    }

}