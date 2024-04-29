package Aula_10.Cadastro_Pessoa;

public class PessoaJuridica extends Pessoa {

    private String cnpj;

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString(){
        return "Nome: " + getNome() + ", Idade: " + getIdade() + ", Tipo: Pessoa Jurídica" + cnpj;
    }
}
