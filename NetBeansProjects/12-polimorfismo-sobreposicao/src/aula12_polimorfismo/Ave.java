package aula12_polimorfismo;
public class Ave extends Animal{
    // Atributos de Ave
    private String corPena;
    
    // Métodos Sobrescritos
    @Override
    public void locomover(){
        System.out.println("Voando");
    }
    @Override
    public void alimentar(){
        System.out.println("Comendo Frutas");
    }
    @Override
    public void emitirSom(){
        System.out.println("Som de Ave");
    }
    
    // Método Público
    public void fazerNinho(){
        System.out.println("Fazendo um Ninho...");
    }
    
    // Getters e Setters
    public String getCorPena() {
        return this.corPena;
    }
    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
}
