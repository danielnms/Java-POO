package aula12_polimorfismo;
public class Aula12_Polimorfismo {
    public static void main(String[] args) {
        // Animal a = new Animal(); 
        Cachorro k = new Cachorro();
        Canguru c = new Canguru();
        Peixe p = new Peixe();
        Cobra cb = new Cobra();
        
        k.locomover();
        k.emitirSom();
        cb.emitirSom();
    }
    
}
