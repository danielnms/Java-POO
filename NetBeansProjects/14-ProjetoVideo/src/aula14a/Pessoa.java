package aula14a;
public abstract class Pessoa {
    // Atributos
    protected String nome;
    protected char sexo;
    protected int idade, experiencia;
    
    // Método Construtor
    public Pessoa(String n, int i, char s){
        this.setNome(n);
        this.setIdade(i);
        this.setSexo(s);
        this.setExperiencia(0);
    }
    
    // Métodos Getters (Acessores)
    public String getNome(){
        return this.nome;
    }
    public char getSexo(){
        return this.sexo;
    }
    public int getIdade(){
        return this.idade;
    }
    public int getExperiencia(){
        return this.experiencia;
    }
    
    // Métodos Setters (Modificadores)
    public void setNome(String n){
        this.nome = n;
    }
    public void setSexo(char s){
        this.sexo = s;
    }
    public void setIdade(int i){
        this.idade = i;
    }
    public void setExperiencia(int e){
        this.experiencia = e;
    }
    
    // Métodos Públicos
    public void ganharExp(){
        this.setExperiencia(this.getExperiencia()+1);
    }
    
    // Método toString
    @Override
    public String toString(){
        return "[Nome: " + nome + "] [Idade: " + idade
                + "] [Sexo: " + sexo + "] [Experiência: " + experiencia
                + ']';
    }
}
