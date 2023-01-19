package aula12_polimorfismo;
public class Mamiferos extends Animal{
    //Atributos
    private String corPele;
    
    //Métodos Sobrescritos
    @Override
    public void locomover(){
        System.out.println("Correndo!");
    }
    @Override
    public void alimentar(){
        System.out.println("Mamando");
    }
    @Override
    public void emitirSom(){
        System.out.println("Som de Mamífero");
    }
    
    // Gettes e Setters
    public String getCorPele() {
        return this.corPele;
    }
    public void setCorPele(String corPele) {
        this.corPele = corPele;
    }
    
}
