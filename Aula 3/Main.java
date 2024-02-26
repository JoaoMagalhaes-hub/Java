public class Main {
    public static void main (String[] args){
    
    Pessoa p = new Pessoa();
    
    System.out.println("Antiga: " + p.idade); 
    p.niver();
    System.out.println("Nova: "+ p.idade);
    System.out.println("Nome: " + p.nome);
    }
    
}
