package aula11_heranca;
public class Aluno extends Pessoa{
    //Atributos
    private int matricula;
    private String curso;
    
    //Métodos Públicos
    public void pagarMens(){
        System.out.println("Pagando mensalidade do aluno " + this.nome);
    }
    
    //Getters
    public int getMatricula() {
        return this.matricula;
    }
    public String getCurso() {
        return this.curso;
    }
    
    //Setters
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
