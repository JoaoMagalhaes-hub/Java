public class Professor {
    private String nome;
    private int idade;
    private double salario;

    public Professor(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome do Professor: " + nome);
        System.out.println("Idade do Professor: " + idade);
        System.out.println("Salário do Professor: " + salario);
    }

    public static void main(String[] args) {
        Professor professor = new Professor("João", 40, 5000.00);
        professor.mostrarInformacoes();
    }
}

public class Aluno {
    private String nome;
    private int idade;
    private int matricula;

    public Aluno(String nome, int idade, int matricula) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome do Aluno: " + nome);
        System.out.println("Idade do Aluno: " + idade);
        System.out.println("Matrícula do Aluno: " + matricula);
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno("Maria", 20, 12345);
        aluno.mostrarInformacoes();
    }
}