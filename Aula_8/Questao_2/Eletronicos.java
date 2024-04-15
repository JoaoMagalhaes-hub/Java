package Aula_8.Questao_2;

public class Eletronicos extends Produto implements Desconto{

    private int desc_Eletronicos = 5; // Cria variável privada 'desc_Eletronicos'

    public Eletronicos (String nome, double preco) { //! Cria o construtor de "Eletronicos"

        super(nome, preco);

    }

    @Override

    public void por_Desconto() { //* Define a função 'por_Desconto'

        System.out.println("Eletronicos possuem desconto de (%): " + desc_Eletronicos);

    }

    public void precoFinal (){ //* Define a função 'precoFinal'

        System.out.println("Calculando o preço final do produto");
        System.out.println();
        System.out.println("Nome: " + nome + " | Preço: " + preco);

        por_Desconto(); //* Chama a função 'por_Desconto'

        //* Calcula o preço final com o desconto
        double pre_final = preco - (preco * (desc_Eletronicos / 100.0));
        System.out.println("O preço final é de: R$" + pre_final);
        System.out.println();

    }

}