package Aula_10.Cadastro_Pessoa;

import java.util.ArrayList;

public class CadastroPessoas{
    private ArrayList <Pessoa> pessoas = new ArrayList<>();

    public void cadastrarPessoa(Pessoa p ){

        pessoas.add(p);
        System.out.println("Pessoa cadastrada com sucesso");
    }

        public void listar(){
            for (Pessoa p: pessoas){
                System.out.println(" Nome: " + p.getNome() + " Idade: " + p.getIdade());
            }
    }

    private ArrayList <PessoaFisica> pessoaFisicas = new ArrayList<>();

    public void cadastrarPessoaFisica(PessoaFisica pf){
        pessoaFisicas.add(pf);
        System.out.println("Pessoa cadastrada com sucesso!");
    }

    public void listarFisica(){
        for (PessoaFisica pf : pessoaFisicas){
            System.out.println(pf);
        }
    }

    private ArrayList <PessoaJuridica> pessoasJuridicas = new ArrayList<>();

    public void cadastrarPessoaJuridica(PessoaJuridica pj){
        pessoasJuridicas.add(pj);
        System.out.println("Pessoa cadastrada com sucesso!");
    }

    public void listarJuridica(){
        for (PessoaJuridica pj : pessoasJuridicas){
            System.out.println(pj);
        }
    }

    public void listarPoliformicos(){
        ArrayList<Pessoa> pessoasPolimorficas = new ArrayList<>();

        pessoasPolimorficas.addAll(pessoaFisicas);
        pessoasPolimorficas.addAll(pessoasJuridicas);

        for (Pessoa p : pessoasPolimorficas){
            if (p instanceof PessoaFisica){
                System.out.println(" Nome: " p.getNome() + ", Idade " + p.getIdade() +  "CPF: " + ((PessoaFisica)p.getCpf()));
            } else if (p instanceof PessoaJuridica){
                System.out.println(" Nome: " + p.getNome() + ", Idade" + p.getIdade() + ", CNPJ: " + (PessoaJuridica)p.getCnpj()); 
            } else {
                System.out.println("Nome" + p.getNome() + ", Idade: " + p.getIdade());
            }
        }
    }
}