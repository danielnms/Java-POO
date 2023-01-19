package aula13_polimorfismo;
public class Mamifero extends Animal{
    //Atributos
    private String corPele;
    
    //Métodos Sobrepostos/Sobrescritos
    @Override
    public void emitirSom(){
        System.out.println("Som de Mamífero");
    }
    
    //Getters e Setters
    public String getCorPele(){
        return this.corPele;
    }
    public void setCorPele(String c){
        this.corPele = c;
    }
}
