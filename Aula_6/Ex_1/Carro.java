package Aula_6.Ex_1;

public class Carro {

    // Definindo as características que tem dentro de uma classe
    private String marca;
    private String modelo;
    private int ano;

    // Colocando get e set

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

public Carro (){ // Para cada definição, terá sempre que ser colocada aqui no Carro (Definindo Vazio)
       
    }
public Carro(String marca, String modelo, int ano){ // Definindo construtor com 3 def
    
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
    

    }   
public Carro(String marca, String modelo){ // Definindo construtor com 2 def 
    this.marca = marca;
    this.modelo = modelo;
    }
}
    

