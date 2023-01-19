package aula09_projetolivro;
public class Pessoa {
    //Atributos
    private String nome;
    private int idade;
    private char sexo;
    
    //Construtor
    public Pessoa(String n, int i, char s){
        this.nome = n;
        this.idade = i;
        this.sexo = s;
    }
    
    //Métodos Getters (Acessores)
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public char getSexo(){
        return this.sexo;
    }
    
    //Métodos Setters (Modificadores)
    public void setNome(String n){
        this.nome = n;
    }
    public void setIdade(int i){
        this.idade = i;
    }
    public void setSexo(char s){
        this.sexo = s;
    }
    
    //Métodos Públicos
    public void fazerAniver(){
        this.setIdade(this.getIdade() + 1);
    }
}
