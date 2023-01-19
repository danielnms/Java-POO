package aula12_polimorfismo;
public class Peixe extends Animal{
    // Atributos de Peixe
    private String corEscama;
    
    // Métodos Sobrescritos
    @Override
    public void locomover(){
        System.out.println("Nadando");
    }
    @Override
    public void alimentar(){
        System.out.println("Comendo Substâncias");
    }
    @Override
    public void emitirSom(){
        System.out.println("Peixe não faz som");
    }
    
    // Métodos Públicos
    public void soltarBolha(){
        System.out.println("Soltou uma Bolha");
    }
    
    // Gettes e Setters
    public String getCorEscama() {
        return this.corEscama;
    }
    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
