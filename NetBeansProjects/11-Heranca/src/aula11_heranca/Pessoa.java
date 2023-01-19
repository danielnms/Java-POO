package aula11_heranca;
public abstract class Pessoa {
    //Atributos
    protected String nome;
    protected int idade;
    protected char sexo;
    
    //Métodos Públicos
    public void fazerAniv(){
        this.setIdade(this.getIdade() + 1);
    }
    
    //Métodos Getters
    public String getNome() {
        return this.nome;
    }
    public int getIdade() {
        return this.idade;
    }
    public char getSexo() {
        return this.sexo;
    }
    
    //Métodos Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
    
    
}
