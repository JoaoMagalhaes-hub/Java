package Aula_10.Cadastro_Pessoa;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Pessoa p = new Pessoa();
        CadastroPessoas cp = new CadastroPessoas();
        PessoaFisica pessoaFisica = new PessoaFisica();
        PessoaJuridica pessoaJuridica = new PessoaJuridica();

        System.out.println("Digite o nome da pessoa a ser cadastrada: ");
        p.setNome(sc.next());

        System.out.println("Digite a idade da pessoa a ser cadastrada:");
        p.setIdade(sc.nextInt());

        
        System.out.println("Digite o nome da pessoa física: ");
        pessoaFisica.setNome(sc.next());

        System.out.println("Digite a idade da pessoa física: ");
        pessoaFisica.setIdade(sc.nextInt());


        System.out.println("Digite o nome da pessoa jurídica: ");
        pessoaJuridica.setNome(sc.next());

        System.out.println("Digite a idade da pessoa jurídica: ");
        pessoaJuridica.setIdade(sc.nextInt());

        
        cp.cadastrarPessoa(pessoaFisica);
        System.out.println(pessoaFisica.toString());
        cp.cadastrarPessoa(pessoaJuridica);
        System.out.println(pessoaJuridica.toString());
        cp.cadastrarPessoa(p);
        cp.listar();
        sc.close();
    }
}