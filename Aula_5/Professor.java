package Aula_5;

public class Professor extends Pessoa {

    private int qtdeHoras;

    private double valorHora, salario;

    public int getQtdeHoras() {
        return this.qtdeHoras;
    }

    public void setQtdeHoras(int qtdeHoras) {
        this.qtdeHoras = qtdeHoras;
    }

    public double getValorHora() {
        return this.valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void calc_salario(){
        salario = (qtdeHoras * valorHora);
        System.out.println("O seu salário será " + salario);
     

    }
}

