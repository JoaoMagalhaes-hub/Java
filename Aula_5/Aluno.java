package Aula_5;

public class Aluno extends Pessoa {

    private double nota_1, nota_2, media;

    public double getNota_1() {
        return this.nota_1;
    }

    public void setNota_1(double nota_1) {
        this.nota_1 = nota_1;
    }

    public double getNota_2() {
        return this.nota_2;
    }

    public void setNota_2(double nota_2) {
        this.nota_2 = nota_2;
    }

    public double getMedia() {
        return this.media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public void valorMedia(){
        media = (nota_1 + nota_2)/2;
        System.out.println("Sua media foi" + media );
    }
}
