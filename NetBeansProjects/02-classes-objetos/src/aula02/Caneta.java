
package aula02;
public class Caneta {
    String modelo;
    String cor;
    int carga;
    float ponta;
    boolean tampada;
    
    void status(){
        System.out.println("Cor: " + this.cor);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("Tamanho da ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga + "%");
    }
    void tampar(){
        this.tampada = true;
    }
    
    void destampar(){
        this.tampada = false;
    }
    
    void rabiscar(){
        if(this.tampada==true){
            System.out.println("ERRO! Não posso rabiscar");
        } else {
            System.out.println("Estou rabiscando");
        }
    }
}
