package aula13_polimorfismo;
public abstract class Animal {
    //Atributos
    private float peso;
    private int idade, membros;
    
    //Métodos Abstratos
    public abstract void emitirSom();
    
    //Getters
    public float getPeso(){
        return this.peso;
    }
    public int getIdade(){
        return this.idade;
    }
    public int getMembros(){
        return this.membros;
    }
    
    //Setters
    public void setPeso(float p){
        this.peso = p;
    }
    public void setIdade(int i){
        this.idade = i;
    }
    public void setMembros(int m){
        this.membros = m;
    }
}
