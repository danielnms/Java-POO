package aula10_heranca;
public class Aluno extends Pessoa{
    //Atributos
    private int matricula;
    private String curso;
    
    //Métodos Públicos
    public void cancelarMatr(){
        System.out.println("Matricula Cancelada");
    }
    
    //Métodos Getters(Acessores)
    public int getMatricula() {
        return this.matricula;
    }
    public String getCurso() {
        return this.curso;
    }
    
    //Métodos Setters(Modificadores)
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
}
