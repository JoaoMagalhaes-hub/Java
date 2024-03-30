public class Produto {
    private String nome;
    private double preco;
    private String descricao;

    public Produto(String nome, double preco, String descricao) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome do Produto: " + nome);
        System.out.println("Preço do Produto: R$" + preco);
        System.out.println("Descrição do Produto: " + descricao);
    }

    public static void main(String[] args) {
        Produto produto1 = new Produto("Camisa", 49.99, "Camisa azul");
        Produto produto2 = new Produto("Calça", 99.99, "Calça jeans cinza");

        System.out.println("Informações do Produto 1:");
        produto1.mostrarInformacoes();

        System.out.println("\nInformações do Produto 2:");
        produto2.mostrarInformacoes();
    }
}