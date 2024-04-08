package Nota_de_Aula_4.Questao_4;

public class Animal {
    String classe;
    String locomocao;

    public Animal(String classe, String especie){
        this.classe = classe;
        this.locomocao = especie;
    }
}

 class Leao extends Animal {
     private String pelo;

    public Leao(String classe, String locomocao, String pelo) {
        super(classe, locomocao);
        this.pelo = pelo;
    }

    public void exibirInformacoes() {
        System.out.println("Classe: " + classe);
        System.out.println("Locomoção: " + locomocao);
        System.out.println("Pelo: " + pelo);
    }
}