package aula10_heranca;
public class Pessoa {
    //Atributos
    private String nome;
    private int idade;
    private char sexo;
    
    //Métodos Públicos
    public void fazerAniv(){
        this.setIdade(this.getIdade()+1);
    }
    
    //Métodos Getters(Acessores)
    public String getNome() {
        return this.nome;
    }
    public int getIdade() {
        return this.idade;
    }
    public char getSexo() {
        return this.sexo;
    }
    
    //Métodos Setters(Modificadores)
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    //Métodos Especiais

    @Override
    public String toString() {
        return "Pessoa{ " + "nome: " + nome + " | idade: "
                + idade + " | sexo: " + sexo + '}';
    }
    
}
