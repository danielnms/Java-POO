package aula12_polimorfismo;
public class Cachorro extends Mamiferos{
    public void enterrarOsso(){
        System.out.println("Enterrando Osso...");
    }
    public void abanarRabo(){
        System.out.println("Abanando");
    }
    @Override
    public void emitirSom(){
        System.out.println("Au! Au! Au!");
    }
}
