package aula11_heranca;
public class Professor extends Pessoa{
    //Atributos
    private String especialidade;
    private float salario;
    
    //Métodos Públicos
    public void receberAum(float sal){
        this.setSalario(this.getSalario()+sal);
    }
    
    //Getters
    public String getEspecialidade() {
        return this.especialidade;
    }
    public float getSalario() {
        return this.salario;
    }
    
    //Setters
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}
